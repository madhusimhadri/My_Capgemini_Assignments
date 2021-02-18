import java.util.Arrays;
import java.util.List;

//Q8. Create a new thread that prints the numbers from the list. Use class Thread & interface Consumer

public class Assignment4Q8 
{
	public static void main(String args[])
	{
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	new Thread(()->list.forEach(n-> System.out.println(n))).start();
	}

}
