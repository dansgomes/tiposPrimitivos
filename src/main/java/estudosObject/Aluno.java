package estudosObject;

import java.util.Arrays;
import java.util.Objects;

public  class Aluno {


    private String curso;
    private double[] notas;

    public void verificarAcesso(){

        //this.nomeVisibilidade = "seshe";
        //super.nomeVisibilidade = "seche";
    }

    public Aluno() {
        super();
    }

    public Aluno(String curso, double[] notas) {
        this.curso = curso;
        this.notas = notas;
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
        //s += super.getEndereco();

        return s;
    }

    public void imprimirEtiquetaEndereco(){
        System.out.println(this.obterEtiquetaEndereco());
    }

    /*public String toString(){
        String s = curso + "\n";
        for (double nota : notas){
            s += nota + " ";
        }
        return s;
    }*/


    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(curso, aluno.curso) && Arrays.equals(notas, aluno.notas);
    }


    public int hashCode() {
        int result = Objects.hash(curso);
        result = 31 * result + Arrays.hashCode(notas);
        return result;
    }
}
