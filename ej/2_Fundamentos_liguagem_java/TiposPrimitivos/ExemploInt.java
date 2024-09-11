public class ExemploInt {

    public static void main(String[] args) {
      int populacaoUberlandia = 699_097; // depois do java 7,. podemos usar o underline eentre as casas dos milhares. 
      

      // int populacaoUberlandia2 = 2_147_483_648; 
      // não compila, porqure o calculo é: ((2^31) -1) VALOR MAXIMO = 2_147_483_647
      int populacaoUberlandia2 = 2_147_483_647;
      
      
      System.out.println("População 1: "+populacaoUberlandia+
      " População 2: "+populacaoUberlandia2);

    }
  
  }