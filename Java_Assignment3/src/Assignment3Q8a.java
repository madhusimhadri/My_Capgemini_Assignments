import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment3Q8a 
{
	public static void failFast(Map<String,String>cityCode)
	{
		Iterator<String> iterator =cityCode.keySet().iterator();
		while(iterator.hasNext())
		{
		System.out.println(cityCode.get(iterator.next()));	
		cityCode.put("Panaji", "Goa");
		}
	}
	
	public static void main(String args[])
	{
		
		Map<String,String> cityCode=new HashMap<String,String>();
		
		cityCode.put("Hyderabad", "Telangana");
		cityCode.put("Amaravati", "Andhra Pradesh");
		cityCode.put("Chennai", "TamilNadu");
		failFast(cityCode);
	}
}
