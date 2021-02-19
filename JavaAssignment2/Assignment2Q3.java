import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3
{
	int totalDeposits=10000;
	int creditLimit=2000;
	@Override
	public int getCash()
	{
		int cashWithDraw=totalDeposits-creditLimit;
		return cashWithDraw;
		
	}
}

class SavingsAccount extends Assignment2Q3
{
	int totalDeposits=10000;
	int fixedDepositAmount=5000;
	@Override
	public int getCash()
	{
		int cashPresent=totalDeposits+fixedDepositAmount;
		return cashPresent;
	}
}

public class Assignment2Q3
{
 int  cashInBank=0;
 public int totalCashInBank(ArrayList<Integer> cash)
 {
	 int totalCash=0;
	 for(int i:cash)
	 {
		 totalCash +=i;
	 }
	 cashInBank=totalCash;
	 return totalCash;
 }
 public int getCash()
 {
	 return 0;
 }
 public static void main(String args[])
 {
	 
 }
 }
 
