package com.vrbprog;

public class Main {
    public static void main(String[] args) {

        // Task 1
        Circle circle = new Circle(1);
        System.out.println("Square of circle is : " + circle.getSquare() + "\n\r");

        // Task 2
        Student student = new Student("Egor", "Ivanov");
        System.out.println(student);
        System.out.println("Count of students is: " + Student.getCountStudent() + "\n\r");

        // Task 3
        Car car = new Car("Fiat");
        System.out.println(car);
        Car car2 = new Car("BMW");
        car2.startEngine();
        car2.move();
        car2.setSpeed(60);
        System.out.println(car2);

        // Task 4
        Fractions f = new Fractions(-123.056);
        System.out.println("\n\rFractions f : " + f);
        Fractions ff = new Fractions(45.361);
        System.out.println("Fractions ff : " + ff);
        System.out.println("f.equals(ff) is : " + f.equals(ff));
        System.out.println("Sum f and ff is : " + Fractions.sumFractions(f, ff));
        System.out.println("Sub f from ff is :" + Fractions.subFractions(ff, f));
        double dol = 123.61;
        double kurs = 28.26;
        Fractions dollars = new Fractions(dol);
        Fractions kursDol = new Fractions(kurs);
        System.out.println(dol + " $ is " + Fractions.multFractions(dollars, kursDol) + " UAH");

    }
}
