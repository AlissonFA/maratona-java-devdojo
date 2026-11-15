package academy.devdojo.maratonajava.introducao.exercicios;

/**
 * Encontrar o maior número
 */
public class ArrayGPT05 {
    static void main() {
        int[][] array = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int maior = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maior) {
                    maior = array[i][j];
                }
            }
        }

        System.out.println("Maior Valor: " + maior);
    }
}
