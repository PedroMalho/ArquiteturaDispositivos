/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7;

import java.util.Objects;

/**
 *
 * @author Turma A
 */
public class Rational implements Comparable<Rational> {

    private int numerator;
    private int denominator;

    public Rational() {
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final Rational other = (Rational) obj;

        return denominator == other.denominator && numerator == other.numerator;
    }

    @Override
    public int compareTo(final Rational another) {
        return getNumerator() * another.getDenominator()
                - another.getNumerator() * getDenominator();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
    
    
}
