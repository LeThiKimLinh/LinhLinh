package baitap;
import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu mang 1: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();

        System.out.print("Nhap so phan tu mang 2: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        int[] c = new int[n1 + n2];
        int k = 0;

        for (int x : a) c[k++] = x;
        for (int x : b) c[k++] = x;

        System.out.println("Mang sau khi loai trung:");
        for (int i = 0; i < k; i++) {
            boolean trung = false;
            for (int j = 0; j < i; j++) {
                if (c[i] == c[j]) {
                    trung = true;
                    break;
                }
            }
            if (!trung) System.out.print(c[i] + " ");
        }
    }
}
