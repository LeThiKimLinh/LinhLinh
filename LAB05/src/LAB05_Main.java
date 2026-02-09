// ================== BÀI 1 ==================
class Person1 {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }
}

class Student extends Person1 {
    String studentId;

    @Override
    void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age + ", Mã SV: " + studentId);
    }
}

// ================== BÀI 2 ==================
class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee2 extends Person2 {
    double salary;

    Employee2(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void show() {
        System.out.println("Tên: " + name + ", Tuổi: " + age + ", Lương: " + salary);
    }
}

// ================== BÀI 3 ==================
class Animal3 {
    protected String name;

    void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog3 extends Animal3 {
    @Override
    void sound() {
        System.out.println(name + " sủa: Gâu gâu");
    }
}

// ================== BÀI 4 ==================
class Shape4 {
    double getArea() {
        return 0;
    }
}

class Rectangle4 extends Shape4 {
    double w, h;

    Rectangle4(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    double getArea() {
        return w * h;
    }
}

// ================== BÀI 5 ==================
class Vehicle5 {
    String brand;

    void start() {
        System.out.println("Xe đang khởi động");
    }
}

class Car5 extends Vehicle5 {
    int seatCount;
}

class ElectricCar5 extends Car5 {
    int battery;
}

// ================== BÀI 6 ==================
class Employee6 {
    double getSalary() {
        return 0;
    }
}

class FullTimeEmployee6 extends Employee6 {
    double salary;

    FullTimeEmployee6(double s) {
        salary = s;
    }

    @Override
    double getSalary() {
        return salary;
    }
}

class PartTimeEmployee6 extends Employee6 {
    double hour, rate;

    PartTimeEmployee6(double h, double r) {
        hour = h;
        rate = r;
    }

    @Override
    double getSalary() {
        return hour * rate;
    }
}

// ================== BÀI 7 ==================
abstract class Shape7 {
    public abstract double getArea();
}

class Circle7 extends Shape7 {
    double r;

    Circle7(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}

class Rectangle7 extends Shape7 {
    double w, h;

    Rectangle7(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double getArea() {
        return w * h;
    }
}

// ================== BÀI 8 ==================
class Person8 {
    String name;

    Person8(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Xin chào, tôi tên là " + name);
    }
}

class Teacher8 extends Person8 {
    String subject;

    Teacher8(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.println("Tôi dạy môn " + subject);
    }
}

// ================== BÀI 9 ==================
class Animal9 {
    void makeSound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog9 extends Animal9 {
    @Override
    void makeSound() {
        System.out.println("Chó sủa: Gâu gâu");
    }
}

class Cat9 extends Animal9 {
    @Override
    void makeSound() {
        System.out.println("Mèo kêu: Meo meo");
    }
}

// ================== BÀI 10 ==================
abstract class Employee10 {
    String id, name;

    Employee10(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();
}

class OfficeEmployee10 extends Employee10 {
    double fixed;

    OfficeEmployee10(String id, String name, double f) {
        super(id, name);
        fixed = f;
    }

    @Override
    public double calculateSalary() {
        return fixed;
    }
}

class SalesEmployee10 extends Employee10 {
    double base, commission;

    SalesEmployee10(String id, String name, double b, double c) {
        super(id, name);
        base = b;
        commission = c;
    }

    @Override
    public double calculateSalary() {
        return base + commission;
    }
}

// ================== MAIN ==================
public class LAB05_Main {
    public static void main(String[] args) {

        // FIX LỖI HIỂN THỊ TIẾNG VIỆT
        System.setProperty("file.encoding", "UTF-8");

        System.out.println("===== BÀI 1 =====");
        Student st = new Student();
        st.name = "Linh";
        st.age = 20;
        st.studentId = "SV01";
        st.displayInfo();

        System.out.println("\n===== BÀI 2 =====");
        Employee2 e2 = new Employee2("An", 25, 8000000);
        e2.show();

        System.out.println("\n===== BÀI 3 =====");
        Dog3 d3 = new Dog3();
        d3.name = "Cún";
        System.out.println("Con chó tên là: " + d3.name);
        d3.sound();

        System.out.println("\n===== BÀI 4 =====");
        Rectangle4 r4 = new Rectangle4(4, 5);
        System.out.println("Diện tích hình chữ nhật: " + r4.getArea());

        System.out.println("\n===== BÀI 5 =====");
        ElectricCar5 ec = new ElectricCar5();
        ec.brand = "Tesla";
        ec.seatCount = 5;
        ec.battery = 100;
        System.out.println("Hãng xe: " + ec.brand);
        ec.start();

        System.out.println("\n===== BÀI 6 =====");
        Employee6[] list6 = {
            new FullTimeEmployee6(10000000),
            new PartTimeEmployee6(80, 50000)
        };
        for (Employee6 e : list6) {
            System.out.println("Lương nhân viên: " + e.getSalary());
        }

        System.out.println("\n===== BÀI 7 =====");
        Shape7[] shapes = {
            new Circle7(3),
            new Rectangle7(4, 5)
        };
        for (Shape7 s : shapes) {
            System.out.println("Diện tích: " + s.getArea());
        }

        System.out.println("\n===== BÀI 8 =====");
        Teacher8 t8 = new Teacher8("Lan", "Toán");
        t8.introduce();

        System.out.println("\n===== BÀI 9 =====");
        Animal9 animal;
        animal = new Dog9();
        animal.makeSound();
        animal = new Cat9();
        animal.makeSound();

        System.out.println("\n===== BÀI 10 =====");
        Employee10[] list10 = {
            new OfficeEmployee10("E01", "An", 8000000),
            new SalesEmployee10("E02", "Bình", 5000000, 2000000)
        };

        double total = 0;
        for (Employee10 emp : list10) {
            double sal = emp.calculateSalary();
            System.out.println("Lương nhân viên: " + sal);
            total += sal;
        }
        System.out.println("Tổng lương công ty: " + total);
    }
}