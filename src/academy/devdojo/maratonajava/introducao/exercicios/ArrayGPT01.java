package academy.devdojo.maratonajava.introducao.exercicios;

/**
 * Criar e percorrer uma matriz 3x3
 */
public class ArrayGPT01 {
    static void main() {
        int[][] numeros = new int[3][3];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
        }
    }
}
