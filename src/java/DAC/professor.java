package DAC;

public class professor {

    String name;
    int[] codes;
    int _id;

    public professor() {
        this.name = "Viterbo";
        this.codes = new int[30];
        this._id = 0;
    }
    
    public void addCode(int toAdd)
    {
        this.codes[_id] = toAdd;
        ++this._id;
    }
    
    public int getId()
    {
        return this._id;
    }

}
