package askaban;
import java.io.*;

public class Stack 
{
    nodo head = null;

    public boolean isEmpty()
    {
        return head == null ? true : false;
    }

    public void Push(nodo newnodo)
    {
        newnodo.next = head;
        head = newnodo;
    }

    public int Pop()
    {
        nodo temp = head;
        head = head.next;
        int info = temp.value;
        temp=null;
        System.gc();
        return info;
    }

    public String Peek()
    {
        nodo temp = head;
        String info = temp.toString();	
        return info;
    }

    public void printStack()
    {	
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try
        {  
            while(!isEmpty())
                bw.write(Pop());
            bw.flush();
        }
        catch(Exception ex) {ex.printStackTrace();}
    }
}