public class CurtoCircuitoOperadoresLogicos {

    public static void main(String[] args) {
      int x = 10;
      int y = 20;
  
      // boolean resultado = x == 10 && y++ == 20; 
        // nesse caso a JVM (java) vai avaliar a primmero termo ou avaliação , não partido para segunda PREMISSE COM O / OU / &&


      boolean resultado = x == 15 || y++ == 20;
        // Já nesse caso temos o inverso a JVM (java) vai ser avaliado em segunda instacia ou premicia, 
        // devido a 1º ser falsa. Assim temos o incremento do Y para 21.
  
      System.out.println(resultado);
      System.out.println(y); // imprimindo a variavel Y
    }
  
  }
