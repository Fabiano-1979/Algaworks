import java.util.Scanner; // Importação do pacote "SACNNER" --> entrada de dados.

public class OperadoresLogicos {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in); // Comando de ler. Biblioteca java
  
      System.out.print(" Digite o seu NIVEL de Cortisol: ");
      double cortisol = entrada.nextDouble();
  
      // cortisol ideal é de 6 a 18.4 


      boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4; 
          // Usamos nessa equação o operador (&& --> E ) que a operação do "E" , 
          // nesse casso as duas premissas tem de ser verdadeiras. (cortisol >= 6.0) E (cortisol <= 18.4)
          // para o esultado TRUE (VERDADEIRO).
      System.out.printf("Cortisol normal --> (cortisol ideal é de 6 a 18.4): %b%n", resultadoNormal); 
          //(%b--> Numeros boleanos), (%n--> quebra de linha).
  
      boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4; 
          // Usamos nessa equação o operador (|| --> E ) que a operação do "OU" , 
          // nesse casso as UMA premissa ja estabelece ser verdade. (cortisol < 6.0) OU (cortisol > 18.4)
          // para o esultado TRUE (VERDADEIRO).
      System.out.printf("Cortisol anormal ---> (cortisol ideal é de 6 a 18.4): %b%n", resultadoAnormal);
          //(%b--> Numeros boleanos), (%n--> quebra de linha).
    }   
  
  }