package ustbatchno3.jdbc_project;
import java.sql.Connection;
import java.sql.DriverManager;

public class newtable {
	public static void main(String args[])
	{
	 try{  
	    	Class.forName("com.mysql.jdbc.Driver");  
	    	Connection con=DriverManager.getConnection(  
	    	"jdbc:mysql://localhost:3306/jenson","root","pass@word1");  
	    	//here sonoo is database name, root is username and password  
	    	java.sql.Statement stmt=(java.sql.Statement) con.createStatement();
	    	String query = "CREATE TABLE e("
	    	         + "EMPLOYEE_ID INT NOT NULL, "
	    	         + "EMPLOYEE_NAME VARCHAR (20) NOT NULL, "
	    	         + "PHONENO VARCHAR(20) NOT NULL, "
	    	         + "EMAIL VARCHAR(20) NOT NULL"
	    	         + "SALARY DECIMAL (18, 2), "
	    	         +"LOCATION VARCHAR(20,"
	    	         + "ADDRESS CHAR (25) , "
	    	         + "PRIMARY KEY (ID))";
	    	      stmt.execute(query);
	    	      System.out.println("Table Created......");
	    	      String sql = "INSERT INTO e VALUES (25000,'jenson','3456789765','jenson@gmail.com',250000,'Thiruvalla','Niranam')";
	    	         stmt.executeUpdate(sql);
	    	         System.out.println("Inserted records into the table...");   	  
             }catch(Exception e){ System.out.println(e);
      }
	}
}