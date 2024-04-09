package Task0408;

public class Manager extends Employee{

    private int managedEmployees;

    public Manager(String name, int age, double salary, Department department, int managedEmployees) {
        super(name, age, salary, department);
        this.managedEmployees = managedEmployees;
    }
}
