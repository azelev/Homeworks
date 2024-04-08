package Task0408;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Manager extends Employee {

    private int managedEmployees;

    public Manager(String name, int age, double salary, String department, int managedEmployees) {
        super(name, age, salary, department);
        this.managedEmployees = managedEmployees;
    }

    public int getManagedEmployees() {
        return managedEmployees;
    }

    public void setManagedEmployees(int managedEmployees) {
        this.managedEmployees = managedEmployees;
    }
}
