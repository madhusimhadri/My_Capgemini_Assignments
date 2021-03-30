
import java.util.Scanner;
class Login{
    String userId = "Ajay",password = "password";
    int count =2;
    public String loginUser(String user, String pass) {
    	Scanner scan = new Scanner(System.in);
    	while(count>0) {
    		if(user.equals(userId) && pass.equals(password))
    		{
    			System.out.println("Welcome Ajay");
    			break;
    
    		}
    		else {
    			System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    			count--;
    		
    			System.out.println("Enter userId");
    			user = scan.nextLine();
    			System.out.println("Enter pass");
    			pass = scan.nextLine();
    			
    		}
    		
    	}
    	scan.close();
    	if(count==0)
    	{
    	System.out.println("You have entered wrong credentials 3 times, please contact admin");
    	}
    	return " ";
    }

}


public class Assignment1Q6 
{

    public static void main(String[] args) {
   
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter userId");
    	String user =scan.nextLine();
    	System.out.println("Enter pass");
    	String pass = scan.nextLine();
     	Login login = new Login();
    	
    	login.loginUser(user, pass);
    		
    	scan.close();
    }
	
	

}
