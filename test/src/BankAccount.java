package com.megabank.models;

public class BankAccount {

    String owner;
    double balance;

    boolean debit(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    void credit(double amount) {
        balance += amount;
    }

    // ===== HÀM MAIN ĐỂ CHẠY =====
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.owner = "Linh";
        acc.balance = 1000;

        boolean kq = acc.debit(300);

        System.out.println("Chu tai khoan: " + acc.owner);
        System.out.println("Rut tien thanh cong? " + kq);
        System.out.println("So du con lai: " + acc.balance);
    }
}
