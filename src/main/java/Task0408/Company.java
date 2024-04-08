package Task0408;

public class Company {

   public Employee[] employeesArray = new Employee[]{
           new Manager("Jose", 29, 60000, "HR", 7),
           new Manager("Dave", 23, 46000, "IT", 2),
           new Developer("Arthur", 28, 90000, "IT", "Java/C#"),
           new Developer("Jurgen", 25, 110000, "IT", "Java/C#/JS")
   };
}
