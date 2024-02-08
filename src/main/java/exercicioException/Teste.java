package exercicioException;

import java.util.Scanner;

public class Teste {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        int opcao = obterOpcaoMenu(scan);
    }

    public static int obterOpcaoMenu(Scanner scan){

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida){
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try{
                opcao = scan.nextInt();

                if (opcao != 1 || opcao != 2 || opcao != 3 ){
                    throw new Exception("Entrada inválida");
                }else {
                    entradaValida = true;
                }
            }
            catch (Exception e){
                System.out.println("Entrada inválida, digite novamente");
            }
        }
    return opcao;
    }
}
