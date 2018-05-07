package chamber;
import java.io.*;

public class Queue 
{
    nodo head = null;

    public boolean isEmpty()
    {
        return head == null ? true : false;
    }

    public void  Enqueue(nodo newnodo)
    {
        if(isEmpty())
            head = newnodo;
        else
        {
            nodo temp = head;

            while(temp.next != null)
                temp = temp.next;
            
            temp.next = newnodo;
        }
    }

    public void Dequeue()
    {
        nodo temp = head;
        head = head.next;
        //String info = temp.toString();
        temp = null;
        System.gc();
        
    }
    
    public String Peek()
    {
        nodo temp = head;
        String info = temp.toString();	
        return info;	
    }
    
    /*public void printQueue()
    {	
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try
        {  
            while(!isEmpty())
                bw.write(Peek());
                Dequeue();
            bw.flush();
        }
        catch(Exception ex) {ex.printStackTrace();}
    }*/
}