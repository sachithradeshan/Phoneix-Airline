/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdatePackage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
class userUpdate {
Statement st;
Connection con;
    boolean userUpadateInfo(int id,String name, String email, String tele, String ukey, String pass, String copass, String address) {
         int state = 0;
         connectToDb();
        try
        {
          PreparedStatement ps =con.prepareStatement("UPDATE user SET uname=?, ukey=?, uemail=? , utele=? ,upass=?,ucopass=?,uaddress=? WHERE uid=?");   
           ps.setInt(8, id); 
          ps.setString(1,name);
           ps.setString(3,email);
           ps.setString(4,tele);
           ps.setString(2,ukey);
            ps.setString(5,pass);
             ps.setString(6, copass);
             ps.setString(7,address);
            
           state = ps.executeUpdate();
        }
        catch(Exception e)
               {
                 e.printStackTrace();  
               }
        return state == 1;
    
    }
    
    
 private void connectToDb() {
        try {
            String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/airplanedb";
            Class.forName(driver);
            con=DriverManager.getConnection(url,"root","");
            st=con.createStatement();
        } catch (ClassNotFoundException|SQLException ex) {
            Logger.getLogger(userUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
