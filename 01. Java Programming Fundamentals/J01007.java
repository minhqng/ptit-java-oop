//J01007 - KIỂM TRA SỐ FIBONACCI

import java.util.HashSet;
import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Long> fiboSet = new HashSet<>();
        long[] f = new long[93];
        f[0] = 0;
        f[1] = 1;
        fiboSet.add(0L);
        fiboSet.add(1L);

        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
            fiboSet.add(f[i]);
        }

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();
                if (fiboSet.contains(n)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}