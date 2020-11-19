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
        Fractions fff = new Fractions(45.364);
        System.out.println("fff.equals(ff) is : " + fff.equals(ff));
        System.out.println("Sum f and ff is : " + Fractions.sumFractions(f, ff));
        System.out.println("Sub f from ff is :" + Fractions.subFractions(ff, f));
        double dol = 123.61;
        double kurs = 28.26;
        Fractions dollars = new Fractions(dol);
        Fractions kursDol = new Fractions(kurs);
        System.out.println(dol + " $ is " + Fractions.multFractions(dollars, kursDol) + " UAH\n\r");

        //Task 5
        Money moneyOne = new Money(254.09);
        System.out.println("Money moneyOne is : " + moneyOne);
        Money moneyTwo = new Money(254.0943);
        System.out.println("Money moneyTwo is : " + moneyTwo);
        System.out.println("moneyOne.equals(moneyTwo) is : " + moneyOne.equals(moneyTwo));
        Money moneyThree = new Money(-16.34);
        System.out.println("Money moneyThree is : " + moneyThree);
        System.out.println("moneyOne + moneyThree = " + Money.sumMoney(moneyOne, moneyThree));
        System.out.println("moneyOne - moneyThree = " + Money.subMoney(moneyOne, moneyThree));
        Money moneyUah = new Money(3493.22);
        Money moneyUsa = new Money(28.26);
        System.out.println("moneyUah / moneyUsa = " + Money.divMoney(moneyUah, moneyUsa));
        double euroKurs = 33.48;
        System.out.println("moneyUah / euroKurs = " + Money.divMoney(moneyUah, euroKurs));
        Money moneyEuro = new Money(167.26);
        System.out.println("moneyEuro * euroKurs = " + Money.multMoney(moneyEuro, euroKurs));
    }
}
