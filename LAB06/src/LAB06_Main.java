import java.util.*;

// ===================== BAI 1 =====================
abstract class Shape {
    String name;
    abstract double area();
    void display() {
        System.out.println(name + " - Di\u1EC7n t\u00EDch: " + area());
    }
}

class RectangleShape extends Shape {
    double w, h;
    RectangleShape(double w, double h) {
        name = "H\u00ECnh ch\u1EEF nh\u1EADt";
        this.w = w; this.h = h;
    }
    double area() { return w * h; }
}

class CircleShape extends Shape {
    double r;
    CircleShape(double r) {
        name = "H\u00ECnh tr\u00F2n";
        this.r = r;
    }
    double area() { return Math.PI * r * r; }
}

// ===================== BAI 2 =====================
abstract class Employee {
    String id, name;
    abstract double calculateSalary();
    void showInfo() {
        System.out.println(id + " - " + name + " - L\u01B0\u01A1ng: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double salary;
    FullTimeEmployee(String id, String name, double s) {
        this.id = id; this.name = name; salary = s;
    }
    double calculateSalary() { return salary; }
}

class PartTimeEmployee extends Employee {
    int hours; double rate;
    PartTimeEmployee(String id, String name, int h, double r) {
        this.id = id; this.name = name; hours = h; rate = r;
    }
    double calculateSalary() { return hours * rate; }
}

// ===================== BAI 3 =====================
abstract class Vehicle {
    String brand;
    abstract int getMaxSpeed();
    void showInfo() {
        System.out.println("H\u00E3ng xe: " + brand + " - T\u1ED1c \u0111\u1ED9 t\u1ED1i \u0111a: " + getMaxSpeed());
    }
}

class Car extends Vehicle {
    Car(String b) { brand = b; }
    int getMaxSpeed() { return 180; }
}

// ===================== BAI 4 =====================
abstract class Animal {
    String name;
    abstract void makeSound();
    abstract void move();
    void show() {
        System.out.println("T\u00EAn: " + name);
        makeSound();
        move();
    }
}

class Dog extends Animal {
    Dog() { name = "Ch\u00F3"; }
    void makeSound() { System.out.println("S\u1EE7a"); }
    void move() { System.out.println("Ch\u1EA1y"); }
}

class Cat extends Animal {
    Cat() { name = "M\u00E8o"; }
    void makeSound() { System.out.println("Meo meo"); }
    void move() { System.out.println("\u0110i nh\u1EB9"); }
}

class Bird extends Animal {
    Bird() { name = "Chim"; }
    void makeSound() { System.out.println("H\u00F3t"); }
    void move() { System.out.println("Bay"); }
}

// ===================== MAIN =====================
public class LAB06_Main {
    public static void main(String[] args) {

        System.out.println("===== LAB 06 – B\u1EA2N C\u00D3 D\u1EA4U =====");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RectangleShape(4, 5));
        shapes.add(new CircleShape(3));
        for (Shape s : shapes) s.display();

        new FullTimeEmployee("E01", "An", 8000).showInfo();

        Vehicle v = new Car("Toyota");
        v.showInfo();

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();

        a1.show();
        a2.show();
        a3.show();
    }
}