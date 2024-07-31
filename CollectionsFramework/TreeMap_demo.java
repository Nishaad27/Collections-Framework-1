import java.lang.*;
import java.util.*;
import java.util.Map.*;
class TreeMap_demo
{
	public static void main(String args[])
	{
		TreeMap<String,Integer> map = new TreeMap<>(Map.of("a",1,"b",2));
		// using put method
		map.put("c",3);
		map.put("d",4);
		// printing the map
		
		System.out.println(map);
		
		// contains_key
		
		boolean flag = map.containsKey("d");
		
		if(flag == true)
		{
			System.out.println("The key is present ");
		}
		else
		{
			System.out.println("The key is not present ");
		}
		
		// using get method
		
		int val = map.get("c");
		System.out.println("The value is :" + val);
		
		// First Entry
		
		Entry<String,Integer> e = map.firstEntry();
		
		System.out.println(e);
		
		//  printing using for each loop
		
		for( Entry<String,Integer>entry : map.entrySet())
		{
			System.out.println(entry);
		}
		
		// Alternatively using getvalue and getkey
		
		for(Entry<String,Integer>entry : map.entrySet())
		{
			String str = entry.getKey();
			val = entry.getValue();
			System.out.println(str+" : "+val);
		}
	}
}