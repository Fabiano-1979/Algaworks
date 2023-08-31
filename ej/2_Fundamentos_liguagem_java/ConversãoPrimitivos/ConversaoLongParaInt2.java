public class ConversaoLongParaInt {

    public static void main(String[] args) {
      long x = 10;
  
      // int y = x; // não compila , devido x ser LONG
  
      int y = (int) x; // aqui informamos as complilador a necessidade e responsabilidade de trasferir
      // long = int com  " (int)" entre parentes antes da variavel. 
  
      System.out.println(x);
      System.out.println(y);
  
  
      long a = 9300000035L;
      int b = (int) a;

      int  c = 12345;
      long d = (int) c;

      System.out.println(a);
      System.out.println(b); // em resultado, em compilação o valor perde, devido  a trasformação de LONG para Int. 

      System.out.println(d); // Compilação implicida, do maior para o menor.
    }
  
  }