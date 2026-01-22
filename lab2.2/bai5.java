package baitap;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String r = new StringBuilder(s).reverse().toString();

        if (s.equals(r))
            System.out.println("Palindrome");
        else
            System.out.println("Khong phai Palindrome");
    }
}
