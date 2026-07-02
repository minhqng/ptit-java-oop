//J01002 — TÍNH TỔNG N SỐ NGUYÊN DƯƠNG ĐẦU TIÊN

import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println((long) (1 + n) * n / 2);
        }
    }
}