public class PrecedenciaOperadoresLogicos {

    public static void main(String[] args) {
      int x = 10;
      int y = 20;
  
      // boolean resultado = x == 13 && x == 15 || y == 20; // true ---> lembrando que a JVM (java) vai interprertar como 
        // se tivesse um parente na 1º equação , deixando assim verdadeira toda expressão do código. EX : (x == 13 && x == 15) || y == 20

      // boolean resultado = (x == 13 && x == 15) || y == 20; // true


      boolean resultado = x == 13 && (x == 15 || y == 20); // false ---> nesse caso e falso por motivo que colocamos o parente em 2º equação, 
        // levando o processamento da JVM (java) para falso , devido resolver entre () parentes primeiro.  (OU)
  
      System.out.println(resultado);
    }
  
  }
