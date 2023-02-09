package CMPSC221.inclass;

public class Staff extends Employee {
    public Staff(String name, String employeeNum, double salary) {
        super(name, employeeNum, salary);
    }

    @Override
    public void paySalary() {
        System.out.println("You made $" + salary / 24 + " this month.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Staff{name=").append(name);
        sb.append(", employeeNum=").append(employeeNum);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
