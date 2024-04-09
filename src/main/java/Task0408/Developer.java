package Task0408;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, int age, double salary, Department department, String programmingLanguage) {
        super(name, age, salary, department);
        this.programmingLanguage = programmingLanguage;
    }
}
