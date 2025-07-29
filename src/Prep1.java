import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prep1 {
    public static void main(String args[]){
        List<Employee> employees = Arrays.asList(
                new Employee("Raj",1),
                new Employee("Apoorva",23),
                new Employee("Arun",20),
                new Employee("Ramesh",12),
                new Employee("God",7));
        //Filter the name startsWith "A"
        List<Employee> nameStartswithA = employees.stream()
                .filter(employee -> employee.getName().startsWith("A"))
                .collect(Collectors.toList());
        nameStartswithA.forEach(e->System.out.println(e.getName()));

        //Merge two lists

        List<Employee> employees1 = Arrays.asList(
                new Employee("Sofa",10),
                new Employee("TV",18),
                new Employee("Chair",9),
                new Employee("Bed",87),
                new Employee("Table",34));

        List<Employee> mergeTwoLists = Stream.concat(employees.stream(), employees1.stream())
                .sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        mergeTwoLists.forEach(e->System.out.println(e.getAge()));
    }
}

class Employee{

    public String getName() {
        return name;
    }

    private String name;
    private int age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
