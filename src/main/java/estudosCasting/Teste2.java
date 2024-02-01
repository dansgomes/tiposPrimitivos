package estudosCasting;

public class Teste2 {
    public static void main (String [] args){

        //Exemplo 1 : OK
        //retorno do método pode referenciar String
        Object obj1 = obterString();
        String s1 = (String) obj1;

        //exemplo 2: OK
        //o2 referencia String explicitamente
        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        //exemplo3: Falha em tempo de execução
        //o3 não referencia String
        Object obj3 = new Object();
        String s3 = (String) obj3;

        //exemplo 4: Falha em tempo de compilação
        //o4 nunca referencia String já que retorno método é int
        Object obj4 = obterInteiro();
        //String s4 = (String) obj4;
    }

    public static String obterString(){
        return "minha String";
    }

    public static int obterInteiro(){
        return 1;
    }
}
