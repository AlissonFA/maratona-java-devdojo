package academy.devdojo.maratonajava.introducao.exercicios;

/**
 * Somar todos os elementos
 */
public class ArrayGPT04 {
    static void main() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                soma += array[i][j];
            }
        }
        System.out.println("Soma: " + soma);
    }
}
