import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment3Q2 
{
	public static void main(String args[])
	{
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		System.out.println("Ordered:LinkedHashSet");
		ordered(lhs);
		System.out.println("Unordered:HashSet");
		unordered(hs);
		
		
	}
	
	public static LinkedHashSet<String> ordered(LinkedHashSet<String> linkedHashSet)
	{
		
		Iterator<String> i= linkedHashSet.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		return linkedHashSet;
		
	
	}
	
	public static HashSet<String> unordered(HashSet<String> hashSet)
	{
		
		
		Iterator<String> i=hashSet.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		return hashSet;
		
	}
	
	
}
