//J02009 — XẾP HÀNG
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[][] passengers = new int[n][2];

            for (int i = 0; i < n; i++) {
                passengers[i][0] = sc.nextInt();
                passengers[i][1] = sc.nextInt();
            }

            Arrays.sort(passengers, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o1[0], o2[0]);
                }
            });

            int currentTime = 0;
            for (int i = 0; i < n; i++) {
                if (currentTime < passengers[i][0]) {
                    currentTime = passengers[i][0] + passengers[i][1];
                } else {
                    currentTime += passengers[i][1];
                }
            }

            System.out.println(currentTime);
        }
    }
}