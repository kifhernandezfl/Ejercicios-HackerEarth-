package philosophers;
import java.io.*;

public class Lista 
{
    nodo head = null;

    public boolean isEmpty()
    {
        return head == null ? true : false;
    }

    public void printList()
    {	
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        nodo temp = head;

        try
        {   
            while(temp!=null)
            {
                bw.write(temp.toString());
                temp=temp.next;
            }
            bw.flush();
        }
        catch(Exception ex) {ex.printStackTrace();}
    }

    public void  insertAtEnd(nodo newnodo)
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

    public void deleteAtBegin()
    {
        nodo temp = head;
        head = head.next;
        temp = null;
        System.gc();
    }
    
    public void deleteAtEnd()
    {
        nodo temp = head;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;       
    }
    
    public int length() // tamaño de la lista
	{
		int counter = 0;
		nodo temp = head;
		
		while(temp != null)
		{
			counter += 1;
			temp = temp.next;
		}
		
		return counter;
	}
}