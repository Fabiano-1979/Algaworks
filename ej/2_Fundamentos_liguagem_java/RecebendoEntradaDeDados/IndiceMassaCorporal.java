import java.util.Scanner; // IMPORTAÇÃO DO PACOTE. 

public class IndiceMassaCorporal {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); // passando argumento da função "ENTRADA DE DADOS"

    System.out.print("Peso: ");
    double peso = entrada.nextDouble(); // proximo "double"

    System.out.print("Altura: ");
    double altura = entrada.nextDouble();// proximo "double"

    // workaround para consumir quebra de linha antes do próximo nextLine, ENTÃO o
    // compilador não para , pois procura o "PROXIMO DOUBLE" conforme a ultima
    // instrução.
    // já vai para equação do problema (solução)""
    entrada.nextLine();// proxima "linha"

    System.out.print("Nome: ");
    String nome = entrada.nextLine();// proxima "linha"

    double imc = peso / (altura * altura); // solução do IMC.

    System.out.printf("IMC de %s: %.2f%n", nome, imc); // Passando com a formatação do (printF),
    // (%s --> nome) , (f%n --> IMC ) e (%.2f%n --> IMC com quebra de 2 casa na
    // virgulas. )

    // System.out.println("IMC de "+nome+"e : "+imc); // nesse caso , não temos a
    // formatação das virgulas.
  }

}