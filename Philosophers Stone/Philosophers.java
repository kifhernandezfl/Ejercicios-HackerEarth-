package philosophers;
import java.io.*;
import java.util.*;

public class Philosophers 
{
    public static void main(String[] args) throws IOException
    {
        Lista list = new Lista();
        Stack pila = new Stack();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        int monedas = 0, valor = 0, instructions = 0, result = 0;
        String order = "";
        
        monedas = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < monedas; i++)
        {
            valor = scan.nextInt();
            pila.Push(new nodo(valor));
        }
        
        instructions = scan.nextInt();
        result = scan.nextInt();
        
        for (int i = 0; i <= instructions; i++) 
        {
            order = scan.nextLine();
            if(order.startsWith("Harry"))
                list.insertAtEnd(new nodo(pila.Pop()));
            if(order.startsWith("remove"))
                list.deleteAtBegin();
        }
        
        //list.printList(); 
        //System.out.println("\n");
        System.out.println(list.length());
    }

}
