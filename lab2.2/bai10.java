package baitap;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Khong ton tai so lon thu hai");
            return;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : a) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }

        if (second == Integer.MIN_VALUE)
            System.out.println("Khong ton tai so lon thu hai");
        else
            System.out.println("So lon thu hai: " + second);
    }
}
