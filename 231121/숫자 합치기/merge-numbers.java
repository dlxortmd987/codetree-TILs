import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int sum = 0;
        while (arr.size() > 1) {
            Collections.sort(arr);

            int v = arr.get(0) + arr.get(1);
            sum += v;
            arr.add(v);
            arr.remove(0);
            arr.remove(0);
            
        }

        System.out.println(sum);
    }
}