import java.lang.*;
import java.util.*;
class LinkedList_demo
{
	public static void main(String args[])
	{
		LinkedList<Integer>list = new LinkedList<>(List.of(2,3,4,5,6,7));
		list.add(5);
		
		
		// adding another linked list to it
		LinkedList<Integer>list2 = new LinkedList<>(List.of(10,20,30));
		
		list.addAll(2,list2);
		System.out.println(list);
		
		//add first and add last
		list.addFirst(0);
		list.addLast(100);
		System.out.println(list);
		// adding at a particular index
		
		list.add(1,43);
		System.out.println(list);
		
		// setting the third element to -99
		list.set(2,-99);
		System.out.println(list);
		//get first
		System.out.println(list.getFirst());
		//getlast
		
		System.out.println(list.getLast());
		
		//peek
		System.out.println(list.peek());
		
		//peek first
		System.out.println(list.peekFirst());
		// peek last
		
		System.out.println(list.peekLast());
		
		// remove first
		
		System.out.println(list.removeFirst());
		
		// remove last
		System.out.println(list.removeLast());
		
		// printling using for loop
		
		System.out.println("FOR:\n");
		
		for(int i = 0;i<list.size();i++)
		{
			System.out.print(list.get(i) + " ");
		}
		
		// Using for each loop
		
		System.out.println("\n");
		
		System.out.println("For each : \n");
		
		for(Integer x: list)
		{
			System.out.print(x + " ");
		}
		System.out.println("\n");
		
		// using var
		
		for(var x : list)
		{
			System.out.print(x + " ");
		}
		System.out.println("\n");
		//using while loop and iterator
		System.out.println("while and iterator: \n");
		
		Iterator<Integer>it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("\n");
		
		// For and ListIterator
		
		for(ListIterator<Integer> iter = list.listIterator();iter.hasNext();)
		{
			System.out.print(iter.next()+ " ");
		}
		System.out.println("\n");
		
	}
}