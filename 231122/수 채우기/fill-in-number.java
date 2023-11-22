import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = Integer.MAX_VALUE;

        for (int i = n / 5; i >= 0; i--) {
            int t = 0;
            int n1 = n;
            t += i;
            n1 -= i * 5;

            t += n1 / 2;
            n1 %= 2;

            if (n1 == 0) {
                res = Math.min(t, res);
            }
        }

        if (res == Integer.MAX_VALUE) {
            System.out.println(-1);    
            return;
        }

        System.out.println(res);
    }
}