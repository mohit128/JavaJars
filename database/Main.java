//import .DataConn;
import java.sql.*;
//import com.example.shapes.Circle;
//import com.example.shapes.Rectangle;
/* final class DataConn{
        public static Connection getCon() throws SQLException{
                Connection c=null;
                String url="jdbc:mariadb://localhost:3306/operation";
                String uname="moh";
                String pass="1234567";

                try{
                Class.forName("org.mariadb.jdbc.Driver");
                 c=DriverManager.getConnection(url,uname,pass);
                }
                        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

return c;
}
}*/
public class Main {
    public static void main(String[] args) {

	try{
	Connection c=DataConn.getCon();
	Statement s=c.createStatement();
	ResultSet r=s.executeQuery("select * from operation.Employee");

while(r.next()){
int id=r.getInt("EmployeeID");
String n=r.getString("FirstName");
float sal = r.getFloat("Salary");

if(sal%3==0)
	System.out.println("ID "+id+"\tName "+n);
}
r.close();
s.close();
c.close();
}catch (SQLException e){
e.printStackTrace();}

     //int n=5;
	//int []a=new int[5];
/*        Circle circle = new Circle(5);
        float circleArea = circle.area();
        System.out.println("Circle Area: " + circleArea);

        Rectangle rectangle = new Rectangle(4, 6);
        float rectangleArea = rectangle.area();
        System.out.println("Rectangle Area: " + rectangleArea);
  */
//StringUtils.reverse("mohit");
//DataProcessor.getdata(a,n);
//Calculator.opr(34,17,'/'); 

 }
}

