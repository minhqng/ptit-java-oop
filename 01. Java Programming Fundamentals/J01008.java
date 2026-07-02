//J01008 — PHÂN TÍCH THỪA SỐ NGUYÊN TỐ

import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int i = 1; i <= t; i++) {
                int n = sc.nextInt();
                System.out.print("Test " + i + ": ");

                for (int j = 2; j * j <= n; j++) {
                    if (n % j == 0) {
                        int count = 0;
                        while (n % j == 0) {
                            count++;

                            n /= j;
                        }
                        System.out.print(j + "(" + count + ") ");
                    }
                }

                if (n > 1) {
                    System.out.print(n + "(1)");
                }
                System.out.println();
            }
        }
    }
}