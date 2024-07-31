import java.lang.*;
import java.util.*;
class MyCom  implements Comparator<Integer>
{
	public int compare(Integer o1, Integer o2)
	{
		if(o1<o2) return 1;
		if(o1>o2) return -1;
		return 0;
	}
}
class MaxPriorityQueue_demo
{
	
	public static void main(String args[])
	{
		PriorityQueue<Integer> maxPQ = new PriorityQueue<>(new MyCom());
		
		// insertion
		maxPQ.add(3);
		maxPQ.add(4);
		maxPQ.add(5);
		maxPQ.add(6);
		maxPQ.add(7);
		maxPQ.add(8);
		
		// peeking at the root element which is the max element
		
		int root = maxPQ.peek();
		
		System.out.println("\n The root element is: " +root);
		// deleting element from the priority queue
		
		System.out.println("\nThe deleted element: "+ maxPQ.poll());
		System.out.println("\nThe deleted element: "+ maxPQ.poll());
		
		// again peek
		
		root = maxPQ.peek();
		System.out.println("The root element is: "+maxPQ.peek());
		
		// iteration
		
		System.out.println("The elements of the max priority queue are: \n");
		for(var x: maxPQ)
		{
			System.out.print(x + " ");
		}
		
		
	}
	
}