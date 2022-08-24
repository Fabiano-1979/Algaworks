public class SequenciasEscape {

  public static void main(String[] args) {

    System.out.println("Oi \"Maria\""); // Aqui passamos a sequencia de caracteres (\") --> inicial, ("\) no final para
    // quebrar o entendimento do conpilador em aspas  "". Ex: Saida --> "Maria"

    System.out.println("Seu nome:\nJoão"); //   aqui usamos o contra barra (\n) para PULAR UMA LINHA, 
    // assim podememos formatar melhor o texto de saida.

    System.out.println("C:\\Windows"); // aqui , quando desejamos usar a propria CONTRA BARRA (\) , 
    // devemos incluir repedidamente outra contra barra para incluir , como no exemplo: C:\\windows
  }

}