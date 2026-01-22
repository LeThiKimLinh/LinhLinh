package baitap;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mat khau: ");
        String s = sc.nextLine();

        boolean hoa = false, thuong = false, so = false, dacbiet = false;

        if (s.length() >= 8) {
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) hoa = true;
                else if (Character.isLowerCase(c)) thuong = true;
                else if (Character.isDigit(c)) so = true;
                else dacbiet = true;
            }
        }

        if (hoa && thuong && so && dacbiet)
            System.out.println("Mat khau MANH");
        else
            System.out.println("Mat khau YEU");
    }
}
