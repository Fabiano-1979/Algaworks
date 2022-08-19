public class CalculadoraIdadeMedia {

    public static void main(String[] args) {
      int idade1 = 30;
      int idade2 = 40;
      int idade3 = 60;
  
      float idadeMedia = (idade1 + idade2 + idade3) / 3f; /* nesse caso temos de colocar (f) de float para 
      resultar em dizima, ou ponto flutuante */
  
      System.out.println("Idade média: " + idadeMedia);
    }
  
  }