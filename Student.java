package thisKeyword.ThisOverloadedConstructor;

public class Student {
    String name;
    String lastName;
    int id;

    Student(String name1, String lastName1){
        this.name=name1;
        this.lastName=lastName1;
    }
    Student (int id1){
        this.id=id1;
    }
    public static void main(String[]args) {
        Student myStudent;
        myStudent = new Student("Dan", "Strungaru");
        myStudent = new Student(12345);
        System.out.println(myStudent.name);
        System.out.println(myStudent.lastName);
        System.out.println(myStudent.id);
    }


}
