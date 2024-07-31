import java.lang.*;
import java.util.*;
class Set_demo
{
	public static void main(String args[])
	{
		// Hashset demo
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(10);
		// It is unordered and duplicates are not allowed
		
		System.out.println(set1);
		
		// Tree set , always sorted
		
		TreeSet<Integer> treeSet = new TreeSet<>(List.of(100,90,80,70,60,80));
		System.out.println(treeSet);
		
	}
}
