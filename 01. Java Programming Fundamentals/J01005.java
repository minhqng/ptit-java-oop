//J01005 — CHIA TAM GIÁC

import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();

            for (int i = 1; i < n; i++) {
                System.out.printf("%.6f ", (h * Math.sqrt(1.0 * i / n)));
            }
            System.out.println();
        }
    }
}