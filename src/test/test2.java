/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.MyOracle;

/**
 *
 * @author admin
 */
public class test2 {

    public static void main(String[] args) {
        // Nilai 20 jika luarannya seperti ini
        // King  Janette 156 JKING
        // King  Steven 100 SKING
        try {
            String ip = "172.23.9.185";
            String port="1521";
            String sid = "orcl";
            String userName="puspa";
            String password="puspa";
            MyOracle ora = new MyOracle(ip, port, sid, 
                    userName, password);
            //step2 create  the connection object
            Connection con = ora.getConnection();
            //step3 create the statement object
            Statement stmt = con.createStatement();
            //step4 execute query
            ResultSet rs = stmt.executeQuery(
                    "select E.last_name, E.first_name, E.employee_id, E.email "
                            + "from employees E where E.last_name like '%King%' " );
            while (rs.next()) {
                System.out.println( rs.getString(1) + "  " +
                        rs.getString(2)+ " "
                        + rs.getString(3)+ " "
                        + rs.getString(4));
            }
            //step5 close the connection object
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(test2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
