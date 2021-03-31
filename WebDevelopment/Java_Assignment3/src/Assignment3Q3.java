
import java.util.*;

public class Assignment3Q3
{
	public static <T> List<T> traverseReverse(List<T> list)
	{
		List<T> reverse= new ArrayList<>(list);
		Collections.reverse(reverse);
		return reverse;
	}
	
	public static void main(String args[])
	{
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		List<Integer> reverse= traverseReverse(list);
		System.out.println(reverse);
		
	}
	
}


/*
import java.util.*;

class ReverseArrayList
{
	public ArrayList<Integer> reverse(ArrayList<Integer>alist)
	{
		ArrayList<Integer> reverse =new ArrayList<Integer>();
		for(int i=alist.size()-1;i>=0;i--)
		{
			reverse.add(alist.get(i));
		}
		return reverse;
	}
	
	public void printElements(ArrayList<Integer> alist)
	{
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i) +" ");
		}
	}
	
}


public class Assignment3Q3
{
	@SuppressWarnings("deprecation")
	public static void main(String args[])
	{
		ReverseArrayList obj=new ReverseArrayList();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		al=obj.reverse(al);
		obj.printElements(al);
	}
	
}
*/