//J03035 — ĐIỀN CHỮ SỐ

import java.util.Scanner;

public class J03035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String a = sc.next();
                String b = sc.next();
                System.out.println(countWays(a, b));
            }
        }
    }

    private static long countWays(String a, String b) {
        int n = a.length();
        long totalWays = 0;
        long prefixWays = 1;

        for (int i = 0; i < n; i++) {
            char ca = a.charAt(i);
            char cb = b.charAt(i);
            long waysGreater = 0;

            if (ca == '?') {
                waysGreater = '9' - cb;
            } else if (ca > cb) {
                waysGreater = 1;
            }

            if (waysGreater > 0) {
                int remainingQuestionMarks = 0;
                for (int j = i + 1; j < n; j++) {
                    if (a.charAt(j) == '?') {
                        remainingQuestionMarks++;
                    }
                }
                totalWays += (long) (prefixWays * waysGreater * Math.pow(10, remainingQuestionMarks));
            }

            if (ca != '?' && ca != cb) {
                prefixWays = 0;
                break;
            }
        }

        return totalWays;
    }
}