import java.util.HashMap;

/*Q7. Convert every key-value pair of the map into a string and append them all into a single string, in iteration order. HINT: Use Map.entrySet() method
& a StringBuilder to construct the result String.*/




public class Assignment4Q7
{
	public static void main(String args[])
	{
		
	}
	
	public String ConvertKeyValueToString(HashMap<String,Integer>map)
	{
		StringBuilder mapAsString=new StringBuilder();
		for(HashMap.Entry<String,Integer> mp:map.entrySet())
		{
			mapAsString.append(mp.getKey()+mp.getValue());
		}
		return mapAsString.toString();
		
	}
}
