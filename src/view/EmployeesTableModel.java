/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Employees;

/**
 *
 * @author user only
 */
public class EmployeesTableModel extends AbstractTableModel {

    private ArrayList<Employees> employeesList;
    private String[] columns;

    public EmployeesTableModel() {
    }

    public EmployeesTableModel(ArrayList<Employees> employeesList) {
        super();
        this.employeesList = employeesList;
        columns = new String[]{
            "Employee_ID", "First Name", "Last name", "Email"
        };
    }

    public EmployeesTableModel(ArrayList<Employees> employeesList, String[] columns) {
        super();
        this.employeesList = employeesList;
        this.columns = columns;
    }

    @Override
    public int getRowCount() {
        //To change body of generated methods, choose Tools | Templates.
        return employeesList.size();
    }

    @Override
    public int getColumnCount() {
        //To change body of generated methods, choose Tools | Templates.
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //To change body of generated methods, choose Tools | Templates.
        Employees emp = employeesList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return emp.getEmployee_id();
            case 1:
                return emp.getFirst_name();
            case 2:
                return emp.getLast_name();
            case 3:
                return emp.getEmail();
            default:
                return null;
        }
    }

    // Optional, the name of your column
    public String getColumnName(int col) {
        return columns[col];
    }

}
