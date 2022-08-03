package Persoana;

public class Person {
    private long id;
    private String firstName;
    private String lastName;

    public static int c=555;

    public Person(){
        c++;
        id=c;
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
