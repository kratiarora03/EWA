import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class DemoExample
{
public static void main(String [] args)
{
try {
// Step 1: Register the driver
Class.forName(“com.mysql.cj.jdbc.Driver”);
String URL = “jdbc:mysql://localhost/EMP”;
String DB_User = “John”;
String DB_Pass = “john”;
// Step 2: Open a database connection
Connection con = DriverManager.getConnection(URL, DB_User, DB_Pass);
// Step 3: Create a statement
Statement stmt = con.createStatement();
String query = “Select Emp_id, Emp_Name, Emp_Age FROM Employees”;
//Step 4: Execute a query 
ResultSet rs = stmt.executeQuery(query);
//Step 5: Extract data from ResultSet
While(rs.next()) {
int id = rs.getInt("Emp_Id");
String name = rs.getString("Emp_Name");
int age = rs.getInt("Emp_Age");
//Display values
System.out.println("Emp ID: "+id);
System.out.println("Emp Name: "+name);
System.out.println("Emp Age: "+age);
}
//Step 6: Cleaning up the environment
rs.close();
stmt.close();
con.close();
}
catch(ClassNotFoundException e1) 
{
System.out.println(e1);
}
catch(SQLException e2)
{
System.out.println(e2);
}
}
}
