import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = 0;

        res += n / 5;
        n %= 5;

        res += n / 2;
        n %= 2;

        if (n != 0) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}