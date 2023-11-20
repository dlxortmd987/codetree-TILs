import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int res = -1001;
        int temp = 0;
        int max = -1001;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            if (temp + arr[i] < temp) {
                temp = 0;
            } else if (temp + arr[i] > temp) {
                temp += arr[i];
                res = temp;
            }
        }

        if (res == -1001) {
            res = max;
        }

        System.out.println(res);

        
    }
}