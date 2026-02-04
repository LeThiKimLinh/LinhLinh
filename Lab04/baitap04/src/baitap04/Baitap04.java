package baitap04;

public class Baitap04 {

    public static void main(String[] args) {

        // ===== BAI 1 =====
        System.out.println("=== BAI 1 ===");
        Student s = new Student();
        s.input("SV01", "Nguyen Van A", 7.5);
        s.display();
        System.out.println(s.isPass() ? "=> Dau" : "=> Rot");

        // ===== BAI 2 =====
        System.out.println("\n=== BAI 2 ===");
        BankAccount acc = new BankAccount();
        acc.accountNumber = "123456";
        acc.ownerName = "Nguyen Van B";
        acc.balance = 1000;
        acc.deposit(500);
        acc.displayInfo();
        acc.withdraw(300);
        acc.displayInfo();

        // ===== BAI 3 =====
        System.out.println("\n=== BAI 3 ===");
        Book b1 = new Book();
        Book b2 = new Book("B01", "Java OOP", 50);
        b1.display();
        b2.display();

        // ===== BAI 4 =====
        System.out.println("\n=== BAI 4 ===");
        Employee e1 = new Employee("An");
        Employee e2 = new Employee("E01", "Binh", -500);
        e1.display();
        e2.display();

        // ===== BAI 5 =====
        System.out.println("\n=== BAI 5 ===");
        Calculator cal = new Calculator();
        System.out.println(cal.add(2, 3));
        System.out.println(cal.add(2.5, 3.5));
        System.out.println(cal.add(1, 2, 3));

        // ===== BAI 6 =====
        System.out.println("\n=== BAI 6 ===");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3);
        Rectangle r3 = new Rectangle(2, 4);
        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
        System.out.println(r3.getArea());

        // ===== BAI 7 =====
        System.out.println("\n=== BAI 7 ===");
        Address ad = new Address("123 Le Loi", "Ha Noi");
        Student2 s2 = new Student2("SV02", "Tran Van C", ad);
        s2.display();

        // ===== BAI 8 =====
        System.out.println("\n=== BAI 8 ===");
        Employee2 emp = new Employee2("E02", "Lan");
        Department dept = new Department("IT", emp);
        dept.display();

        // ===== BAI 9 =====
        System.out.println("\n=== BAI 9 ===");
        CPU cpu = new CPU("Intel", 3.2);
        Computer com = new Computer("Dell", cpu);
        com.displayInfo();

        // ===== BAI 10 =====
        System.out.println("\n=== BAI 10 ===");
        Teacher t = new Teacher("Mr Nam", "Java");
        ClassRoom c = new ClassRoom("CNTT1", t);
        c.display();
    }
}

// ===== BAI 1 =====
class Student {
    String id;
    String name;
    double score;

    void input(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    void display() {
        System.out.println("Ma SV: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Diem: " + score);
    }

    boolean isPass() {
        return score >= 5;
    }
}

// ===== BAI 2 =====
class BankAccount {
    String accountNumber;
    String ownerName;
    double balance;

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    void displayInfo() {
        System.out.println("So TK: " + accountNumber);
        System.out.println("Chu TK: " + ownerName);
        System.out.println("So du: " + balance);
    }
}

// ===== BAI 3 =====
class Book {
    String id;
    String title;
    double price;

    Book() {
        price = 0;
    }

    Book(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(id + " - " + title + " - " + price);
    }
}

// ===== BAI 4 =====
class Employee {
    String id;
    String name;
    double salary;

    Employee(String name) {
        this.name = name;
        this.salary = 0;
    }

    Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary < 0 ? 0 : salary;
    }

    void display() {
        System.out.println(id + " - " + name + " - " + salary);
    }
}

// ===== BAI 5 =====
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}

// ===== BAI 6 =====
class Rectangle {
    double width, height;

    Rectangle() {
        width = height = 1;
    }

    Rectangle(double side) {
        width = height = side;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }
}

// ===== BAI 7 =====
class Address {
    String street, city;

    Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

class Student2 {
    String id, name;
    Address address;

    Student2(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " - " + name);
        System.out.println(address.street + ", " + address.city);
    }
}

// ===== BAI 8 =====
class Employee2 {
    String id, name;

    Employee2(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Department {
    String deptName;
    Employee2 employee;

    Department(String deptName, Employee2 employee) {
        this.deptName = deptName;
        this.employee = employee;
    }

    void display() {
        System.out.println(deptName + " - " + employee.name);
    }
}

// ===== BAI 9 =====
class CPU {
    String brand;
    double speed;

    CPU(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Computer {
    String model;
    CPU cpu;

    Computer(String model, CPU cpu) {
        this.model = model;
        this.cpu = cpu;
    }

    void displayInfo() {
        System.out.println(model + " - " + cpu.brand + " - " + cpu.speed + "GHz");
    }
}

// ===== BAI 10 =====
class Teacher {
    private String name, specialization;

    Teacher(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    String getName() {
        return name;
    }

    String getSpecialization() {
        return specialization;
    }
}

class ClassRoom {
    private String className;
    private Teacher teacher;

    ClassRoom(String className) {
        this.className = className;
    }

    ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
    }

    void display() {
        System.out.println("Lop: " + className);
        System.out.println("GV: " + teacher.getName() + " - " + teacher.getSpecialization());
    }
}
