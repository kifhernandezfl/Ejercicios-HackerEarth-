package philosophers;
import java.io.*;
import java.util.*;

public class Philosophers 
{
    public static void main(String[] args) throws IOException
    {
        Lista lista = new Lista(); Lista aux = new Lista();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        int monedas = 0, valor = 0, orders = 0, result = 0;
        
        String order = "";
        monedas = Integer.parseInt(br.readLine());
        //System.out.println(monedas);
        
        for(int i = 0; i < monedas; i++)
        {  
            valor = scan.nextInt();
            //System.out.println("moneda: " + valor);
            lista.insertAtEnd(new nodo(valor));
        }
        lista.printList();
        
        orders = scan.nextInt();
        System.out.println(orders);
        result = scan.nextInt();
        System.out.println(result);
        nodo temp = lista.head;
        
        for(int j = 0; j < orders; j++)
        {
            order = br.readLine();
            //System.out.println(order);
            if(order.startsWith("Harry"))
            {
                aux.insertAtEnd(temp);
                lista.deleteAtBegin();
            }else
            {
                aux.deleteAtEnd();
            }
        }
        lista.printList();
        aux.printList();
    }
}
