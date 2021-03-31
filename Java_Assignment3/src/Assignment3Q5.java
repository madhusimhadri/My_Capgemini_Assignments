
import java.util.*;
class Employee
{
	private String name;
	private int id;
	
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	@Override
	public boolean equals(Object ob)
	{
		if(this==ob)
			return true;
		if(ob==null||ob.getClass()!=this.getClass())
			return false;
		
		Employee e = (Employee) ob;
		
		return (e.name.equals(this.name) && e.id == this.id);
		
	}
	
	@Override
	public int hashCode()
	{
		return this.id;
	}
	
}



public class Assignment3Q5
{
	public static void main(String args[])
	{
		Employee e1=new Employee("Madhu",1);
		Employee e2=new Employee("Madhu",2);
		
		Map<Employee, String> map =new HashMap<Employee,String>();
		map.put(e1, "CSE");
		map.put(e2, "ECE");
		
		for(Employee e :map.keySet())
		{
			System.out.println(map.get(e).toString());
		}
	}
	
}
