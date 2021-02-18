import java.util.ArrayList;

class ArmstrongNumBetweenRange
{
	public int[] armstrongNumbersInRange(int min,int max)
	{
		int[] list;
		ArrayList<Integer> raw= new ArrayList<Integer>();
		for(int i=min+1;i<max;i++)
		{
			int num=i,sum=0,temp=i;
			while(num>0)
			{
				int a=num%10;
				sum=sum+a*a*a;
				num=num/10;
			}
			if(temp==sum)
			{
				raw.add(sum);
			}
		}
			list =new int[raw.size()];
			for(int i=0;i<raw.size();i++)
			{
				list[i]=raw.get(i);
			}
			return list;
			
		
	}
}

public class Assignment1Q2 {
public static void main(String args[])
{
	int min=100;
	int max=990;
	ArmstrongNumBetweenRange getlist=new ArmstrongNumBetweenRange();
	int [] list=getlist.armstrongNumbersInRange(min, max);
	
	for(int i=0;i<list.length;i++)
	{
		System.out.println(list[i] + "");
	}
}

}
