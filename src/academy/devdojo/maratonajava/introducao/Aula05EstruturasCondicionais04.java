package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

/**
 * Exercício: Dado um determinado salário anual, quanto eu terei que pagar de imposto, com base no taxes netherlands 2020
 */
public class Aula05EstruturasCondicionais04 {
    void main() {
        final double IMPOSTO1 = 9.70 / 100;
        final double IMPOSTO2 = 37.35 / 100;
        final double IMPOSTO3 = 49.50 / 100;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        double salario = leitor.nextDouble();
        leitor.close();

        double valorImposto;

        if (salario <= 34712) {
            valorImposto = salario * IMPOSTO1;
            System.out.println("Você foi taxado em 9.70%\nValor a ser pago em imposto:  € " + valorImposto);
        } else if (salario >= 34713 && salario <= 68507) {
            valorImposto = salario * IMPOSTO2;
            System.out.println("Você foi taxado em 37.35%\nValor a ser pago em imposto: € " + valorImposto);
        } else {
            valorImposto = salario * IMPOSTO3;
            System.out.println("Você foi taxado em 49.50%\nValor a ser pago em imposto: € " + valorImposto);
        }
    }
}
