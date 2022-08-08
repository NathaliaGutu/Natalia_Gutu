package thisKeyword.ThisParameter;

public class Student {
    String name;
    int id;

    public Student(String name1){
        this.name=name1;
    }
    static void Student(int id1){
       // NU STIU

    }
    public static void main(String[]args){
        Student myStudent=new Student("Dan");

        System.out.println(myStudent.name);
        System.out.println(myStudent.id);
    }
    }

