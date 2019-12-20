package DAC;

public class aluno {

    String name;
    boolean[] code;

    public aluno(String name) {
        this.name = name;
        this.code = new boolean[30];
        
        for(int i=0; i<30; i++)
        {
            code[i] = false; // computando como falta;
        }
    }
    
    public void addCode(boolean toAdd, int id)
    {
        this.code[id] = toAdd;
    }
    
    public boolean[] getCode()
    {
        return this.code;
    }

    public String getName()
    {
        return this.name;
    }
    
    public int getPresence()
    {
        int _t = 0;
        for(boolean c:code)
            if(c)
                ++_t;
        
        return _t;
    }
}
