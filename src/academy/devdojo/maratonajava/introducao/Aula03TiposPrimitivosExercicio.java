package academy.devdojo.maratonajava.introducao;
/*
Exercício: Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    static void main() {
        String nome = "Alisson";
        String endereco = "Av. Alisson";
        double salario = 2000.22;
        String dataRecebimento = "17/09/2026";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", \nconfirmo que recebi o salário de "+salario+", na data "+dataRecebimento;

        System.out.println(relatorio);
    }
}
