package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    void main() {
        // byte, short, int, long, float e double: 0
        // char: '\u0000' ' '
        // boolean: false
        // String: null

        String[] nomes = new String[3];
        nomes[0] = "Alisson";
        nomes[1] = "Alane";
        nomes[2] = "Alan";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
