package baitap;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int max = a[0], cur = a[0];
        for (int i = 1; i < n; i++) {
            cur = Math.max(a[i], cur + a[i]);
            max = Math.max(max, cur);
        }
        System.out.println("Tong lon nhat: " + max);
    }
}
