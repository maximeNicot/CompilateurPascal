grammar Pascal;

@header {
import java.util.*;
}

@parser::members {
    private ArrayList<Instruction> pcode;
    private HashMap<String,Integer> table;

    public  Instruction[] lire() throws Exception {
        pcode = new ArrayList<Instruction>();
        table = new HashMap<String,Integer>();
        program();
        return pcode.toArray(new Instruction[]{});
    }
}

program : declaration
{ pcode.add(new Instruction.INC(table.size()));}
'begin' instructions 'end.'
    {
        pcode.add(new Instruction.HLT());
    }
;

declaration : 'var' (ID
    {
        table.put($ID.text,table.size());
    }

',')* ID
    {
        table.put($ID.text,table.size());
    }
':' 'integer';

instructions : (instruction ';')* instruction ;

instruction : 'read' '(' ID ')'
    {
        pcode.add(new Instruction.LDA(table.get($ID.text)));
        pcode.add(new Instruction.INN());
        pcode.add(new Instruction.STO());
    }
|
    'write' '(' ID ')'
    {
        pcode.add(new Instruction.LDA(table.get($ID.text)));
        pcode.add(new Instruction.LDV());
        pcode.add(new Instruction.PRN());
    };

ID :[a-z]+;
WS : [ \r\t\n]+ -> skip;