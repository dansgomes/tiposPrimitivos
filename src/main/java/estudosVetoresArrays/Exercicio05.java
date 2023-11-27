package estudosVetoresArrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + "");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorB[i] + "");
        }
        System.out.println();
    }
}
