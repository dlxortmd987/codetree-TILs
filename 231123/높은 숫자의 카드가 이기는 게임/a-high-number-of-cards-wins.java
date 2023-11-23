import java.util.*;

public class Main {

    public static int find(List<Integer> b, int v) {
        int s = 0;
        int e = b.size() - 1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (b.get(mid) < v) {
                s = mid + 1;
            } else if (b.get(mid) > v) {
                e = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }

        Collections.sort(b);

        for (int i = 1; i <= 2*n; i++) {
            if (find(b, i) == -1) {
                a.add(i);
            }
        }

        Collections.sort(a);

        int res = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (idx >= a.size())
                break;
            while (a.get(idx) < b.get(i)) {
                if (idx + 1 < a.size()) {
                    idx++;
                } else
                    break;
            }

            res++;
            idx++;
        }

        System.out.println(res);
    }
}