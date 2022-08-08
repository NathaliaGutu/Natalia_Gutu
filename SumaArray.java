package Array;

public class SumaArray {
    public static void main(String[] args) {
        int[] arr = {15, 17, 19, 20};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
