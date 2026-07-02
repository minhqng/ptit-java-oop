//J01004 — SỐ NGUYÊN TỐ

import java.util.Scanner;

public class J01004 {
    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            System.out.println(isPrime(a) ? "YES" : "NO");
        }
    }
}