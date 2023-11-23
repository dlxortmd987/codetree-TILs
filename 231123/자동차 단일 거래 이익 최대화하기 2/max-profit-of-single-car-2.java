import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int p = 0;
        for (int i = 1; i < n; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }

            if (p < arr[i] - min) {
                p = arr[i] - min;
            }
        }

        System.out.println(p);
    }
}