package estudosObject;

public class Teste {
    public static void main (String [] args){

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da Computação");
        double[] notas = {10,9,8,7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "ssdah";
        String s2 = "ssdaH";

        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Ciência da Computação");
        double[] notas2 = {10,9,8,7};
        aluno.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));
    }
}
