package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {
	@Test
	public void executequery() throws SQLException {
		Connection con=null;
		try {
		//step 1:Register the database
		Driver driverref=new Driver();//driver is a interface,in order to register we have registerdriver in drivermanager classs. 
		DriverManager.registerDriver(driverref);//drivermanager is a abstract class which has registerdriver method(abstract method) in which getconnection method is present
		//step 2:estalish connection with database
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");//customers is a database.
		//step 3:issue create statement
		Statement stat=con.createStatement();//statement has 2 abstract method ie executequery and execute update.
		//step 4:Execute the query
		int count=stat.executeUpdate("insert into customer value(3,'sheeba','hasan','bangalore')");//customer is a table.
if(count==1)
{
	System.out.println("customer is created successfully");
}
else
{
	System.out.println("querry failed");
}
		}
		catch(Exception e)
		{
			
		}
		finally {
			con.close();
		
		}
}
}

