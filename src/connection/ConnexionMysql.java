package connection;

import java.sql.*;
import javax.swing.*;

public class ConnexionMysql {
    Connection cn =null;
    public static Connection ConnexionDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gsdba","root","");
            return cn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not Connected");
            return null;
        }
    }
}
