import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        int sum = 0;
        while (q.size() > 1) {
            int v = q.poll() + q.poll();
            sum += v;

            q.add(v);
        }

        System.out.println(sum);
    }
}