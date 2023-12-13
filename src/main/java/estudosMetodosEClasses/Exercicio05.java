package estudosMetodosEClasses;

public class Exercicio05 {
    public static void main (String [] args){

        ContaCorrente conta = new ContaCorrente();

        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero);
        System.out.println("Agencia " + conta.agencia);
        System.out.println("Conta especial?" + conta.especial);
        System.out.println("Limite especial " + conta.limiteEspecial);
        System.out.println("Saldo " + conta.saldo);
    }
}
