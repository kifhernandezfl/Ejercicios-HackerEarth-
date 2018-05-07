package askaban;
import java.util.*;

public class Askaban 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] array = new int[size];
        int [] array1 = new int[size];
        Stack stack = new Stack();
        nodo temp = stack.head;
        
        for(int i = 0; i < size; i++)
        {
            array[i] = scan.nextInt();
            stack.Push(new nodo(array[i]));  
        }
        //stack.printStack();
    }
}
