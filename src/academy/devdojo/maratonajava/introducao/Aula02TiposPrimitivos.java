package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main() {
        // int, double, float, char, byte, short, long, boolean
        int age = 19;
        long bigNumber = 10000;
        double salaryDouble = 2000.00;
        float salaryFloat = 2000.00F;
        byte ageByte = 127;
        short ageShort = 10;
        boolean verdadeiro = true;
        char character = 'M';
        String name = "Alisson"; // Não é tipo primitivo. É um tipo de referência

        System.out.println("Olá, meu nome é: "+name);
        System.out.println("A idade é: "+age+" anos");
    }
}
