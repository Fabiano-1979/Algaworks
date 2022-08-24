public class ExemploString {

  public static void main(String[] args) {
    System.out.println("Fala, mergulhador!");

    int x = 10;
    int y = 5;

    // concatena tudo
    // System.out.println("Resultado: " + x + y); // nesse casso o ressultado foi 115. 
    // pois a soma foi 10+5=105

    // realiza cálculo antes da concatenação
    // System.out.println(x + y + " foi o resultado"); 

    // realiza cálculo antes da concatenação
    System.out.println("Resultado: " + (x + y));

    String nome = "Maria"; // Variavel string (S)Maisculo para nomes em java , pois e uma classe.
    int idade = 30;

    System.out.println(nome + " tem " + idade + " anos");// assim contatenamos todas juntas. 
  }

}