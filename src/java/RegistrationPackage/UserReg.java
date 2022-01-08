/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistrationPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
class UserReg {
    Statement st;
    void userAddInfo(String ukey,String name, String email, String tele, String pass, String copass, String address) {
        try {
            connectToDb();
            String sql1="INSERT INTO user(uname,ukey,uemail,utele,upass,ucopass,uaddress) VALUES('"+name+"','"+ukey+"','"+email+"','"+tele+"','"+pass+"','"+copass+"','"+address+"');";
            st.executeUpdate(sql1);
        } catch (SQLException ex) {
            Logger.getLogger(UserReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connectToDb() {
        try {
            String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/airplanedb";
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,"root","");
            st=con.createStatement();
        } catch (ClassNotFoundException|SQLException ex) {
            Logger.getLogger(UserReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void staffAddInfo(String ukey, String name, String email, String tele, String pass, String copass, String address) {
        try {
            connectToDb();
            String sql2="INSERT INTO staff(sname,skey,semail,stele,spass,scopass,saddress) VALUES('"+name+"','"+ukey+"','"+email+"','"+tele+"','"+pass+"','"+copass+"','"+address+"');";
            st.executeUpdate(sql2);
        } catch (SQLException ex) {
            Logger.getLogger(UserReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void adminAddInfo(String ukey, String name, String email, String tele, String pass, String copass, String address) {
        try {
            connectToDb();
            String sql3="INSERT INTO admin(aname,akey,aemail,atele,apass,acopass,aaddress) VALUES('"+name+"','"+ukey+"','"+email+"','"+tele+"','"+pass+"','"+copass+"','"+address+"');";
            st.executeUpdate(sql3);
        } catch (SQLException ex) {
            Logger.getLogger(UserReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
