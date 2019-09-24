/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2;

/**
 *
 * @author Turma A
 */
public class NumericalUtilities {

    public static int powerOf(int base, int potencia) {
        int res = 1;
        for (int i = 1; i <= potencia; i++) {
            res = base * res;
        }
        return res;
    }

    public static int sumOfNaturalNumbersUpTo(int numero) {
        int res = 0;
        for (int i = 0; i <= numero; i++) {
            res = res + i;
        }
        return res;
    }

    public static int sumOfNaturalNumbersBetween(int numero1, int numero2) {
        int res = 0;
        for (int i = numero1; i <= numero2; i++) {
            res = res + i;
        }
        return res;
    }

    public static int sumOfEvenNumbersBetween(int numero1, int numero2) {
        int res = 0;
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                res = res + i;
            }
        }
        return res;
    }

    public static int numberOfDivisorsOf(int numero) {
        int res = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                res += 1;
            }
        }
        return res;
    }

    public static boolean isPrime(int numero) {
        int res = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                res += 1;
            }
        }
        return res == 2;
    }
}
