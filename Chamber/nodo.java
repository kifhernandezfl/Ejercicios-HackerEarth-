package chamber;

public class nodo 
{
    int value;
    int id;
    
    nodo next = null; 

    public nodo() {}

    public nodo(int value, int id)
    {
        this.value = value;
        this.id = id;
    }

    public String toString()
    {
            return "" + this.value + "\t" + this.id + "\n";
    }
    
    public nodo clone()
    {
        nodo temp = new nodo(this.value, this.id);
        return temp;
    }
}