import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr= new int[n][2];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[i][0] = y;
            arr[i][1] = x;
        }

        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);

        int res = 0;

        int s = 0;
        int e = n - 1;
        while (s <= e) {
            res = Math.max(res, arr[s][0] + arr[e][0]);

            arr[s][1] -= 1;
            arr[e][1] -= 1;
            if (arr[s][1] == 0) {
                s++;
            }
            if (arr[e][1] == 0) {
                e--;
            }
        }

        System.out.println(res);
    }
}