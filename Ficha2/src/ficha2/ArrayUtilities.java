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
}
