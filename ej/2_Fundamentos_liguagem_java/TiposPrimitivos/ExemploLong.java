public class ExemploLong {

    public static void main(String[] args) {
      long populacaoUberlandia = 699_097;
  
      long populacaoUberlandia2 = 2_147_483_648L; // e usa a letra " L " ou "l" 
      // (NO FINAL DO NÚMERO) para informar ao compilador que o numero e LONG.
      // por padrão , todo número e INT -inteiro
      
      //  CALCULO DO LONG (VALOR MAXIMO)--> ((2^63) - 1)= 9_223_372_036_854_775_807
  
      // System.out.println(2_147_483_648); // não compila
      System.out.println(2_147_483_648L);
    }
  
  }