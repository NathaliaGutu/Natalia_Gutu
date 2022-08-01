package Persoana;

import Persoana.Person;

public class PersonValoare {
    public static void main(String[] args) {

        Person myPerson1 = new Person();
        Person myPerson2 = new Person();
        Person myPerson3 = new Person();

        myPerson1.setId(555);
        myPerson1.setFirstName("Paul");
        myPerson1.setLastName("Gutu");

        myPerson2.setId(myPerson2.getId());
        myPerson2.setFirstName("Natalia");
        myPerson2.setLastName("Gutu");

        myPerson3.setId(myPerson3.getId());
        myPerson3.setFirstName("Vladimir");
        myPerson3.setLastName("Gutu");


/*
        System.out.println(myPerson.getId());
        System.out.println(myPerson.getFirstName());
        System.out.println(myPerson.getLastName());
*/

        myPerson1.printDetails();
        myPerson2.printDetails();
        myPerson3.printDetails();


}
}

