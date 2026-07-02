//J01018 — SỐ KHÔNG LIỀN KỀ

import java.util.Scanner;

public class J01018 {
    public static Boolean Check(String s) {
        int n = s.length();
        int d = s.charAt(0) - '0';
        for (int i = 1; i < n; i++) {
            d += s.charAt(i) - '0';
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 2)
                return false;
        }
        return d % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            if (Check(Long.toString(n)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}