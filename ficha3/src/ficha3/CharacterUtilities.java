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
public class CharacterUtilities {
    public static char lowerLetterSuccessorOf(char letter) {
        if (letter == 'z'){
            return 'a';
        } else {
            letter++;
            return letter;
        }
    }
    
    public static char lowerLetterPredecessorOf(char letter) {
        if (letter == 'a'){
            return 'z';
        } else {
            letter--;
            return letter;
        }
    }
    
    public static char lowerLetterSuccessorStepsOf(char letter, int step) {
        if (letter == 'z') {
            letter = (char) ('a' + (step - 1));
            return letter;
        } else {
            letter = (char) (letter + step);
            return letter;
        }
    }
    
    public static char lowerLetterPredecessorStepsOf(char letter, int step) {
        for (int i = 0; i < step; i++) {
            if (letter == 'a'){
                letter = 'z';
                i++;
            } else {
                letter--;
            }
            
        }
        return letter;
    }
    
    public static int occurrencesOfCharacterIn(char[] characterArray, char character) {
        int repeat = 0;
        for(int i = 0; i < characterArray.length; i++){
            if (characterArray[i] == character) {
                repeat++;
            }
        }
        return repeat;
    }
    
    public static char[] replaceCharacterIn(char[] characterArray, char characterOld, char characterNew) {
        for (int i = 0; i < characterArray.length; i++) {
            if (characterArray[i] == characterOld) {
                characterArray[i] = characterNew;
            }
        }
        return characterArray;
    }
    
    public static char[] concatenationOf(char[] characterArrayOne, char[] characterArrayTwo) {
        char[] concatenatedArray = new char[characterArrayOne.length + characterArrayTwo.length];
        int counter = 0;
        for (int i = 0; i < characterArrayOne.length; i++) {
            concatenatedArray[counter] = characterArrayOne[i];
            counter++;
        };
        for (int i = 0; i < characterArrayTwo.length; i++) {
            concatenatedArray[counter] = characterArrayTwo[i];
            counter++;
        }
        return concatenatedArray;
    }
    
    public static char[] copyOfPartOf(char[] array, int indexStart, int indexEnd) {
        char[] partOfArray = new char[(indexEnd - indexStart)+1];
        int index = 0;
        for (int i = indexStart; i <= indexEnd; i++) {
            partOfArray[index] = array[i];
            index++;
        }
        return partOfArray;
    }
}
