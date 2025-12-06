package Exercicios.Iniciante;

public class Exercicio1 {
    public static void main(String[] args) {

        String ninja1 = "Naruto Uzumaki";
        String missao1 = "Salvar a aldeia";
        int idadeNinja1 = 15;
        int nivelMissao1 = 1;
        char statusMissao1 = 'C';

        // Estrutua simples de decisão

        if (idadeNinja1 >= 15 && statusMissao1 == 'C') {
            System.out.println("Parabéns, você salvou a aldeia da folha!");
        } else {
            System.out.println("Você não concluiu seu objetivo, tente novamente!");
        }

        String ninja2 = "Sasuke Uchiha";
        String missao2 = "Ganhar o campeonato";
        int idadeNinja2 = 17;
        int nivelMissao2 = 4;
        char statusMissao2 = 'C';

        if (nivelMissao2 >= 4 && statusMissao2 == 'C') {
            System.out.println("Parabéns! você ganhou o campeonato");
        } else {
            System.out.println("Tente novamente!");
        }

        String ninja3 = "Sakura haruno";
        String missao3 = "Auxiliar seus amigos";
        int idadeNinja3 = 18;
        int nivelMissao3 = 2;
        char statusMissao3 = 'A';

        if (statusMissao1 == 'C' && statusMissao2 == 'C' && idadeNinja3 >= 18) {
            System.out.println("Parabéns! você conseguiu ajudar seus amigos.");
        } else {
            System.out.println("Tente novamente!");
        }

    }
}
