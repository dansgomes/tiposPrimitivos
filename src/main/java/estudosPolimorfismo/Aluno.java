package estudosPolimorfismo;

public class Aluno extends Pessoa {


    private String curso;
    private double[] notas;

    public void verificarAcesso(){

        this.nomeVisibilidade = "seshe";
        super.nomeVisibilidade = "seche";
    }

    public Aluno() {
        super();
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public String obterEtiquetaEndereco (){

        String s = "Endereço do Aluno: ";
        s += super.getEndereco();

        return s;
    }
}
