import java.lang.*;
import java.util.*;
class Point implements Comparable
{
	int x;
	int y;
	public Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return " X = " + x + " Y = "+y;
	}
	public int compareTo(Object o)
	{
		Point p = (Point)o;
		if(this.x < p.x)return -1;
		else if(this.x>p.x) return 1;
		else
		{
			if(this.y<p.y) return -1;
			else if(this.y>p.y) return 1;
			else return 0;
		}
	}
	
}
class Comparable_demo
{
	public static void main(String args[])
	{
		TreeSet<Point> treeSet = new TreeSet<Point>();
		treeSet.add(new Point(1,2));
		treeSet.add(new Point(2,1));
		treeSet.add(new Point(1,1));
		treeSet.add(new Point(2,3));
		
		System.out.println(treeSet);
		
		
	}
}
