

package pizzastacks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class PizzaStacks {

   
    public static void main(String[] args) {
        
        // create your data structures
        Queue<String> pizzaQueue = new LinkedList<String>(); // create queue that will store strings
        
        Stack<String> pizzaStack = new Stack<String>(); // create a stack that will store strings
        
        String[] pizzaArray = new String[5]; // Creating a new Array of Size 5
        
        // Use Scanner to get user input and enqueue pizzas to the Queue (remember this is a FIFO data structure)
        
        Scanner pizzaScan = new Scanner(System.in);
        
        System.out.println("Type in the name of a pizza e.g. Margherita");
        
        String pizza1 = pizzaScan.nextLine();
        
        pizzaQueue.add(pizza1);
        
        System.out.println("Type in the name of a pizza e.g. Margherita");
        
        String pizza2 = pizzaScan.nextLine();
        
        pizzaQueue.add(pizza2);
        
        System.out.println("Type in the name of a pizza e.g. Margherita");
        
        String pizza3 = pizzaScan.nextLine();
        
        pizzaQueue.add(pizza3);
        
        System.out.println("Type in the name of a pizza e.g. Margherita");
        
        String pizza4 = pizzaScan.nextLine();
        
        pizzaQueue.add(pizza4);
        
        System.out.println("Type in the name of a pizza e.g. Margherita");
        
        String pizza5 = pizzaScan.nextLine();
        
        pizzaQueue.add(pizza5);
       
        // output the contents of the Queue
        
        System.out.println(pizzaQueue);
        
        
        // dequeue each pizza from the queue and add to Stack (remember this is a LIFO data structure)
        
        
        pizzaStack.push(pizzaQueue.remove());
        
        pizzaStack.push(pizzaQueue.remove());
         
        pizzaStack.push(pizzaQueue.remove());
        
        pizzaStack.push(pizzaQueue.remove());
         
        pizzaStack.push(pizzaQueue.remove());
        
        // is there a more efficient way of doing this?
        
        System.out.println(pizzaStack);
        
        
        // pop the elements from the stack into an array
        
        pizzaArray [0] = pizzaStack.pop();
        
        pizzaArray [1] = pizzaStack.pop();
        
        pizzaArray [2] = pizzaStack.pop();
        
        pizzaArray [3] = pizzaStack.pop();
        
        pizzaArray [4] = pizzaStack.pop();
        
        // output the contents of the array
        
        System.out.println(Arrays.toString(pizzaArray));
        
        
        
    }

}
