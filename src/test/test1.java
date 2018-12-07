/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Employees;

/**
 *
 * @author user only
 */
public class test1 {
    public static void main(String[] args) {
        // Nilai 20 jika luarannya seperti ini
        // {employee_id=7, first_name=James, last_name=Bond, email=james.bond@mi6.go.uk}
        // {employee_id=8, first_name=Captain, last_name=America, email=captain.america@avenger.gov}
        
        Employees test = new Employees();
        test.setEmployee_id(7);
        test.setFirst_name("James");
        test.setLast_name("Bond");
        test.setEmail("james.bond@mi6.go.uk");
        System.out.println(test.toString());
        
        Employees test1 = new Employees(8, "Captain", "America", "captain.america@avenger.gov");
        System.out.println(test1.toString());
    }
  
}
