public class OperadoresComparacao {

    public static void main(String[] args) {
      int pesoProdutos = 900;
      int limitePesoCaminhao = 1000;
  
      boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
      System.out.printf("Carga excedida: %b%n", cargaExcedida); // (%b--> Numeros boleanos), (%n--> quebra de linha).
  
      // boolean cargaLiberada = pesoProdutos < limitePesoCaminhao;
         // nesse caso a solicitação e para carga LIBERADA.

      // boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;
         // Nesse caso para liberar CARGA, usamos (<=) MENOR e IGUAL , para não resultar false em (1000 < 1000).

      boolean cargaLiberada = limitePesoCaminhao >= pesoProdutos;
      System.out.printf("Carga liberada: %b%n", cargaLiberada);    // (%b--> Numeros boleanos), (%n--> quebra de linha).
    }
  
  }