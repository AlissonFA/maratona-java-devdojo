package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

/**
 * Preencher com Scanner, somar e calcular média
 */
public class ArrayGPT06 {
    static void main() {
        int soma = 0;
        double media;

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[2][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Digite o valor da %d linha e %d coluna: ", i, j);
                int valor = sc.nextInt();

                array[i][j] = valor;

                soma += valor;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }

        media = soma / (array.length * array[0].length);
        System.out.println("Soma de todos os termos: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}
