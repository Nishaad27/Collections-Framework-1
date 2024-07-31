import java.lang.*;
import java.util.*;
class HashMap_demo
{
	public static void main(String args[])
	{
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		// put method
		
		map.put("A",1);
		map.put("B",2);
		map.put("C",3);
		map.put("D",4);
		
		System.out.println(map);
		
		// get method
		int v = map.get("B");
		
		System.out.println(v);
		
	    // contains key 
		
		boolean flag = map.containsKey("F");
		
		if(flag == true)
		{
			System.out.println("The key is present");
		}
		else
		{
			System.out.println("The key is absent");
			
		}
		
		// entry set
		
		for(Map.Entry<String,Integer> entry: map.entrySet())
		{
			String str = entry.getKey();
			
			int value = entry.getValue();
			
			System.out.println(str + " : "+value);
		}
	}
}