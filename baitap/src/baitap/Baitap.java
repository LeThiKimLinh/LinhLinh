package baitap;

import java.util.Scanner;

public class Baitap {

    // ================== BÀI 5 - HÀM ==================
    public static void nhapMang(double[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap diem[" + i + "]: ");
            arr[i] = sc.nextDouble();
        }
    }

    public static void xuatMang(double[] arr) {
        System.out.print("Danh sach diem: ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static double tinhDiemTrungBinh(double[] arr) {
        double tong = 0;
        for (double x : arr) {
            tong += x;
        }
        return tong / arr.length;
    }

    public static String xepLoai(double dtb) {
        if (dtb >= 8.0) return "Gioi";
        else if (dtb >= 6.5) return "Kha";
        else if (dtb >= 5.0) return "Trung binh";
        else return "Yeu";
    }

    // ================== MAIN ==================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================== BÀI 1 ==================
        System.out.println("=== BAI 1 ===");
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap nam sinh: ");
        int namSinh = sc.nextInt();

        int tuoi = 2025 - namSinh;
        System.out.println("Tuoi: " + tuoi);

        if (tuoi >= 18) {
            System.out.println("Du tuoi lao dong");
        } else {
            System.out.println("Chua du tuoi lao dong");
        }

        // ================== BÀI 2 ==================
        System.out.println("\n=== BAI 2 ===");
        System.out.println("1. Tinh tong");
        System.out.println("2. Tinh hieu");
        System.out.println("3. Tinh tich");
        System.out.println("4. Tinh thuong");
        System.out.print("Chon chuc nang: ");
        int chon = sc.nextInt();

        System.out.print("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so b: ");
        double b = sc.nextDouble();

        switch (chon) {
            case 1:
                System.out.println("Tong = " + (a + b));
                break;
            case 2:
                System.out.println("Hieu = " + (a - b));
                break;
            case 3:
                System.out.println("Tich = " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Loi: Khong chia duoc cho 0");
                } else {
                    System.out.println("Thuong = " + (a / b));
                }
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }

        // ================== BÀI 3 ==================
        System.out.println("\n=== BAI 3 ===");
        int n;
        do {
            System.out.print("Nhap n (>0): ");
            n = sc.nextInt();
        } while (n <= 0);

        int tong = 0;
        long giaiThua = 1;
        int demChan = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
            giaiThua *= i;
            if (i % 2 == 0) demChan++;
        }

        System.out.println("Tong 1 -> n = " + tong);
        System.out.println("Giai thua n = " + giaiThua);
        System.out.println("So luong so chan = " + demChan);

        // ================== BÀI 4 ==================
        System.out.println("\n=== BAI 4 ===");
        System.out.print("Nhap so phan tu: ");
        int m = sc.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int tongMang = 0;
        int max = arr[0];
        int demAm = 0;

        System.out.print("Mang: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
            tongMang += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < 0) demAm++;
        }
        System.out.println();

        System.out.println("Tong mang = " + tongMang);
        System.out.println("So lon nhat = " + max);
        System.out.println("So luong so am = " + demAm);

        // ================== BÀI 5 ==================
        System.out.println("\n=== BAI 5 ===");
        System.out.print("Nhap so luong diem: ");
        int k = sc.nextInt();

        double[] diem = new double[k];
        nhapMang(diem, sc);
        xuatMang(diem);

        double dtb = tinhDiemTrungBinh(diem);
        System.out.println("Diem trung binh = " + dtb);
        System.out.println("Xep loai = " + xepLoai(dtb));
    }
}
