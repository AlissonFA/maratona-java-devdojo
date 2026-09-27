package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

/**
 * Exercício: Utilizando switch e dado os valores de 1 a 7, imprima se é dia útil ou final de semana. Considerando 1 como domingo.
 */
public class Aula05EstruturasCondicionais06 {
    void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        byte diaSemana = leitor.nextByte();
        leitor.close();

        switch (diaSemana) {
            case 1, 7 -> System.out.print("Final de semana");
            case 2, 3, 4, 5, 6 -> System.out.print("Dia útil");
            default -> System.out.print("Opção inválida! Por favor, digite um número de 1 a 7.");
        }
    }
}
