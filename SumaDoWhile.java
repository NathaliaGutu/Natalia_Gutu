public class SumaDoWhile {
    public static void main (String[]args) {
        int sum=0;
        int i=0;
        do {
            sum+=i;
            i++;
        } while(i<=5);

        System.out.println("Suma do...while = "+sum);
    }
}
