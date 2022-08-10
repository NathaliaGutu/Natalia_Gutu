package md.tekwill.dao;
import md.tekwill.model.Employee;

public class EmployeeDao {
    private static Employee[] employeesArr = new Employee[10];


    public void create(Employee employee) {
        for (int i = 0; i < employeesArr.length; i++) {
            Employee existingEmployee = employeesArr[i];
            if (existingEmployee == null) {
                employeesArr[i] = employee;
                break;
            }
        }
    }

    public Employee read(int employeeId) {
        //search employee by id
        return null;
    }

    public void update(int employeeId, Employee updatedEmployee) {
        //search employee by id
        // update data from updatedEmployee to the old employee from employeesArr
    }

    public void delete(int employeeId) {
        //search employee by id
        // set to null
    }

//aici am adaugat
    public void search(int employeeQualification){
        // search employee certificate of qualification
    }




    public Employee[] getAll() {
        return employeesArr;
    }

}
