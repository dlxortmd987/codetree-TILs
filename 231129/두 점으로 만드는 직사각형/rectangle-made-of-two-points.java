import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Math.abs(Math.min(arr[0], arr[4]) - Math.max(arr[2], arr[6])) * Math.abs(Math.min(arr[1], arr[5]) - Math.max(arr[3], arr[7])));
    }
}