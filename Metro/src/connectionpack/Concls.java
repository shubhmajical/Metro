package connectionpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Concls {
   Connection conn;
   public Concls()
    {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","metro","fare");
        }catch(ClassNotFoundException | SQLException ex){
        System.out.println(ex.toString());           
        }
        }
public Connection getCon()
{
return conn;
}
 }
