//J01023 — TOÁN LỚP BA

import java.util.Scanner;

public class J01023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String aStr = sc.next();
                String opStr = sc.next();
                String bStr = sc.next();
                String eqStr = sc.next();
                String cStr = sc.next();

                solve(aStr, opStr, bStr, cStr);
            }
        }
    }

    private static void solve(String aStr, String opStr, String bStr, String cStr) {
        char[] ops = {'+', '-', '*', '/'};
        for (int a = 10; a <= 99; a++) {
            if (!match(a, aStr)) continue;
            for (char op : ops) {
                if (!matchOp(op, opStr)) continue;
                for (int b = 10; b <= 99; b++) {
                    if (!match(b, bStr)) continue;

                    int c = 0;
                    if (op == '+') c = a + b;
                    else if (op == '-') c = a - b;
                    else if (op == '*') c = a * b;
                    else {
                        if (a % b != 0) continue;
                        c = a / b;
                    }

                    if (c >= 10 && c <= 99 && match(c, cStr)) {
                        System.out.println(a + " " + op + " " + b + " = " + c);
                        return;
                    }
                }
            }
        }
        System.out.println("WRONG PROBLEM!");
    }

    private static boolean match(int val, String pattern) {
        String s = String.valueOf(val);
        if (s.length() != pattern.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (pattern.charAt(i) != '?' && pattern.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean matchOp(char op, String pattern) {
        if (pattern.equals("?")) return true;
        return pattern.charAt(0) == op;
    }
}