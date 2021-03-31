import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;



public class Assignment3Q8b
{
public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer>list)
{
	@SuppressWarnings("rawtypes")
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		Integer n=(Integer)itr.next();
		System.out.println(n);
		if(n==8)
		{
			list.add(20);
			//System.out.println(n);
		}
	}
	return list;
	
}
public static void main(String args[])
{
	CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<Integer>(new Integer[] {1,3,5,8});
	failFast(list);
}

}
