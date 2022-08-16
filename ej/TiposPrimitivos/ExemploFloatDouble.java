public class ExemploFloatDouble {

    public static void main(String[] args) {
      double peso = 84.9d; // "d" é opcional para "DOUBLE"
      System.out.println(peso);
  
      // float taxa = 1_294.93; // não compila, por natural veem por double. 
      float taxa = 1_294.93f;
      System.out.println(taxa);
    }
  
  }