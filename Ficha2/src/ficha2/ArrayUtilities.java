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
public class ArrayUtilities {
    public static String toString(int[] array){
        String texto = "";
        for (int i = 0; i < array.length; i++) {
            texto += array[i];
            if (i == array.length - 1){
                texto += ".";
            } else {
                texto += ", ";
            }
        }
        return texto;
    }
    
    public static int maximumOf(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
    
    public static int minimumOf(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
    
    public static int[] copyOf(int[] array) {
        int[] copiaArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiaArray[i] = array[i];            
        }
        return copiaArray;
    }
    
    public static boolean contains(int[] array, int valor){
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                res = 1;
                break;
            }
        }
        return res == 1;
    }
    
    public static boolean containsDuplicates(int[] array) {
        int repetido = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]) {
                    repetido = 1;
                }
            }
        }
        return repetido == 1;
    }
    
    public static int indexOf(int[] array, int valor) {
        int res = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                res = i;
                break;
            }
        }
        return res;
    }
    
    public static int[] add(int[] array, int valor) {
        int[] arrayValor = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayValor[i] = array[i];           
        }
        arrayValor[array.length] = valor;
        return arrayValor;
    }
    
    public static int[] remove(int[] array, int valor) {
        int[] arrayValor = new int[array.length - 1];
        int index = indexOf(array, valor);
        if (index == -1){
            return array;
        } else {
            
        }
        
        return arrayValor;
    }
}
