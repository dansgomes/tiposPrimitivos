package estudosConstrutores;

public class CarroThis {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    CarroThis(String marca, String modelo){
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }

    public CarroThis(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
        System.out.println("construtor com 3 parametros");
    }

    public CarroThis(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("chamando construtor com 3 parametros");
    }

    void exibirAutonomia(){

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }

    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado. ");

        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}
