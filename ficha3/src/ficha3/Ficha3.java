/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3;

import java.util.Arrays;

/**
 *
 * @author Turma A
 */
public class Ficha3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = 'z';
        char[] array = {'a','b','c','c','c','d','f','f'};
        
        char[] array1 = {'a','b','c'};
        char[] array2 = {'d','e','f'};
        
        char[] array3 = {'a','b','c','d','e','f','g','h','i'};
        
        String codigo = "banana";
        
        System.out.println("lowerLetterSuccessorOf: " + CharacterUtilities.lowerLetterSuccessorOf(c));
        
        System.out.println("lowerLetterPredecessorOf: " + CharacterUtilities.lowerLetterPredecessorOf(c));
        
        System.out.println("lowerLetterSuccessorStepsOf: " + CharacterUtilities.lowerLetterSuccessorStepsOf(c, 5));
        
        System.out.println("lowerLetterPredecessorStepsOf: " + CharacterUtilities.lowerLetterPredecessorStepsOf(c, 2));
        
        System.out.println("occurrencesOfCharacterIn: " + CharacterUtilities.occurrencesOfCharacterIn(array, 'f'));
        
        System.out.println("replaceCharacterIn: " +  Arrays.toString(CharacterUtilities.replaceCharacterIn(array, 'a', 'r')));
        
        System.out.println("concatenationOf: " +  Arrays.toString(CharacterUtilities.concatenationOf(array1, array2)));
        
        System.out.println("copyOfPartOf: " +  Arrays.toString(CharacterUtilities.copyOfPartOf(array3, 0, 3)));
        
        System.out.println("codifica: " +  CaeserCipherDecipherer.cipher(codigo, 2));
        
        System.out.println("descodifica: " +  CaeserCipherDecipherer.decipher(codigo, 2));
    }
    
}
