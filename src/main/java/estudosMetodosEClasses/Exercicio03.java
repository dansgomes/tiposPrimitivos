package estudosMetodosEClasses;

public class Exercicio03 {
    public static void main (String [] args){

        LivroLivraria livro = new LivroLivraria();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Liane Groner";
        livro.anoLancamento = 2015;
        livro.preco = 65.39;

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Autor(a) do livro = " + livro.autor);
        System.out.println("Ano de lançamento do livro = " + livro.anoLancamento);
        System.out.println("Preço do livro = " + livro.preco);
    }
}
