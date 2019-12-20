package DAC;

public class professor {

    String name;
    int[] codes;
    int id = 0;

    public professor() {
        this.name = "Viterbo";
        this.codes = new int[30];
    }
    
    public void addCode(int toAdd)
    {
        codes[id] = toAdd;
        ++id;
    }

}
