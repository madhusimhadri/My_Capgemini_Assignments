import java.util.*;

class SearchArray
{
	public boolean searchArray(int[] arr,int toCheckValue)
	{
		for(int n:arr)
		{
			if(toCheckValue==n)
			{
				return true;
			}
		}
		return false;
	}
}


public class Assignment1Q7 
{
	public static void main(String args[])
	{
		int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner s=new Scanner(System.in);
		System.out.println("Value to be searched");
		int valueToCheck=s.nextInt();
		SearchArray search=new SearchArray();
		boolean res=search.searchArray(arr, valueToCheck);
		System.out.println(res + " ");
		s.close();
		
		
		
	}

}
