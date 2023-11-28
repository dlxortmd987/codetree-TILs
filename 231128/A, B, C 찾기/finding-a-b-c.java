import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        int a = 0;
        int b = 0;
        int c = 0;

        Arrays.sort(arr);

        a = arr[0];
        b = arr[1];
        c = arr[6] - a - b;

        System.out.printf("%d %d %d\n", a, b, c);
    }
}