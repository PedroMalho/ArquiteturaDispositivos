/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3;

/**
 *
 * @author Turma A
 */
public class CaeserCipherDecipherer {
    public static String cipher(String str, int shift){
        char[] array = str.toCharArray();
        String codifica = "";
        for (int i = 0; i < array.length; i++) {
            codifica = codifica + CharacterUtilities.lowerLetterSuccessorStepsOf(array[i], shift);
        }
        return codifica;
    }
    
    public static String decipher(String str, int shift) {
        char[] array = str.toCharArray();
        String descodifica = "";
        for (int i = 0; i < array.length; i++) {
            descodifica = descodifica + CharacterUtilities.lowerLetterPredecessorStepsOf(array[i], shift);
        }
        return descodifica;
    }
}
