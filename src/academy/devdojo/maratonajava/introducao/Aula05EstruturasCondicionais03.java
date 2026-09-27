package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    void main() {
        double salario = 6000;
        String mensagemComprar = "Vou comprar uma BMW!";
        String mensagemNaoComprar = "Ainda não tenho condições, mas terei!";
        String resultado = salario > 5000 ? mensagemComprar : mensagemNaoComprar;

        System.out.print(resultado);
    }
}
