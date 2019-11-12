/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class Ficha7 {

    public enum Command {
        START, SAVE_GAME, LOAD_GAME, HIGH_SCORES, QUIT;
    }

    public static void main(String[] args) {
        Command[] options = Command.values();

        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opçao: ");
        String line = scanner.nextLine();
        Command input = Command.valueOf(line);
        
        if (input == Command.START) {
            System.out.println("The game starts...");
        } else if (input == Command.SAVE_GAME) {
            System.out.println("Game save complete.");
        } else if (input == Command.LOAD_GAME) {
            System.out.println("Load successful");
        } else if (input == Command.HIGH_SCORES) {
            System.out.println("Checking the high scores...");
        } else if (input == Command.QUIT) {
            System.out.println("Until next time...");
        }
        
        if (null != input) switch (input) {
            case START:
                System.out.println("The game starts...");
                break;
            case SAVE_GAME:
                System.out.println("Game save complete.");
                break;
            case LOAD_GAME:
                System.out.println("Load successful");
                break;
            case HIGH_SCORES:
                System.out.println("Checking the high scores...");
                break;
            case QUIT:
                System.out.println("Until next time...");
                break;
            default:
                break;
        }
         */
        Rational r1 = new Rational(7, 3);
        Rational r2 = new Rational(2, 5);
        Rational r3 = new Rational(2, 6);
        Rational r4 = new Rational(2, 7);

        ArrayList<Rational> rationals = new ArrayList<>();

        rationals.add(r1);
        rationals.add(r2);
        rationals.add(r3);
        rationals.add(r4);

        System.out.println(rationals.toString());
        Collections.sort(rationals);
        System.out.println(rationals.toString());
    }

}
