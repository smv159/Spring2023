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
public class Intern extends Employee {
    Manager manager;

    public Intern(String name, String employeeNum, double salary, Manager manager) {
        super(name, employeeNum, salary);
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void paySalary() {
        System.out.println("You made $" + (0 * salary));
    }

    @Override
    public String toString() {
        return "Intern{" + "name=" + name + ", employeeNum=" + employeeNum +
                ", salary=" + salary + ", manager=" + manager + '}';
    }
    
    
}
