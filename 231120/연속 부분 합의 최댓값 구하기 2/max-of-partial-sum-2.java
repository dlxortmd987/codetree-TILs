import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int res = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
            if (temp < 0) {
                temp = arr[i];
            } else {
                temp += arr[i];
            }

            res = Math.max(res, temp);
        }

        System.out.println(res);

        
    }
}