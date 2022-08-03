package stringInversat;

public class StringInversat {
    public static void main(String[] args) {
        String str1 = "Tekwill";
        int len= str1.length();
        String reverse= " ";
        for (int i = len -1; i >= 0; i--){
            reverse = reverse + str1.charAt(i);
        }
        System.out.println(reverse);
    }
}