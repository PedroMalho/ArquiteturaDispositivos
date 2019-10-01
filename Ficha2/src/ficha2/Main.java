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
public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        
        int[] array = {1,2,3,-5};
        
        int resul = NumericalUtilities.powerOf(a, b);
        System.out.println(resul);
        
        System.out.println("Soma: " + NumericalUtilities.sumOfNaturalNumbersUpTo(b));
        
        System.out.println("Soma naturais: " + NumericalUtilities.sumOfNaturalNumbersBetween(2, b));
        
        System.out.println("Soma pares: " + NumericalUtilities.sumOfEvenNumbersBetween(1, 10));
        
        System.out.println("Numero de Divisores: " + NumericalUtilities.numberOfDivisorsOf(11));
        
        System.out.println("isPrime: " + NumericalUtilities.isPrime(113));
        
        System.out.println("Array to String: " + ArrayUtilities.toString(array));
        
        System.out.println("Maior no array: " + ArrayUtilities.maximumOf(array));
        
        System.out.println("Menor no array: " + ArrayUtilities.minimumOf(array));
        
        System.out.println("Copia do array: " + ArrayUtilities.toString(ArrayUtilities.copyOf(array)));

        System.out.println("Contem numero: " + ArrayUtilities.contains(array, 3));
        
        System.out.println("Contem repetidos: " + ArrayUtilities.containsDuplicates(array));
        
        System.out.println("Index do valor(-1 se nao existir): " + ArrayUtilities.indexOf(array, -5));
        
        System.out.println("Adiciona valor ao array: " + ArrayUtilities.toString(ArrayUtilities.add(array, 7)));
        
        System.out.println("Remove valor do array: " + ArrayUtilities.toString(ArrayUtilities.remove(array, 2)));
    }
}
