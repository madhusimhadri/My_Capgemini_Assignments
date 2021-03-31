import java.util.List;

/* Q6. Replace every word in the list with its upper case equivalent. Use replaceAll() method
& Unary Operator interface. */



public class Assignment4Q6 {
	public static void main(String[] args) {
		
	}
    public List<String> convertToUpperCase(List<String> list) {
    list.replaceAll(s->s.toUpperCase());
    return list;
    } 
}
