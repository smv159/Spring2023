/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMPSC221.inclass;

/**
 *
 * @author smv159
 */
public class Manager extends Employee {


    public Manager(String name, String employeeNum, double salary) {
        super(name, employeeNum, salary);
    }

    @Override
    public void paySalary() {
        System.out.println("You made $" + salary / 12 + " this month.");
    }

    @Override
    public String toString() {
        return "Manager{" + "name=" + name + ", employeeNum=" + employeeNum + ", salary=" + salary + '}';
    }
         
    
}
