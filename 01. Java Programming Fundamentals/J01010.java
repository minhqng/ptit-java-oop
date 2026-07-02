//J01010 — CẮT ĐÔI

import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                solve(s);
            }
        }
        sc.close();
    }

    private static void solve(String s) {
        StringBuilder sb = new StringBuilder();
        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '8' || c == '9') {
                sb.append('0');
            } else if (c == '1') {
                sb.append('1');
            } else {
                valid = false;
                break;
            }
        }

        if (!valid) {
            System.out.println("INVALID");
            return;
        }

        int firstNonZero = -1;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0') {
                firstNonZero = i;
                break;
            }
        }

        if (firstNonZero == -1) {
            System.out.println("INVALID");
        } else {
            System.out.println(sb.substring(firstNonZero));
        }
    }
}