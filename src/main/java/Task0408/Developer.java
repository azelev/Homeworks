package Task0408;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, double salary, String department, String programmingLanguage) {
        super(name, age, salary, department);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
