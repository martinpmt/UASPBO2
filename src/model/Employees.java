/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import test.test2;
import util.MyOracle;

/**
 *
 * @author user only
 */
public class Employees {

    private int employee_id;
    private String first_name;
    private String last_name;
    private String email;

    public Employees() {
    }

    public Employees(int employee_id, String first_name, String last_name, String email) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    /**
     * Fungsi untuk mencari employees yang sesuai kata kunci/keyword baik pada
     * first_name atau last_name.
     *
     * @param keyword
     * @return
     */
    public static ArrayList<Employees> searchEmployees(String keyword) {
        ArrayList<Employees> employeesList = new ArrayList<>();
        MyOracle ora = new MyOracle("172.23.9.185", "1521", "orcl", "puspa", "puspa");
        Connection con = ora.getConnection();
        try {
            Statement stmt = con.createStatement();
            String query = "SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL FROM PUSPA.EMPLOYEES";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (rs.getString(2).equals(keyword)) {
                    Employees emp = new Employees(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                    employeesList.add(emp);
                } else if (rs.getString(3).equals(keyword)) {
                    Employees emp = new Employees(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                    employeesList.add(emp);
                }
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employeesList;
    }

    /**
     * @return the employee_id
     */
    public int getEmployee_id() {
        return employee_id;
    }

    /**
     * @param employee_id the employee_id to set
     */
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Fungsi toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Employees{" + "employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + '}';
    }

}
