package askaban;

public class nodo 
{
    int value;

    nodo next = null; 

    public nodo() {}

    public nodo(int value)
    {
        this.value = value;
    }

    public String toString()
    {
            return "" + this.value + "\n";
    }
}