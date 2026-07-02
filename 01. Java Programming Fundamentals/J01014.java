//J01014 — ƯỚC SỐ NGUYÊN TỐ LỚN NHẤT

import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 0L;
            for (long i = 2L; i * i <= n; i++) {
                if (n % i == 0) {
                    ans = i;
                    while (n % i == 0)
                        n /= i;
                }
            }
            if (n > 1)
                ans = n;
            System.out.println(ans);
        }
    }
}