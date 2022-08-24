public class PromocaoAritmetica2 {

  public static void main(String[] args) {
    long x = 10;
    float y = 9.34f;

    // long z = x * y; // não compila, nesse caso o pnto flutuante sempre tem vantagem, mesmo sendo 32bits. 

    float z = x * y;

    System.out.println(z);
  }

}