import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*Q5. Create a string that consists of the first letter of each word in the list of Strings provided. 
HINT: Use Consumer interface & a String Builder to construct the result.
*/


public class Assignment4Q5 

{
	List<String> list= Arrays.asList("alpha","bravo","charlie","delta","echo","foxrot");
 public static String processWords(List<String> list)
 {
	 StringBuilder firstletters= new StringBuilder();
	 Consumer<List<String>> c= lis ->
	 {
	for(int i=0;i<lis.size();i++)
	{
		String word=list.get(i);
		firstletters.append(word.charAt(0));
	}
	 };
	 c.accept(list);
	 return firstletters.toString();
 }
 
 public static void main(String[] args)
 {
	 
}
}
