import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int[][] temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;

        int k = arr[r][c];

        boolean[][] v = new boolean[n][n];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        v[r][c] = true;

        for (int i = 1; i < k; i++) {
            for (int j = 0; j < 4; j++) {
                int nx = c + dx[j] * i;
                int ny = r + dy[j] * i;

                if (nx < 0 || nx >= n || ny < 0 || ny >= n)
                    continue;

                v[ny][nx] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            int idx = n - 1;
            for (int j = n - 1; j >= 0; j--) {
                if (!v[j][i]) {
                    temp[idx][i] = arr[j][i];
                    idx--;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(temp[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}