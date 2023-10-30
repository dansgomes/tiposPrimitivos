package EstudosIfElse;

import java.util.Scanner;

public class Exercicio01 {

    // Entre com dois números e informe qual é o maior número

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O num1 é maior " + num1);
        }else {
                System.out.println("o num2 é maior " + num2);
            }
        }
    }

