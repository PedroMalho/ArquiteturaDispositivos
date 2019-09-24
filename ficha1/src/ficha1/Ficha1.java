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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // System.out.println("Hello World");
        int base = 2;
        int comprimento = 2;
        
        int altura = 3;
        
        double graus = 70;
        
        int p = calculaPerimetro(base, comprimento);
        
        int v = calculaVolumeParalelepipedo(base, comprimento, altura);
        
        double c = converteF(graus);

        System.out.println("Perimetro do Rectangulo é: " + p);
        
        System.out.println("Volume do Paralelepípedo é: " + v);
        
        System.out.println(graus + " graus Farenheit é equivalente a " + c + " graus centígrados.");
        
        int[] hora1 = {17, 0, 0};
        int[] hora2 = {18, 1, 0};
        
        int intervalo = converteTempo(hora1, hora2);
        System.out.println("O intervalo em segundos é: " + intervalo);
        
        int[] valores = {40, 15, 2, 30, 7, 50};
        int max = maximo(valores);
        int min = minimo(valores);
        int med = media(valores);

        System.out.println(max);
        System.out.println(min);
        System.out.println(med);
    }
    
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
    
    private static int maximo(int[] valores) {
        int maior = 0;
        int i = 0;
        while (i < 6) {
            if (valores[i] >= maior) {
                maior = valores[i];
            }
            i++;
        }
        
        return maior;
    }

    private static int minimo(int[] valores) {
        int menor = valores[0];
        int i = 0;
        while (i < 6) {
            if (valores[i] <= menor) {
                menor = valores[i];
            }
            i++;
        }
        
        return menor;
    }

    private static int media(int[] valores) {
        int media = 0;
        int med = 0;
        for (int i = 0; i < 6; i++) {
            med = med + valores[i]; 
        }
        media = med / 6;
        return media;
    }
}
