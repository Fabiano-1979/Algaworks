import java.util.Scanner;

public class Exercicio{

    /**
     * 
     */
    public static void main(String[]args ) {
    
    Scanner entrada = new Scanner(System.in); // entrada de dados. ==> scanner

    System.out.print(" Informe o ano que deseja saber que é BISSEXTO , em seguida aperte enter. ");
    int ano = entrada.nextInt(); // recebendo o valor , ano .

    boolean anoBissexto = ( ano % 400 == 0) // aqui temos uma divisão com o resto igual a ZERO.
            || ((ano % 4 == 0)  && (ano % 100 != 0)); // OPERADOR  OU -->   e ( E ) em segunda estáncia de calculo.

    System.out.printf("Ano %d é Bissexto: %b%n" , ano , anoBissexto);
  
    }


}
