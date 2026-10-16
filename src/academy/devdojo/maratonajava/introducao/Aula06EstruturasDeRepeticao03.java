package academy.devdojo.maratonajava.introducao;

/**
 * Imprimir os primeiros 25 números de um dado valor. Por exemplo, 100
 */
public class Aula06EstruturasDeRepeticao03 {
    void main() {
        for (int number = 0; number <= 100; number++) {
            if (number > 25) {
                break;
            }
            System.out.println(number);
        }
    }
}
