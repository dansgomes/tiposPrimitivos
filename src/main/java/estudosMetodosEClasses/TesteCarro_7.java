package estudosMetodosEClasses;

public class TesteCarro_7 {

    public static void main (String [] args){

        Carro_7 van = new Carro_7();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

    }
}
