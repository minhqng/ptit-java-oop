//J01009 — TỔNG GIAI THỪA

import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            long sum = 0;
            long currentFactorial = 1;

            for (int i = 1; i <= n; i++) {
                currentFactorial *= i;
                sum += currentFactorial;
            }

            System.out.println(sum);
        }
    }
}