package estudosMetodosEClasses;

public class Carro_7 {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }
}
