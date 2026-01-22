package baitap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int temp = n, sum = 0;
        int k = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += (int) Math.pow(d, k);
            temp /= 10;
        }

        if (sum == n)
            System.out.println("La so Armstrong");
        else
            System.out.println("Khong phai so Armstrong");
    }
}
