/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha1;

/**
 *
 * @author Turma A
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        // System.out.println("Hello World");
        int base = 2;
        int comprimento = 2;

        int altura = 3;

        double graus = 70;

        int p = Ficha1.calculaPerimetro(base, comprimento);

        int v = Ficha1.calculaVolumeParalelepipedo(base, comprimento, altura);

        double c = Ficha1.converteF(graus);

        System.out.println("Perimetro do Rectangulo é: " + p);

        System.out.println("Volume do Paralelepípedo é: " + v);

        System.out.println(graus + " graus Farenheit é equivalente a " + c + " graus centígrados.");

        int[] hora1 = {17, 0, 0};
        int[] hora2 = {18, 1, 0};

        int intervalo = Ficha1.converteTempo(hora1, hora2);
        System.out.println("O intervalo em segundos é: " + intervalo);

        int[] valores = {40, 15, 2, 30, 7, 50};
        int max = Ficha1.maximo(valores);
        int min = Ficha1.minimo(valores);
        int med = Ficha1.media(valores);

        System.out.println("O maior valor é: " + max);
        System.out.println("O menor valor é: " + min);
        System.out.println("A média dos valores é: " + med);

    }
}