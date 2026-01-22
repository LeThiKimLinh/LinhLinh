package baitap;
import java.util.Scanner;

public class bai11 {

    static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int dem = 0;
        System.out.println("Cac so nguyen to:");
        for (int x : a) {
            if (laSoNguyenTo(x)) {
                System.out.print(x + " ");
                dem++;
            }
        }

        System.out.println("\nSo luong so nguyen to: " + dem);
    }
}
