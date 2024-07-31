import java.lang.*;
import java.util.*;
class ArrayDequeue_demo
{
	public static void main(String args[])
	{
		// let us use it like a stack LIFO
		ArrayDeque<Integer> stack  = new ArrayDeque<>();
		
		stack.offerLast(3);
		stack.offerLast(4);
		stack.offerLast(5);
		stack.offerLast(6);
		stack.offerLast(7);
		stack.offerLast(8);
		
		// printing
		System.out.println("\nDeque as Stack\n");
		for(var x: stack)
		{
			System.out.print(x+" ");
		}
		
		// peek
		
		System.out.println("The top most element : "+stack.peekLast());
		
		// removing the top 3 element
		
		System.out.println("Removed element: " +stack.pollLast());
		System.out.println("Removed element: " +stack.pollLast());
		System.out.println("Removed element: " +stack.pollLast());
		
		// printing the stack again
		System.out.println("\n");
		for(Iterator<Integer> iter = stack.iterator(); iter.hasNext();)
		{
			System.out.print(iter.next()+" ");
			
		}
		System.out.println("\n");
		
		// Now ArrayDeque as Queue FIFO
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		
		queue.offerLast(4);
		queue.offerLast(5);
		queue.offerLast(6);
		queue.offerLast(7);
		queue.offerLast(8);
		queue.offerLast(9);
		
		// iteration using for each loop
		System.out.println("\nThe queue is : \n");
		for(var x : queue)
		{
			System.out.print(x + " ");
			
		}
		System.out.println("\n");
		
		// peeking at the first element
		
		System.out.println("The first element is : " +queue.peekFirst());
		
		// Removing the first element
		System.out.println("The deleted element is : "+ queue.pollFirst());
		System.out.println("The deleted element is : "+ queue.pollFirst());
		System.out.println("The deleted element is : "+ queue.pollFirst());
		// using iterator to print the Queue
		
		System.out.println("\n");
		for(Iterator<Integer> iter = queue.iterator();iter.hasNext();)
		{
			System.out.print(iter.next()+" ");
		}
		
		
		
	}
}