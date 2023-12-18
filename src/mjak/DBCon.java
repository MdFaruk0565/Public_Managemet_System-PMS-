
package mjak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DBCon {
    Connection con;
    Statement stm;
    PreparedStatement psmt;
    public DBCon(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mjak","root","");
            stm = con.createStatement();
            
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
