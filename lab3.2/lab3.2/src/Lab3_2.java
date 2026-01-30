import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== BÀI 1: STUDENT =====
        Student st = new Student();
        st.input(sc);
        st.display();
        if (st.isPass()) {
            System.out.println("Sinh viên ĐẠT");
        } else {
            System.out.println("Sinh viên KHÔNG ĐẠT");
        }

        // ===== BÀI 2: RECTANGLE =====
        Rectangle r = new Rectangle();
        r.input(sc);
        r.display();
        System.out.println("Diện tích: " + r.getArea());
        System.out.println("Chu vi: " + r.getPerimeter());

        // ===== BÀI 3: EMPLOYEE =====
        Employee e = new Employee();
        e.input(sc);
        e.display();
        double tax = e.calculateTax();
        if (tax == 0) {
            System.out.println("Không phải đóng thuế");
        } else {
            System.out.println("Thuế phải đóng: " + tax);
        }

        // ===== BÀI 4: CIRCLE =====
        Circle c = new Circle();
        c.input(sc);
        System.out.println("Diện tích: " + c.getArea());
        System.out.println("Chu vi: " + c.getPerimeter());
        if (c.isBigCircle()) {
            System.out.println("Hình tròn lớn");
        } else {
            System.out.println("Hình tròn nhỏ");
        }

        // ===== BÀI 5: BANK ACCOUNT =====
        BankAccount acc = new BankAccount("123456", "Nguyen Van A", 5000000);
        acc.display();
        acc.deposit(2000000);
        acc.withdraw(3000000);

        // ===== BÀI 6: PRODUCT =====
        Product p = new Product();
        p.input(sc);
        p.display();
        System.out.println("Tổng tiền: " + p.getTotalPrice());
        p.discount(10);
        p.display();

        // ===== BÀI 7: CAR =====
        Car car = new Car(50);
        car.accelerate(60);
        car.brake(20);
        car.displayStatus();
        if (car.isOverSpeed()) {
            System.out.println("Xe đang vượt quá tốc độ cho phép");
        }

        // ===== BÀI 8: BOOK =====
        Book b = new Book();
        b.input(sc);
        b.display();
        if (b.isExpensive()) {
            System.out.println("Sách có giá cao");
        }
        if (b.isOldBook()) {
            System.out.println("Sách xuất bản trước năm 2015");
        }
    }
}

// ===== CÁC CLASS PHỤ (KHÔNG PUBLIC) =====

class Student {
    String id, name;
    double score;

    void input(Scanner sc) {
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Score: ");
        score = sc.nextDouble();
        sc.nextLine();
    }

    void display() {
        System.out.println(id + " - " + name + " - " + score);
    }

    boolean isPass() {
        return score >= 5;
    }
}

class Rectangle {
    double length, width;

    void input(Scanner sc) {
        System.out.print("Length: ");
        length = sc.nextDouble();
        System.out.print("Width: ");
        width = sc.nextDouble();
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Length: " + length + " – Width: " + width);
    }
}

class Employee {
    String id, name;
    double salary;

    void input(Scanner sc) {
        sc.nextLine();
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id + " – Name: " + name + " – Salary: " + salary);
    }

    double calculateTax() {
        if (salary > 10000000) return salary * 0.1;
        return 0;
    }
}

class Circle {
    double radius;

    void input(Scanner sc) {
        System.out.print("Radius: ");
        radius = sc.nextDouble();
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    boolean isBigCircle() {
        return getArea() > 100;
    }
}

class BankAccount {
    String accountNumber, ownerName;
    double balance;

    BankAccount(String acc, String owner, double bal) {
        accountNumber = acc;
        ownerName = owner;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Số dư: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        System.out.println("Số dư: " + balance);
    }

    void display() {
        System.out.println("STK: " + accountNumber + " – Chủ TK: " + ownerName + " – Số dư: " + balance);
    }
}

class Product {
    String id, name;
    double price;
    int quantity;

    void input(Scanner sc) {
        sc.nextLine();
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Quantity: ");
        quantity = sc.nextInt();
    }

    double getTotalPrice() {
        return price * quantity;
    }

    void discount(double percent) {
        price -= price * percent / 100;
    }

    void display() {
        System.out.println("id:" + id + " – Name: " + name + " – Price: " + price + " – Quantity: " + quantity);
    }
}

class Car {
    String model = "Default";
    int speed;

    Car(int speed) {
        this.speed = speed;
    }

    void accelerate(int v) {
        speed += v;
    }

    void brake(int v) {
        speed -= v;
        if (speed < 0) speed = 0;
    }

    void displayStatus() {
        System.out.println("Model: " + model + " – Speed: " + speed);
    }

    boolean isOverSpeed() {
        return speed > 100;
    }
}

class Book {
    String title, author;
    double price;
    int year;

    void input(Scanner sc) {
        sc.nextLine();
        System.out.print("Title: ");
        title = sc.nextLine();
        System.out.print("Author: ");
        author = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Year: ");
        year = sc.nextInt();
    }

    void display() {
        System.out.println("Title: " + title + " – Author: " + author + " – Price: " + price + " – Year: " + year);
    }

    boolean isExpensive() {
        return price > 200000;
    }

    boolean isOldBook() {
        return year < 2015;
    }
}
