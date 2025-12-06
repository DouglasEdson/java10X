package Exercicios.Iniciante;

public class Exercicio2 {
    public static void main(String[] args) {

        // Lista de missões
        String[] missoes = {
                "Estudar para a prova",
                "Aprender Java",
                "Aprender lógica de programação"
        };

        // Níveis de dificuldade correspondentes
        int[] niveis = {1, 3, 2};

        // Laço for para percorrer todas as missões
        for (int i = 0; i < missoes.length; i++) {
            System.out.println("Missão: " + missoes[i]);

            if (niveis[i] >= 2) {
                System.out.println("Missão difícil, prepare-se!");
            } else {
                System.out.println("Missão fácil, boa sorte!");
            }
            System.out.println("===============================");

        }

    }
}