package estudosDeMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {
    public static void main (String [] args){

    int [] [] numerosAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                numerosAleatorios [i] [j] = numeroRandom.nextInt();
            }
        }

    }
}
