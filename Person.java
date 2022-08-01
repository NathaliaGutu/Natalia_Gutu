package Persoana;

public class Person {
    static long id;
    private String firstName;
    private String lastName;

    public Person(){

        id++;
    }
     public long getId (){
         return id;
     }
     public void setId (long someLong){
         id=someLong;
     }

     public String getFirstName(){
         return firstName;
     }
     public void setFirstName(String argFirstName){
         firstName=argFirstName;
     }

     public String getLastName(){
         return lastName;
     }
     public void setLastName (String argLastName){
         lastName=argLastName;
     }

    public void printDetails(){
         System.out.println(id);
         System.out.println(firstName);
         System.out.println(lastName);

     }


}
