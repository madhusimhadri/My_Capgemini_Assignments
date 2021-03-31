

/*Q2. Write an application using lambda expressions to print Orders having 2 criteria implemented:
	1) order price more than 10000 2) order status is ACCEPTED or COMPLETED.*/


import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment4Q2
{
	private int totalPrice;
	private String status;
	
	public Assignment4Q2(int totalPrice,String status)
	{
		super();
		this.totalPrice=totalPrice;
		this.status=status;
	}
	
	
	
/*
	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2>orders)
	{
			
	}
	*/
	
	public static void main(String args[])
	{

		ArrayList<Assignment4Q2> price=new ArrayList<Assignment4Q2>();
		price.add(new Assignment4Q2(11000,"Accepted"));
		price.add(new Assignment4Q2(20000,"Completed"));
		price.add(new Assignment4Q2(15000,"Completed"));
		price.add(new Assignment4Q2(8000,"Rejected"));
		price.add(new Assignment4Q2(25000,"Completed"));
		
		Predicate<Assignment4Q2> pr=e->(e.totalPrice>10000 && (e.status.contentEquals("Accepted") || e.status.contentEquals("Completed")));
		for (Assignment4Q2 i:price)
		{
			if(pr.test(i))
			{
				System.out.println("price:"+i.totalPrice+ " Status:"+i.status);
			}
		}
	}
}
