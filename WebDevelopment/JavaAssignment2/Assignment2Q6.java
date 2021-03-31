

abstract class Persistence
{
	abstract public String persist();
}

class FilePersistence  extends Persistence
{
	@Override
	public String persist()
	{
	 return "Something";	
	}
	
}

class DatabasePersistence extends Persistence
{
	@Override
	public String persist()
	{
	 return "Nothing";	
	}
	
}

class client
{
	Persistence p;
}
public class Assignment2Q6
{
	public static void main(String args[])
	{
		
	}

}
