grammar Pascal;

@header {
import java.util.*;
}

@parser::members {
    private ArrayList<Instruction> pcode;
    private TableSymboles table;
    private Boolean pasderreur;


    public  Instruction[] lire() throws Exception {
        pcode = new ArrayList<Instruction>();
        table = new TableSymboles();
        program();
        pasderreur = false;
        return pcode.toArray(new Instruction[]{});
    }
}

program : declarations
{ pcode.add(new Instruction.INC(table.size));}
'begin' instructions 'end.'
    {
        pcode.add(new Instruction.HLT());
    }
;

declarations: declaration (';'declaration)*;
declaration : 'var' ID
    {
        ArrayList<String> liste=new ArrayList<String>();
        liste.add($ID.text);
    }

(',' ID
    {
        liste.add($ID.text);
    })*
':' typi{
    for(String id:liste){
        table.put(id,$typi.type);
    }
};

typi returns[Type type]:
'integer'{$type=new Type.MyInt();}
|'array' '[' INT']''of' typi{
    $type=new Type.MyTab($INT.int,$typi.type);
}
|'boolean'{$type= new Type.MyBoolean();}
|'type'  typi{} (';' typi)* 'end'
; // ici mettre record et boolean?

instructions : (instruction ';')* instruction
|'begin'(instruction ';')* instruction 'end';

instruction  returns[Type type]: 'read' '(' variable ')'
    {
        $type=$variable.type;
        pcode.add(new Instruction.INN());
        pcode.add(new Instruction.STO());
    }
    |
    'write' '(' expression ')'
    {
        $type=$expression.type;
        pcode.add(new Instruction.PRN());
    }
    |
      variable ':=' expression
        {
            pcode.add(new Instruction.STO());
        }
    |
     'if'expression
        {
            int ligneBZE=pcode.size();
            pcode.add(new Instruction.BZE(0));
        }
     'then'instructions
        {
            Instruction.BZE bze=(Instruction.BZE) pcode.get(ligneBZE);
            bze.setParam(pcode.size());
        }
        ({
            int ligneBRN=pcode.size();
            pcode.add(new Instruction.BRN(0));
            bze.setParam(pcode.size());
        }'else' instructions
        {
            Instruction.BRN brn=(Instruction.BRN) pcode.get(ligneBRN);
            brn.setParam(pcode.size());

        })?
     |
     {int ligneBRN=pcode.size();}
     'while' expression 'do'
     {
        int ligneBZE=pcode.size();
        pcode.add(new Instruction.BZE(0));
     }
     instructions
     {
        pcode.add(new Instruction.BRN(ligneBRN));
        Instruction.BZE bze=(Instruction.BZE) pcode.get(ligneBZE);
        bze.setParam(pcode.size());
     }
     |
     {int ligneBRN=pcode.size();}
     'repeat' instruction (';' instruction)* // pas bon
     {
        pcode.add(new Instruction.BRN(ligneBRN));
        Instruction.BZE bze=(Instruction.BZE) pcode.get(ligneBZE);
        bze.setParam(pcode.size());
     }
     'until' expression
     {
        int ligneBZE=pcode.size();
        pcode.add(new Instruction.BZE(0));
     }
     |
     {int ligneBRN=pcode.size();}
     'for' ID ':=' expression
        (('to' expression 'do'  //faut INC +1?
            {
                int ligneBZE=pcode.size();
                pcode.add(new Instruction.BZE(0));
            }
            instructions
            {
                pcode.add(new Instruction.BRN(ligneBRN));
                Instruction.BZE bze=(Instruction.BZE) pcode.get(ligneBZE);
                bze.setParam(pcode.size());
            })
        |
        ('downto' expression 'do' //faut INC -1?
            {
                int ligneBZE=pcode.size();
                pcode.add(new Instruction.BZE(0));
            }
            instructions
            {
                pcode.add(new Instruction.BRN(ligneBRN));
                Instruction.BZE bze=(Instruction.BZE) pcode.get(ligneBZE);
                bze.setParam(pcode.size());
            }))

    ;

simpleexpression returns[Type type]:
    ('-'term
    {
        $type=$term.type;
        pcode.add(new Instruction.LDI(-1));
        pcode.add(new Instruction.MUL());
    }
    |'+'term|term)
    ('+'term
    {
        pcode.add(new Instruction.ADD());
    }
    |
    '-'term
        {
            pcode.add(new Instruction.SUB());
        }
    )*;

expression returns[Type type]:simpleexpression{$type=$simpleexpression.type;}
    |
    simpleexpression '=' simpleexpression
    {
        pcode.add(new Instruction.EQL());
    }
    |
    simpleexpression '<>' simpleexpression
    {
        pcode.add(new Instruction.NEQ());
    }
    |
    simpleexpression '<' simpleexpression
    {
        pcode.add(new Instruction.LSS());
    }
    |
    simpleexpression '>' simpleexpression
    {
        pcode.add(new Instruction.GTR());
    }
    |
    simpleexpression '<=' simpleexpression
    {
        pcode.add(new Instruction.LEQ());
    }
    |
    simpleexpression '>=' simpleexpression
    {
        pcode.add(new Instruction.GEQ());
    }
    |
    simpleexpression 'in' simpleexpression
    {

    }
    ; // manque in

variable returns[Type type]:ID
 {      Donnee d=table.getDonnee($ID.text); //Data
        Type t=d.getType();
        $type=t;
        pcode.add(new Instruction.LDA(d.getAdresse()));
    }
    ('['expression{ //pour les MyTab
        t=((Type.MyTab)t).getType();
        $type=t;
        pcode.add(new Instruction.LDI(t.size()));
        pcode.add(new Instruction.MUL());
        pcode.add(new Instruction.ADD());

    }']')*;

factor returns[Type type]:INT
    {
        pcode.add(new Instruction.LDI($INT.int));
        $type=new Type.MyInt();
    }
|variable
    {

        pcode.add(new Instruction.LDV());

        $type=$variable.type;
    }
|'('expression')'{
    $type=$expression.type;
};

term returns[Type type]:factor
{
    $type=$factor.type;
} ('*'factor{pcode.add(new Instruction.MUL());}
|'/'factor{pcode.add(new Instruction.DIV());}
|'div'factor{pcode.add(new Instruction.DIV());}

)*; // ici mettre mod et /\



ID :[a-z]+;
WS :[ \r\t\n]+ -> skip;
INT :[0-9]+;