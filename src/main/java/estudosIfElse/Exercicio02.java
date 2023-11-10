package estudosIfElse;

import java.util.Scanner;

public class Exercicio02 {

    // Entre com o número e informe se é positivo ou negativo

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        if (num>= 0){
            System.out.println("O número informado é positivo " + num);
        }else
            System.out.println("O número informado é negativo " + num);
    }
}
