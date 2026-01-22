package baitap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        int[] cnt = new int[256];
        for (char c : s.toCharArray())
            cnt[c]++;

        for (int i = 0; i < 256; i++)
            if (cnt[i] > 0)
                System.out.println((char) i + " : " + cnt[i]);
    }
}
