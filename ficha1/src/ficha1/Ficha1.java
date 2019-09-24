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
public class Ficha1 {

    public static int calculaPerimetro(int largura, int comprimento){
        int perimetro = 2* (largura + comprimento);
        return perimetro;
    }
    
    public static int calculaVolumeParalelepipedo(int comprimento, int altura, int largura){
        int volume = comprimento * altura * largura;
        return volume;
    }
    
    public static double converteF(double farenheit){
        double centigrados = (farenheit - 32) * 5/9;
        return centigrados;
    }
    
    public static int converteTempo(int[] tempo1, int[] tempo2){
        int horas = (tempo2[0] - tempo1[0]) * 3600;
        int minutos = (tempo2[1] - tempo1[1]) * 60;
        int segundos = tempo2[2] - tempo1[2];
        
        int totalIntervalo = horas + minutos + segundos;
        return totalIntervalo;
    }
    
    public static int maximo(int[] valores) {
        int maior = 0;
        int i = 0;
        while (i < valores.length) {
            if (valores[i] >= maior) {
                maior = valores[i];
            }
            i++;
        }
        
        return maior;
    }

    public static int minimo(int[] valores) {
        int menor = valores[0];
        int i = 0;
        while (i < valores.length) {
            if (valores[i] <= menor) {
                menor = valores[i];
            }
            i++;
        }
        
        return menor;
    }

    public static int media(int[] valores) {
        int media = 0;
        int med = 0;
        for (int i = 0; i < valores.length; i++) {
            med = med + valores[i]; 
        }
        media = med / valores.length;
        return media;
    }
}
