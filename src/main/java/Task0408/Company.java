package Task0408;

public class Company {

   Employee[] employees = new Employee[]{
        new Manager("Jose", 28, 67000, Department.HR, 2),
        new Manager("Dave", 24, 54000, Department.HR, 0),
        new Developer("Joe", 32, 105000, Department.IT,"C#"),
        new Developer("Mike", 35, 130000, Department.IT, "C#, Java")
    };
}
