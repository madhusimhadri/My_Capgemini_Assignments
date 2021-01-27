import java.util.Scanner;

abstract class DesertItem
{
	abstract public int getCost();
	
}

class Candy extends DesertItem
{
	int cost=60;
	public int getCost()
	{
	return cost;	
	}
	public int addCandies(int candies)
	{
		return candies;
	}
}

class Cookie extends DesertItem
{
	int cost=70;
	public int getCost()
	{
		return cost;
	}
	public int addCookies(int candies)
	{
		return candies;
	}
}


class IceCream extends DesertItem
{
	int cost=1;
	public int getCost()
	{
		return cost;
	}
	public int addIceCreams(int candies)
	{
		return candies;
	}
}
	

public class Assignment2Q7
{
	public static void main(String args[])
	{
		Assignment2Q7 obj=new  Assignment2Q7();
		obj.selectRoles();
	}
		private void selectRoles()
		{
		System.out.println("1- owner\n 2-customer");
		int choice= 2;
		Scanner s=new Scanner(System.in);
			
		
		try
		{
			choice= s.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			s.close();
		}
		
		switch(choice)
		{
		case 1: 
			roles("owner");
			break;
		case 2:
			roles("customer");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}
		
	private void roles(String role)
	{
		if(role.equalsIgnoreCase("owner"))
		{
			addItems();
		}
		else if(role.equalsIgnoreCase("customer"))
		{
			placeOrder();
		}
	}
		
	private void addItems()
	{
		System.out.println("1.Candies\n 2. Cookies\n 3.IceCream");
		int choice= 1;
		Scanner s=new Scanner(System.in);
			
		
		try
		{
			choice= s.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			s.close();
		}
		
		switch(choice)
		{
		case 1:
			addItemsOperation(1);
			break;
		case 2:
			addItemsOperation(2);
			break;
		case 3:
			addItemsOperation(3);
			break;
			
			default:
				System.out.println("Invalid Choice");
				break;
		}
	}
	
	private void addItemsOperation(int choice)
	{
		Scanner s=new Scanner(System.in);
		if(choice==1)
		{
			System.out.println("Enter number of candies");
			int quantity=0;
			if(s.hasNext())
			{
				quantity=s.nextInt();
			}
			Candy cnd=new Candy();
			System.out.println(cnd.addCandies(quantity));
			}
		
		else if(choice==2)
		{
			System.out.println("Enter number of cookies");
			int quantity=0;
			if(s.hasNext())
			{
				quantity=s.nextInt();
			}
			Cookie cky=new Cookie();
			System.out.println(cky.addCookies(quantity));
		}
		else
		{
			System.out.println("Enter number of IceCreames");
			int quantity=0;
			if(s.hasNext())
			{
				quantity=s.nextInt();
			}
			IceCream icm=new IceCream();
			System.out.println(icm.addIceCreams(quantity));
		}
		s.close();
	}
		
	private void placeOrder()
	{
		System.out.println("1. Candies\n 2. Cookies\n 3. IceCream");
		Scanner s = new Scanner(System.in);
		int choice=s.nextInt();
		try {
    		if(s.hasNext())
    			choice = s.nextInt();
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		s.close();
    	}
		
	 	switch(choice) {
    	case 1:
    		placeOrderOperation(1);
    		break;
    	case 2:
    		placeOrderOperation(2);
    		break;
    	case 3:
    		placeOrderOperation(3);
    		break;
    	default:
    		System.out.println("Invalid choice");
		
	 	}
	}
	
	private void placeOrderOperation(int choice)
	{
		Scanner s=new Scanner(System.in);
		DesertItem obj=null;
		if(choice ==1) {
    		System.out.println("Enter quantity");
    		try {
    			int quantity = 0;
    			if(s.hasNext())
				quantity = s.nextInt();
    			obj = new Candy();
    			int cash = quantity*obj.getCost();
    			System.out.println("Amount: "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	}else if(choice == 2) {
    		System.out.println("Enter quantity");
    		try {
    			int quantity = 0;
    			if(s.hasNext())
				quantity = s.nextInt();
    			obj = new Cookie();
    			int cash = quantity*obj.getCost();
    			System.out.println("Amount "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	}else {
    		System.out.println("Enter quantity");
    		try {
    			int quantity = 0;
    			if(s.hasNext())
				quantity = s.nextInt();
    			obj = new IceCream();
    			int cash = quantity*obj.getCost();
    			System.out.println("Amount: "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	}
		s.close();
	}
}
