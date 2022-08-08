package thisKeyword;

public class Person {
    String name;
    String lastName;
    int age;

    public Person(String name1, String lastName1){
        this.name=name1;
        this.lastName=lastName1;
    }
    public Person(int age1){
        this.age=age1;{
            return;
        }
    }

    public static void main(String[]args){
        Person myPerson;
        myPerson = new Person("Dan", "Scutaru");
        myPerson= new Person(9);
        System.out.println("I am " + myPerson.name);
        System.out.println("eu am " + myPerson.age + " ani");
    }

}