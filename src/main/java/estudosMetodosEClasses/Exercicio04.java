package estudosMetodosEClasses;

import java.util.Date;

public class Exercicio04 {
    public static void main (String [] args){

        LivroBiblioteca livro = new LivroBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Loiane";

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Autor(a) do livro = " + livro.autor);
        System.out.println("Ano de lançamento do livro = " + livro.anoLancamento);

        System.out.println("O livro foi emprestado?" + livro.emprestado);
        System.out.println("A data de entrega é = " + livro.dataEntrega);
        System.out.println(" O livro foi emprestado para = " + livro.emprestadoA);
    }
}
