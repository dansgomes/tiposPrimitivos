package estudosMetodosEClasses;

public class Exercicio01 {

    public static void main (String [] args){

        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "amarela";
        lampada.tipoLuz = "amarela";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
    }
}
