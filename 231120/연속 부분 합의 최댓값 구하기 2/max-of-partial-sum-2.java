import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int res = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (temp + arr[i] < temp) {
                temp = 0;
            } else if (temp + arr[i] > temp) {
                temp += arr[i];
                res = temp;
            }
        }

        System.out.println(res);

        
    }
}