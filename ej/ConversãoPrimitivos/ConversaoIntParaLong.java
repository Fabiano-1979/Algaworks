public class ConversaoIntParaLong {

  public static void main(String[] args) {
    int y = 102344;

    // long x = y;
    long x = (long) y; // instrução de casting é opcional, nesse caso do (int), que e menor , para (long), que e maior, 
    // a coneversão e automatica. OBS: somente em casos de MENOR < MAIOR . 

    System.out.println(y);
    System.out.println(x);
  }

}