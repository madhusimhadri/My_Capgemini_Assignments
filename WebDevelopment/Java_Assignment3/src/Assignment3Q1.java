

import java.util.Comparator;
import java.util.TreeSet;
class Person
{
	private String name;
	private int height;
	private double weight;
	
	public Person(String n,int h,double w)
	{
		this.name=n;
		this.height=h;
		this.weight=w;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	
	public void setHeight(int height)
	{
		this.height=height;
	}
	
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	
	public String toString()
	{
		return "Name: "+this.name +" Height:" +this.height+ " Weight:"+this.weight;
		
	}
		
}
public class Assignment3Q1 
{
	public static void main(String args[])
	{
		
		TreeSet<Person> weightComp =new TreeSet<Person>(new MyweightComp());
		weightComp.add(new Person("Madhu",170,65.00));
		weightComp.add(new Person("Sri",160,65.00));
		weightComp.add(new Person("Anil",180,67.00));
		weightComp.add(new Person("Suhas",184,62.00));
		
		for(Person p:weightComp)
		{
			System.out.println(p);
		}
		
		System.out.println("*********************************");
	/*	
		TreeSet<Person> heightComp =new TreeSet<Person>(new MyheightComp());
		heightComp.add(new Person("Madhu",170,65.00));
		heightComp.add(new Person("Sri",160,55.00));
		heightComp.add(new Person("Anil",180,67.00));
		heightComp.add(new Person("Suhas",184,62.00));
		
		for(Person p:heightComp)
		{
			System.out.println(p);
		}
	*/	
		
	}
}

class MyweightComp implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2)
	{
		// TODO Auto-generated method stub
		if(o1.getWeight()>o2.getWeight())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}

/*
class MyheightComp implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		if(o1.getHeight()>o2.getHeight())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
*/


