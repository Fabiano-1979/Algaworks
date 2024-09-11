public class ExemploFloatDouble {

    public static void main(String[] args) {
      double peso = 84.9d; // "d" é opcional para "DOUBLE"
      System.out.println(peso);
  
      // float taxa = 1_294.93; // não compila, por natural veem por double. 
      // já em casa DECIMAIS (0,00) os números já veem por convEnção por DOUBLE.

      float taxa = 1_294.93f;
      // float taxa = 1_294.93; não compila , por falta da LETRA "F" no final da expressão
      System.out.println(taxa);
    }
  
  }