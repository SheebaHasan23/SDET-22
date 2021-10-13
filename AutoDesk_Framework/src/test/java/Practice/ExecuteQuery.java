package Practice;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery {
@Test
public void executequery() throws SQLException {
	//step 1:Register the database
	Driver driverref=new Driver();//driver is a interface,in order to register we have registerdriver in drivermanager classs. 
	DriverManager.registerDriver(driverref);//drivermanager is a abstract class which has registerdriver method(abstract method) in which getconnection method is present
	//step 2:estalish connection with database
	java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");//customers is a database.
	//step 3:issue create statement
	Statement stat=con.createStatement();//statement has 2 abstract method ie executequery and execute update.
	//step 4:Execute the query
	ResultSet result=stat.executeQuery("select * from customer;");//customer is a table.
	while(result.next())
	{
		System.out.println(result.getString(2));
	}
	
	
}
}
