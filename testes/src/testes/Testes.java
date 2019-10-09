/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author Turma A
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int[] studentNumbers = {20032, 30312, 25342, 31432};
        final String[] courseAcronyms = {"AD", "WEB-FE", "WEB-BE"};
        final int[][] studentGrades = {
            {15, 18, 17},
            {18, 10, 11},
            {11, 13, 15},
            {10, 19, 16}
        };
        float media = 0;
        float average = 0;
        String str = null;
        for (int i = 0; i < studentNumbers.length; i++) {
            str = "O aluno " + studentNumbers[i] + " teve ";
            for (int k = 0; k < courseAcronyms.length; k++) {
                str += studentGrades[i][k] + " a " + courseAcronyms[k];
                if (k == courseAcronyms.length - 1){
                    str += ".";
                } else {
                    str += ", ";
                }
                media += studentGrades[i][k];
            }
            average = media/courseAcronyms.length;
            System.out.println(str + " Este aluno teve media de: " + average);
            media = 0;
        }
    }
    
}
