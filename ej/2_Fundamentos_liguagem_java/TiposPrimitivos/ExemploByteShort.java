public class ExemploByteShort {

    public static void main(String[] args) {
      byte idade = 127; // valor máximo
      // byte idade2 = 128; // não compila 
      // Calculo do BYTE e : ((2^7) -1) = 127
  
      short quantidadeEstoque = 32767; // valor máximo
      // short quantidadeEstoque2 = 32768; // não compila
      // Calculo do SHORT e : ((2^15) -1) = 32767
      System.out.println("Idade (byte): "+idade);
      System.out.println("quantidade em estoque (short): "+quantidadeEstoque);

    }
  
  }