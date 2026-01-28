public class Lab3_1 {
    public static void main(String[] args) {

        System.out.println("===== BAI 1: STUDENT =====");
        Student st = new Student("SV01", "Linh", 7.5);
        st.display();
        System.out.println("Pass? " + st.isPass());

        System.out.println("\n===== BAI 2: RECTANGLE =====");
        Rectangle r = new Rectangle(5, 3);
        r.display();
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        System.out.println("\n===== BAI 3: EMPLOYEE =====");
        Employee e = new Employee("E01", "An", 12000000);
        e.display();
        System.out.println("Tax: " + e.calculateTax());

        System.out.println("\n===== BAI 4: CIRCLE =====");
        Circle c = new Circle(6);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Big circle? " + c.isBigCircle());

        System.out.println("\n===== BAI 5: BANK ACCOUNT =====");
        BankAccount acc = new BankAccount("123456", "Linh", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.display();

        System.out.println("\n===== BAI 6: PRODUCT =====");
        Product p = new Product("P01", "Book", 90000, 3);
        p.display();
        System.out.println("Total price: " + p.getTotalPrice());

        System.out.println("\n===== BAI 7: CAR =====");
        Car car = new Car("Toyota", "Vios", 90);
        car.accelerate(20);
        car.displayStatus();
        System.out.println("Over speed? " + car.isOverSpeed());

        System.out.println("\n===== BAI 8: BOOK =====");
        Book b = new Book("Java", "Author A", 250000, 2014);
        b.display();
        System.out.println("Expensive? " + b.isExpensive());
        System.out.println("Old book? " + b.isOldBook());
    }
}

/* ===== BAI 1 ===== */
class Student {
    String id, name;
    double score;

    Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    boolean isPass() {
        return score >= 5;
    }

    void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Score: " + score);
    }
}

/* ===== BAI 2 ===== */
class Rectangle {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Length: " + length + " - Width: " + width);
    }
}

/* ===== BAI 3 ===== */
class Employee {
    String id, name;
    double salary;

    Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    double calculateTax() {
        return salary > 10000000 ? salary * 0.1 : 0;
    }

    void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Salary: " + salary);
    }
}

/* ===== BAI 4 ===== */
class Circle {
    double radius;

    Circle(double r) {
        radius = r;
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

/* ===== BAI 5 ===== */
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
    }

    boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    void display() {
        System.out.println("STK: " + accountNumber +
                " - Chu tai khoan: " + ownerName +
                " - So du: " + balance);
    }
}

/* ===== BAI 6 ===== */
class Product {
    String id, name;
    double price;
    int quantity;

    Product(String id, String name, double price, int q) {
        this.id = id;
        this.name = name;
        this.price = price;
        quantity = q;
    }

    double getTotalPrice() {
        return price * quantity;
    }

    void display() {
        System.out.println("ID: " + id + " - Name: " + name +
                " - Price: " + price + " - Quantity: " + quantity);
    }
}

/* ===== BAI 7 ===== */
class Car {
    String brand, model;
    int speed;

    Car(String b, String m, int s) {
        brand = b;
        model = m;
        speed = s;
    }

    void accelerate(int v) {
        speed += v;
    }

    boolean isOverSpeed() {
        return speed > 100;
    }

    void displayStatus() {
        System.out.println("Model: " + model + " - Speed: " + speed);
    }
}

/* ===== BAI 8 ===== */
class Book {
    String title, author;
    double price;
    int year;

    Book(String t, String a, double p, int y) {
        title = t;
        author = a;
        price = p;
        year = y;
    }

    boolean isExpensive() {
        return price > 200000;
    }

    boolean isOldBook() {
        return year < 2015;
    }

    void display() {
        System.out.println("Title: " + title +
                " - Author: " + author +
                " - Price: " + price +
                " - Year: " + year);
    }
}
