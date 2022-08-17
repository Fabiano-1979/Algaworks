import java.util.Scanner; // IMPORTAÇÃO DO PACOTE. 

public class IndiceMassaCorporal {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); //passando argumento

    System.out.print("Peso: ");
    double peso = entrada.nextDouble();

    System.out.print("Altura: ");
    double altura = entrada.nextDouble();

    // workaround para consumir quebra de linha antes do próximo nextLine, ENTÃO o compilador não para 
    // já vai para equção do problema (solução)  
    entrada.nextLine();

    System.out.print("Nome: ");
    String nome = entrada.nextLine();

    double imc = peso / (altura * altura); // solução do IMC.

    System.out.printf("IMC de %s: %.2f%n", nome, imc); // Passando com a formatação do (printF),
    // (%s --> nome) , (f%n --> IMC ) e (%.2f%n --> IMC com quebra de 2 casa na virgulas. )

    //System.out.println("IMC de "+nome+"e : "+imc); // nesse caso , não temos a formatação das virgulas. 
  }

}