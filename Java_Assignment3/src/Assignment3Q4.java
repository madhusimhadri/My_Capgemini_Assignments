import java.util.HashMap;


class DateClass {
    private int date;
    private int month;
    private int year;
    public DateClass() {
    	
    }
	public DateClass(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return date+"-"+month+"-"+year;
	}
	
	
}

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> dob,String employeeName){
    	//LocalDate ld = LocalDate.parse(text)
    	String keyBuff = "";
    	String valueBuff = "";
    	int flag = 0 ;
    	for (HashMap.Entry<DateClass,String> entry : dob.entrySet()) {
    		String key = entry.getKey().toString();
    		String value = entry.getValue();
    		String[] arr = key.split("-");
    		@SuppressWarnings("unused")
			String dm = arr[0]+arr[1]; 
    		if(value.equals(employeeName)) {
    			keyBuff = key;
    			valueBuff = value;
    		}
    	}
    	String[] keyArr = keyBuff.split("-");
    	for (HashMap.Entry<DateClass,String> entry : dob.entrySet()) {
    		String key = entry.getKey().toString();
    		@SuppressWarnings("unused")
			String value = entry.getValue();
    		String[] key2arr = key.split("-");
    		if(((key2arr[0]+key2arr[1]).equals(keyArr[0]+keyArr[1])) && !((key2arr[2].equals(keyArr[2])))){
    			flag = 1;
    		}
    	}
    	if(flag== 1) {
    		return "get method fails";
    	}else {
    		return valueBuff;
    	}
    	
           
    }
    public static void main(String[] args) {
    	HashMap<DateClass,String> dob = new HashMap<>();
    	DateClass d1 = new DateClass(07,05,2000);
    	DateClass d2 = new DateClass(10,9,2000);
    	DateClass d3 = new DateClass(4,04,2001);
    	DateClass d4 = new DateClass(13,07,2008);
    	dob.put(d1, "Madhu");
    	dob.put(d2, "Anil");
    	dob.put(d3, "Sri");
    	dob.put(d4, "Suhas");
    	Assignment3Q4 obj = new Assignment3Q4();
    	String test = obj.getEmployee(dob,"Anil");
    	System.out.println(test);
    }
}