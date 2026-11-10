package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    void main() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // pula para a próxima
            }
            System.out.println(i);
        }
    }
}
