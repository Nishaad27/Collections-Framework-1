import java.lang.*;
import java.util.*;
class PriorityQueue_demo
{
	public static void main(String args[])
	{
		// priority queue as min Heap
		
		PriorityQueue<Integer> minPQ = new PriorityQueue<>();
		
		// inserting elements
		
		minPQ.add(10);
		minPQ.add(20);
		minPQ.add(7);
		minPQ.add(30);
		minPQ.add(12);
		minPQ.add(9);
		minPQ.add(5);
		minPQ.add(3);
		
		/*
		  Peeking at the topmost element which is smallest here
		*/
		
		int root = minPQ.peek();
		
		System.out.println("Root element: " + root);
		
		// Deletion
		
		System.out.println("Deleted element: " + minPQ.poll());
		System.out.println("Deleted element: " + minPQ.poll());
		System.out.println("Deleted element: " + minPQ.poll());
		
		// again peek
		
		root = minPQ.peek();
		System.out.println("Root element: "+ root);
		
		// ietertaion using for each
		System.out.println("\n");
		for(var x : minPQ)
		{
			System.out.print(x+" ");
		}
		
		System.out.println("\n");
		
	}
}