import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[10001];

        
        for (int i = 0; i < n; i++) {
            int g = sc.nextInt();
            int t = sc.nextInt();
            arr[t] = Math.max(arr[t], g);
        }

        int res = 0;
        for (int i = 1; i < 10001; i++) {
            res += arr[i];
        }

        System.out.println(res);
    }
}