/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import model.Employees;

/**
 *
 * @author user only
 */
public class test3 {
    public static void main(String[] args) {
        // Nilai 20 jika luarannya seperti ini
        // {employee_id=105, first_name=David, last_name=Austin, email=DAUSTIN}
        // {employee_id=151, first_name=David, last_name=Bernstein, email=DBERNSTE}
        // {employee_id=165, first_name=David, last_name=Lee, email=DLEE}
        // {employee_id=100, first_name=Steven, last_name=King, email=SKING}
        // {employee_id=156, first_name=Janette, last_name=King, email=JKING}
        
        ArrayList<Employees> test = Employees.searchEmployees("David");
        for (int i = 0; i < test.size(); i++) {
            Employees temp = test.get(i);
            System.out.println(temp);
        }
        
        ArrayList<Employees> test1 = Employees.searchEmployees("King");
        for (int i = 0; i < test1.size(); i++) {
            Employees temp = test1.get(i);
            System.out.println(temp);
        }
    }
}
