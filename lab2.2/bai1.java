package baitap;

import java.util.Scanner;

class Student {
    String ma, ten;
    double diem;
}

public class bai1 {
    static Scanner sc = new Scanner(System.in);

    static void nhap(Student[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = new Student();
            System.out.print("Ma SV: ");
            a[i].ma = sc.nextLine();
            System.out.print("Ten SV: ");
            a[i].ten = sc.nextLine();
            System.out.print("Diem: ");
            a[i].diem = Double.parseDouble(sc.nextLine());
        }
    }

    static double diemTB(Student[] a) {
        double s = 0;
        for (Student x : a) s += x.diem;
        return s / a.length;
    }

    public static void main(String[] args) {
        System.out.print("Nhap so sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        Student[] a = new Student[n];
        nhap(a);

        System.out.println("Diem TB: " + diemTB(a));
    }
}
