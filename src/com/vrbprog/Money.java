package com.vrbprog;

public class Money {

    private Fractions fractions;
    private byte penny;

    public Money(double data) {
        fractions = new Fractions(data);
        penny = (byte) fractions.getPointPart();
    }

    private Money(Fractions f) {
        fractions = f;
        penny = (byte) f.getPointPart();
    }

    public static Money sumMoney(Money one, Money two) {
        Fractions sum = Fractions.sumFractions(one.fractions, two.fractions);
        return new Money(sum);
    }

    public static Money subMoney(Money one, Money two) {
        Fractions sub = Fractions.subFractions(one.fractions, two.fractions);
        return new Money(sub);
    }

    public static Money multMoney(Money one, Money two) {
        Fractions mult = Fractions.multFractions(one.fractions, two.fractions);
        return new Money(mult);
    }

    public static Money divMoney(Money one, Money two) {
        long firstFraction = one.fractions.getIntegerPart() * 100L + one.fractions.getPointPart();
        long secondFraction = two.fractions.getIntegerPart() * 100L + two.fractions.getPointPart();
        double dRes = firstFraction / secondFraction + (firstFraction % secondFraction) * 1.0 / secondFraction;
        return new Money(dRes);
    }

    public static Money divMoney(Money divided, double divider) {
        return divMoney(divided, new Money(divider));
    }

    public static Money multMoney(Money one, double two) {
        return multMoney(one, new Money(two));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;

        Money money = (Money) o;

        if (penny != money.penny) return false;
        return fractions.equals(money.fractions);
    }

    @Override
    public int hashCode() {
        int result = fractions.hashCode();
        result = 31 * result + (int) penny;
        return result;
    }

    @Override
    public String toString() {
        return fractions.getIntegerPart() + "," + (penny > 9 ? penny :
                (penny > 0 ? "0" + penny :
                        (penny < -9 ? penny * (-1) : "0" + penny * (-1))));
    }
}
