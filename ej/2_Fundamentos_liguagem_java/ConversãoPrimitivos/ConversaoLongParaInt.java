public class ConversaoLongParaInt {

    public static void main(String[] args) {
      long x = 10;
  
      // int y = x; // não compila , devido x ser LONG
  
      int y = (int) x; // aqui informamos as complilador a necessidade e responsabilidade de trasferir
      // long = int , com  "(int)" entre parentes antes da variavel. 
  
      System.out.println(x);
      System.out.println(y);
  
  
      long a = 9300000035L;
      int b = (int) a;
      System.out.println(a);
      System.out.println(b); // em resultado, em compilação o valor perde, devido  a trasformação de LONG para Int. 
    }
  
  }