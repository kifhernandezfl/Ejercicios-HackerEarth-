package globet;
import java.util.*;

public class Globet 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int instructions = sc.nextInt();
        String order = "";
        String [] parts = new String[3];
        Lista lista = new Lista();
        int count = 0;
        
        for (int i = 0; i <= instructions; i++) 
        {
            order = sc.nextLine();
            if(order.startsWith("E"))
            {
                parts = order.split("\\s+");
                int x = Integer.valueOf(parts[1]);
                //System.out.println(x);
                int y = Integer.valueOf(parts[2]);
                //System.out.println(y);
                lista.insertAtEnd(new nodo(x,y));
            }
            if(order.startsWith("er"))
            {
                count ++;
            }
            System.out.println(count);
            
        }
        lista.quickSort(lista);
        lista.printList(instructions - count);
    }
}
