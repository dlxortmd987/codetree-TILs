import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (o1, o2) -> o1[1] - o2[1]);

        int res = 1;
        int t = arr[0][1];
        for (int i = 1; i < n; i++) {
            if (t <= arr[i][0]) {
                res++;
                t = arr[i][1];
            }
        }

        System.out.println(res);
    }
}