import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] += arr[i][j - 1] + arr[i - 1][j] - arr[i - 1][j - 1];
            }
        }

        int ans = 0;
        for (int i = 0; i <= n - k; i++) {
            for (int j = 0; j <= n - k; j++) {
                ans = Math.max(ans, arr[i + k][j + k] - arr[i + k][j] - arr[i][j + k] + arr[i][j]);
            }
        }

        System.out.println(ans);
    }
}