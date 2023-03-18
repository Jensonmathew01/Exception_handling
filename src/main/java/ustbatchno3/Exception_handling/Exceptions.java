Program to validate mobile number,email id and employee id using exception.
***************************************************************************	
package ustbatchno3.Exception_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Exceptions extends Exception {
    /**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public Exceptions(String errorMessage) {
        super(errorMessage);
    }	
	public static void customeException(int i) throws Exceptions {
			    if (i !=10) {
			        throw new Exceptions("given is a wrong phone number");}
		
	}
	public static void customeException(String j) throws Exceptions {
	    if (!j.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
	    throw new Exceptions("given is a wrong email id");
	}
	public static void customeException(long k) throws Exceptions{
		if(k<=20000 || k>=30000)
		{
			throw new Exceptions("given is a wrong employee id");
		}
	}
	


	public static void main(String[] args) {
		
		
	    employee_details e=new employee_details(null, null, "Thiruvalla", 0,"Jenson","Niranam", 5000);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your phoneno");
		e.setPhoneno(sc.next());
		try {
			customeException(e.getPhoneno().length());
		}  catch (Exceptions e1) {
		    System.out.println(e1.getMessage());
		}
		System.out.println("Enter your email");
		e.setEmail(sc.next());
		try {
			customeException(e.getEmail());
		}  catch (Exceptions e1) {
		    System.out.println(e1.getMessage());
		}
		System.out.println("Enter your id");
		e.setEmployee_id(sc.nextInt());
		try {
			customeException(e.getEmployee_id());
		}  catch (Exceptions e1) {
		    System.out.println(e1.getMessage());
		    
}
}	
}
	   
	
	
