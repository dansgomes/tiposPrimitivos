package estudosIfElse;

import java.util.Scanner;

public class Exercicio10 {

    //Faça um programa que entre com o horário e cumprimente de acordo
    public static void main (String [] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o turno em que voce estuda");
        String turno = scan.next();

        switch(turno){
            case "m":
            case "M":System.out.println("Bom dia!"); break;
            case "v":
            case "V":System.out.println("Boa tarde!"); break;
            case "n":
            case "N":System.out.println("Boa noite!"); break;
            default:
                System.out.println("valor inválido");
        }

    }
}
