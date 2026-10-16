package academy.devdojo.maratonajava.introducao;

/**
 * Imprima todos os números pares de 0 até 100
 */
public class Aula06EstruturasDeRepeticao02 {
    void main() {
        for (int number = 0; number <= 100; number++) {
            if (number % 2 == 0) {
                System.out.println("Os números pares são: "+number);
            }
        }
    }
}
