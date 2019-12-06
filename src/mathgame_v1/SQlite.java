
package mathgame_v1;

import java.sql.*;
 import javax.swing.*;
public class SQlite {

 

    Connection conn=null;
    public static Connection ConnecrDB()   {
       try{
        Class.forName("org.sqlite.JDBC");
         Connection conn=DriverManager.getConnection("jdbc:sqlite:Email.sqlite");
         
         //JOptionPane.showMessageDialog(null, "Connected");
         return conn;
       }catch(Exception e){
           System.out.println(e);
           return null;
       }
    }
}