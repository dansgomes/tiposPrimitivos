package estudosPrivatePublic;

 class Carro {
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    public String getMarca(){
        return this.marca;
    }



    public void setMarca(String marca){
        this.marca = marca;
    }
    void exibirAutonomia(){

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }

    public double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado. ");

        return capCombustivel * consumoCombustivel;
    }

     private double divideKMPorConsumoCombustivel(double km){
         return km/this.consumoCombustivel;
     }

    public double calcularCombustivel(double km){

        return this.divideKMPorConsumoCombustivel(km);
    }
}
