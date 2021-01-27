import java.util.Scanner;
class ArmstrongOrNot
{
	public boolean armstrongCheck(int n)
	{
		int sum=0,a,temp;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			sum=sum+(a*a*a);
		}
		if(temp==sum)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
}

public class Assignment1Q1 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArmstrongOrNot check=new ArmstrongOrNot();
		boolean res=check.armstrongCheck(n);
		System.out.println(res);
		s.close();
	}

}
