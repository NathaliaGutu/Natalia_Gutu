package stringInversat;

public class StringInversat {
    public static void main(String[] args) {
        String string1 = new String("tak");

        System.out.print(string1.charAt(string1.length() - 1));
        System.out.print(string1.charAt(string1.length() - 2));
       System.out.print(string1.charAt(string1.length() - 3));

        // System.out.println(string1.replace("tak", "kat"));

    }
}