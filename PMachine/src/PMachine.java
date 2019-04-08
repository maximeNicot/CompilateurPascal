public class PMachine {
    Instruction pcode[];
    int mem[] = new int[1000];
    int SP = 0;
    int PC = 0;
    boolean run = false;


    public PMachine(Instruction[] pcode) {
        this.pcode = pcode;
    }

    public void exec() {
        run = true;
        while(run)
            pcode[PC].exec(this);

    }

    public String toString() {
        StringBuffer res = new StringBuffer();
        for (int i=0; i< pcode.length; i++)
            res.append(i + "\t" + pcode[i] +"\n");
        return res.toString();
    }
}
