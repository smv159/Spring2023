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
public abstract class Employee {
    String name;
    String employeeNum;
    double salary;

    public Employee(String name, String employeeNum, double salary) {
        this.name = name;
        this.employeeNum = employeeNum;
        this.salary = salary;
    }

    public abstract void paySalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{name=").append(name);
        sb.append(", employeeNum=").append(employeeNum);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    
    
}
