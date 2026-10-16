package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

/**
 * Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
 * Condição: valorParcela >= 1000
 */
public class Aula06EstruturasDeRepeticao04 {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do carro que você quer comprar: ");
        double valorCarro = sc.nextDouble();
        sc.close();

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.printf("Parcela %d R$ %.2f\n", parcela, valorParcela);
        }
    }
}
