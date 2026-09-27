package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

/**
 * Prática 1: Imprima o dia da semana, considerando 1 como domingo.
 * Prática 2: Imprima o sexo de uma pessoa baseado na letra M ou F.
 * OBS: Comentar a prática 2 se quiser rodar a 1, ou comentar a prática 1 se quiser rodar a 2.
 */
public class Aula05EstruturasCondicionais05 {
    void main() {
        /*
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        byte diaSemana = leitor.nextByte();
        leitor.close();

        switch (diaSemana) {
            case 1:
                System.out.print("Domingo");
                break;
            case 2:
                System.out.print("Segunda");
                break;
            case 3:
                System.out.print("Terça");
                break;
            case 4:
                System.out.print("Quarta");
                break;
            case 5:
                System.out.print("Quinta");
                break;
            case 6:
                System.out.print("Sexta");
                break;
            case 7:
                System.out.print("Sábado");
                break;
            default:
                System.out.print("Escolha inválida! Por favor, digite um número entre 1 a 7.");
        }

         */

        Scanner leitor2 = new Scanner(System.in);
        System.out.print("Digite seu sexo (M ou F): ");
        char sexo = leitor2.next().charAt(0);
        leitor2.close();

        switch (sexo) {
            case 'M':
                System.out.print("Masculino");
                break;
            case 'F':
                System.out.print("Feminino");
                break;
            default:
                System.out.print("Opção Inválida! Por favor, digite uma letra que seja M (masculino) ou F (feminino).");
        }
    }
}
