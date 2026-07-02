//J01012 — ƯỚC SỐ CHIA HẾT CHO 2

import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int count = 0;

                for (int i = 1; i * i <= n; i++) {
                    if (n % i == 0) {
                        if (i % 2 == 0) {
                            count++;
                        }
                        if ((n / i) % 2 == 0 && i != n / i) {
                            count++;
                        }
                    }
                }
                System.out.println(count);
            }
        }
    }
}