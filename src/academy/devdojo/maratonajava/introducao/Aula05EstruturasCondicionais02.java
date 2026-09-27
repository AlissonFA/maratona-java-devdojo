package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    void main() {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 19;
        String categoria;

        if (idade < 15) {
//            System.out.print("Categoria Infantil");
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
//            System.out.print("Categoria Juvenil");
            categoria = "Categoria Juvenil";
        } else {
//            System.out.print("Categoria Adulto");
            categoria = "Categoria Adulto";
        }
        System.out.print(categoria);
    }
}
