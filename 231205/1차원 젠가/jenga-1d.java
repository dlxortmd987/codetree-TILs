import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] b = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            int s = b[i][0] - 1;
            int e = b[i][1] - 1;
            int[] temp = new int[n];
            int idx = 0;
            for (int j = 0; j < n; j++) {
                if (s <= j && j <= e) {
                    continue;
                }
                temp[idx] = arr[j];
                idx++;
            }

            for (int j = 0; j < n; j++) {
                if (temp[j] != 0)
                    arr[j] = temp[j];
            }
            n = n - (e - s + 1);
            
        }

        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }   
    }
}