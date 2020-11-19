package com.vrbprog;

public class Fractions {

    private long integerPart;
    private short pointPart;


    public Fractions(double number) {
        String s = String.format("%.2f", number);
        double numberFormat = Double.parseDouble(s.replace(',', '.'));
        integerPart = (long) numberFormat;
        double d = (numberFormat - integerPart) * 100.01;
        pointPart = (short) d;
    }

    public long getIntegerPart() {
        return integerPart;
    }

    public short getPointPart() {
        return pointPart;
    }

    public static Fractions sumFractions(Fractions f1, Fractions f2) {
        long firstFraction = f1.integerPart * 100L + f1.pointPart;
        long secondFraction = f2.integerPart * 100L + f2.pointPart;
        long result = firstFraction + secondFraction;
        double dRes = result / 100.0;
        return new Fractions(dRes);
    }

    public static Fractions subFractions(Fractions f1, Fractions f2) {
        long firstFraction = f1.integerPart * 100L + f1.pointPart;
        long secondFraction = f2.integerPart * 100L + f2.pointPart;
        long result = firstFraction - secondFraction;
        double dRes = result / 100.0;
        return new Fractions(dRes);
    }

    public static Fractions multFractions(Fractions f1, Fractions f2) {
        long firstFraction = f1.integerPart * 100L + f1.pointPart;
        long secondFraction = f2.integerPart * 100L + f2.pointPart;
        long result = firstFraction * secondFraction;
        double dRes = result / 10000.0;
        return new Fractions(dRes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fractions)) return false;

        Fractions fractions = (Fractions) o;

        if (integerPart != fractions.integerPart) return false;
        return pointPart == fractions.pointPart;
    }

    @Override
    public int hashCode() {
        int result = (int) (integerPart ^ (integerPart >>> 32));
        result = 31 * result + (int) pointPart;
        return result;
    }

    @Override
    public String toString() {
        return integerPart + "." + (pointPart > 9 ? pointPart :
                                   (pointPart > 0 ? "0" + pointPart :
                                   (pointPart < -9 ? pointPart * (-1) : "0" + pointPart * (-1))));
    }

}
