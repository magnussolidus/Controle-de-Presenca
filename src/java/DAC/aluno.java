package DAC;

public class aluno {

    String name;
    int[] code;

    public aluno(String name) {
        this.name = name;
        this.code = new int[30];
        
        for(int i=0; i<30; i++)
        {
            code[i] = -1; // computando como falta;
        }
    }
    
    public void addCode(int toAdd, int id)
    {
        this.code[id] = toAdd;
    }

}
