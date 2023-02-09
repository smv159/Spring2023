/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMPSC221.inclass;

import java.util.ArrayList;

/**
 *
 * @author smv159
 */
public class Company {
    String companyName;
    ArrayList<Employee> employees;

    public Company(String companyName) {
        super();
        this.companyName = companyName;
        employees = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
    
    public void removeEmployee(int index) {
        employees.remove(index);
    }

    @Override
    public String toString() {
        String s = super.toString();
        String info = "";
        info += "Company Name: " + this.companyName + "\n";
        info += "Employees:\n";
        for (Employee e : employees) {
            info += e + "\n";
        }

        return info;
    }
    
    public static void main(String[] args) {
        Company myCompany = new Company("Seth Volpe Inc.");
        
        myCompany.addEmployee(new Staff("Paul", "pl12", 65000));
        myCompany.addEmployee(new Staff("Steve", "st32", 60000));
        Manager karen = new Manager("Karen", "kn111", 95000);
        myCompany.addEmployee(karen);
        myCompany.addEmployee(new Intern("Karen N.", "kn25", 5000, karen));
        myCompany.addEmployee(new Intern("Sam", "sm12", 5000, karen));
        
        System.out.println(myCompany);
    }
}
