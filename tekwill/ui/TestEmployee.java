package md.tekwill.ui;
import md.tekwill.model.Employee;
import md.tekwill.service.EmployeeService;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Ion", "Bostan");
        Employee employee2 = new Employee("Vasile", "Grosu");

        //unde sa setez qualification???

        EmployeeService employeeService = new EmployeeService();
        boolean isEmployeeSaved = employeeService.create(employee);
        employeeService.create(employee2);
        employeeService.listEmployees();
//        System.out.println(isEmployeeSaved);

    }
}
