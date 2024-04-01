//JDBC Steps
//1- Register the driver
//2- create connection
//3- create statement
//4- Execute Query
//5- Close Connection\
package bank.managment.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn(){
        try{
//            Class.forName(Connection.mysql.cj.jdbc.Driver);//register the driver
            c = DriverManager.getConnection("jdbc:mysql:///bank_management_system", "root", "Sahil@123");
            s = c.createStatement();
        }
        catch (Exception e){
        System.out.println(c);
        }
    }
}
