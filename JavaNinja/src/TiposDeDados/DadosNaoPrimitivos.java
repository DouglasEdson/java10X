package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
         * Dados não primitivos: String, Array, Class, enum
         * Objetivo: Criar um ninja e atribuir métodos a ele.
         */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); // ToUpperCase vai colocar tudo em CAPSLOCK
        System.out.println(nomeEmCaixaAlta);
        System.out.println("Esse texto está em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto está normal: " + nome);

        String aldeia = "Aldeia da folha";
        aldeia.toLowerCase(); // ToLowerCase vai colocar tudo em caixa baixa/minúsculo
        String nomeEmCaixaBaixa = nome.toLowerCase();
        System.out.println("Esse texto está em minúsculo: "  + nomeEmCaixaBaixa);
    }
}
