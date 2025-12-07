package Exercicios.Iniciante;

public class Exercicio3 {
    public static void main(String[] args) {

        String[] ninjas = {
                "Naruto",
                "Sasuke",
                "Sakura",
                "Kakashi",
                "Itachi ",
                "Rock Lee"
        };
        // Notas correspondentes
        int[] notas = {85, 100, 72, 90, 55, 93};

        // Contadores de aprovados e reprovados
        int aprovados = 0;
        int reprovados = 0;

        // Laço for para percorrer todos os ninjas
        for (int i = 0; i < ninjas.length; i++) {
            if(notas[i] >= 70){
                System.out.println(ninjas[i] + " passou na prova com: " + notas[i] + " pontos!");
                aprovados++;
            }else {
                System.out.println(ninjas[i] + "foi reprovado com: " + notas[i] + " pontos!");
                reprovados++;
            }
        }
        // Resultado final
        System.out.println("=========================================");
        System.out.println("Total de aprovados " + aprovados);
        System.out.println("Total de reprovados " +  reprovados);

        }
    }

