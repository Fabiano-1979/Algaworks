/* A empresa que você trabalha descobriu que você está indo muito bem neste curso de Java e pediu para que você desenvolvesse um programa que calcula os pagamentos para os prestadores de serviços da empresa.

Este programa deve receber as seguintes entradas de dados do usuário:

Nome (texto)
Valor por hora (decimal)
Horas trabalhadas (inteiro)
Valor dos descontos (decimal)
A saída do programa deve ser um resumo da folha de pagamento, mostrando os cálculos e os resultados finais, como no exemplo abaixo:

Folha de pagamento: Thiago Faria
172 horas x R$150.20 = R$25834.40
Descontos: R$482.88
Total devido: R$25351.52
Use a formatação de saída com printf para imprimir na saída e o tipo Scanner para receber a entrada de dados do usuário.
 */

import java.util.Scanner; // IMPORTAÇÃO DO PACOTE. 

public class DesafioEntrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // passando argumento

        System.out.println("--->PROGRAMA FOLHA DE PAGAMENTO<---");
        System.out.print("Nome do funcionário: ");
        String nome = entrada.nextLine();

        System.out.print("Digite quantidade de horas trabalhada:(HORAS EXATAS) ");
        int quantidadeHora = entrada.nextInt();

        double valorHora = 150.20;
        double desconto = 482.88;

        double salarioBruto = quantidadeHora * valorHora;
        double salarioLiquido = (quantidadeHora * valorHora) - desconto;

        System.out.printf("---DESMOSTRATIVO DE PAGAMENTO---\n Folha de pagamento do funcionario: %s \n", nome);// formatação
                                                                                                               // com
                                                                                                               // printF
                                                                                                               // (%s
                                                                                                               // -->
                                                                                                               // nome)
        System.out.printf(
                "Quantidade de hora trabalhada mês: %s horas X Valor da hora trabalhada: R$: %s = R$ %.2f%n ",
                quantidadeHora, valorHora, salarioBruto);// formatação com printF (%s --> quantidadeHora) 1º argumento,
                                                         // (%s -->// valorHora) 2º argumento e (%.2f%n --> salario
                                                         // bruto) 3º argumento.
        System.out.printf("Desconto em folha R$: - %s \n", desconto);
        System.out.printf("Total devido/credidado em folha salarial R$: %.2f%n", salarioLiquido);// Passando com a
                                                                                                 // formatação do
                                                                                                 // (printF),
        // (%.2f%n ---> salarioLiquido) com formatação de 2 casa decimais.

    }

}