//J01011 — BỘI SỐ CHUNG - ƯỚC SỐ CHUNG

import java.util.Scanner;

public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();

                long g = gcd(a, b);
                long l = (a * b) / g;

                System.out.println(l + " " + g);
            }
        }
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}