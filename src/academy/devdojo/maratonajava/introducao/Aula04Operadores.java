package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main() {
        // Aritméticos: +, -, /, *, %
        double numero1 = 10;
        double numero2 = 20.2;
        double soma = numero1 + numero2;
        double subtracao = numero2 - numero1;
        double divisao = numero2 / numero1;
        double multiplicacao = numero1 * numero2;
        int resto = 21 % 7;
        System.out.println("Soma: " + soma + " Subtração: " + subtracao + " Divisão: " + divisao + " Multiplicação: " + multiplicacao + " Resto da Divisão: " + resto);

        // Relacionais: <, >, <=, >=, ==, !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("Dez maior que vinte? " + isDezMaiorQueVinte);
        System.out.println("Dez menor que vinte? " + isDezMenorQueVinte);
        System.out.println("Dez igual a vinte? " + isDezIgualVinte);
        System.out.println("Dez diferente de vinte? " + isDezDiferenteVinte);

        // Lógicos: AND (&&), OR (||), NOT (!)
        int idade = 19;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Está dentro da lei maior que trinta? " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Está dentro da lei menor que trinta? " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 5000;
        float valorPlaystationCinco = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystationCinco || valorTotalContaPoupanca >= valorPlaystationCinco;
        System.out.println("Dá para comprar um Playstation 5? " + isPlaystationCincoCompravel);

        // Atribuição: =, +=, -=, *=, /=, %=
        double bonus = 1800; // 1800
//        bonus = bonus + 1000;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // Unários: ++, --
        int contador = 0;
        contador = +1; // contador = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);
    }
}
