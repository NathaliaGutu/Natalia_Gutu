package md.tekwill.model;

public class Department {
    private int id;
    private String name;
    private static int idGenerator;
    //aici am adaugat
    private int employeeQualification;

    public Department() {
        generateId();
        getEmployeeQualification();
    }

    public Department(String name) {
        generateId();
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void generateId() {
        idGenerator++;
        id = idGenerator;
    }
    //aici am adaugat
    public int qualification() {
        employeeQualification = qualification();
        return employeeQualification;
    }

        public int getEmployeeQualification(){
        return employeeQualification;
    }
}
