

abstract class AbstractCheck
{
	public int a=2;
	public void Method1()
	{
		int b=100;
		System.out.println(b);
	}
	public abstract void emptyMethod1();
	public abstract int emptyMethod2();
}

//empty abstract method
abstract class emptyAbstract
{
	
}


//subclass as abstract
//When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.

abstract class example extends AbstractCheck
{
	
}

public class Assignment2Q4 extends AbstractCheck
{
	public static void main(String args[])
	{
		
	}
	
	@Override
	public void emptyMethod1()
	{
		
	}
	
	@Override
	public int emptyMethod2()
	{
		return 0;
	}
	
}


















