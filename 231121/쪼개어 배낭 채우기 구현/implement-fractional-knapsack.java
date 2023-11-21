import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (o1, o2) -> {
            double p = (double) o2[1] / (double) o2[0] - (double) o1[1] / (double) o1[0];

            if (p > 0) {
                return 1;
            } else if (p < 0) {
                return -1;
            }
            return 0;
        });

        double res = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + arr[i][0] < m) {
                sum += arr[i][0];
                res += arr[i][1];
            } else {
                res += ((double) (m - sum) / (double) arr[i][0]) * (double) arr[i][1];
                sum += m - sum;
            }
        }
        
        System.out.printf("%.3f", Math.round(res*1000)/1000.0);
    }
}