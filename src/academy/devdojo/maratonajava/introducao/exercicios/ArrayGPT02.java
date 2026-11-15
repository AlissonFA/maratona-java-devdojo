package academy.devdojo.maratonajava.introducao.exercicios;

/**
 * Preencher e imprimir uma matriz 2x3
 */
public class ArrayGPT02 {
    static void main() {
        int[][] numeros = new int[2][3];
        numeros[0][0] = 10;
        numeros[0][1] = 20;
        numeros[0][2] = 30;
        numeros[1][0] = 40;
        numeros[1][1] = 50;
        numeros[1][2] = 60;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }
    }
}
