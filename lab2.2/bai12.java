package baitap;
import java.util.Scanner;

public class bai12 {

    static int tongChuSo(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Ket qua:");
        for (int x : a) {
            System.out.println(x + " -> Tong chu so = " + tongChuSo(x));
        }
    }
}
