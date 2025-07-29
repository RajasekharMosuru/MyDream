import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

    @Test
    public void testFilterEmployeesByNameStartingWithA() {
        List<Employee> employees = Arrays.asList(
                new Employee("Raj",1),
                new Employee("Apoorva",23),
                new Employee("Arun",20),
                new Employee("Ramesh",12),
                new Employee("God",7));

        List<Employee> nameStartsWithA = employees.stream()
                .filter(employee -> employee.getName().startsWith("A"))
                .collect(Collectors.toList());

        // Expected list of employees whose names start with "A"
        List<Employee> expectedEmployees = Arrays.asList(
                new Employee("Apoorva",23),
                new Employee("Arun",20));

        assertEquals(expectedEmployees.size(), nameStartsWithA.size());
        for (int i = 0; i < expectedEmployees.size(); i++) {
            assertEquals(expectedEmployees.get(i).getName(), nameStartsWithA.get(i).getName());
            assertEquals(expectedEmployees.get(i).getAge(), nameStartsWithA.get(i).getAge());
        }
    }
}

