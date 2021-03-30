import java.util.*;
class SiCi
{
	public double simpleInterest(double principalAmount,int time,double interestRate)
	{
		double si;
		si=(principalAmount*time*interestRate)/100;
		return si;
	}
	public double compoundInterest(double principalAmount,int time,double interestRate)
	{
		double ci;
		ci=principalAmount* Math.pow(1.0 +interestRate/100.0,time)-principalAmount;
		return ci;
	}
	
}


public class Assignment1Q3 
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	double principalAmount=s.nextDouble();
	
	double interestRate=s.nextDouble();
	int time=s.nextInt();
	SiCi calculate= new SiCi();
	double res1=calculate.simpleInterest(principalAmount, time, interestRate);
	double res2=calculate.compoundInterest(principalAmount, time, interestRate);
	System.out.println(res1 + " ");
	System.out.println(res2 +" ");
	s.close();
}
}
