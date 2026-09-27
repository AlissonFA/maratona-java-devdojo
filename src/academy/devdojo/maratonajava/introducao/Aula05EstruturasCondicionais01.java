package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    void main() {
        int age = 20;
//        boolean isAdult = age >= 18; // Usado quando precisa verificar algo mais complexo
        if (age >= 18) {
            System.out.print("Maior de idade!");
        } else {
            System.out.print("Menor de idade!");
        }
    }
}
