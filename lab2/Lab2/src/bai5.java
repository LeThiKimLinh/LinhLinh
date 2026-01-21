import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("So lon hon la: " + a);
        } else if (b > a) {
            System.out.println("So lon hon la: " + b);
        } else {
            System.out.println("Hai so bang nhau");
        }
    }
}
