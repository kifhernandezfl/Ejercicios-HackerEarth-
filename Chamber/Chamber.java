package chamber;
import java.util.*;

public class Chamber 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int spyders = scan.nextInt();
        int selection = scan.nextInt();
        int value = 0;
        int [] array = new int[spyders];
        Lista aux = new Lista();
        Queue cola = new Queue();
        
        for(int i = 0; i < spyders; i++)
        {
            value = scan.nextInt();
            cola.Enqueue(new nodo(value,i + 1));
        }
        
       
       
       
    }
}
