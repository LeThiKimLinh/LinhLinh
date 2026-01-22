package baitap;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxCount = 0;
        int value = a[0];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                value = a[i];
            }
        }

        System.out.println("So xuat hien nhieu nhat: " + value);
        System.out.println("So lan xuat hien: " + maxCount);
    }
}
