import java.util.Scanner; // Aqui importamos os pacotes da biblioteca JAVA , com import. CLASS SCANNER

public class EntradaDeDados {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); // passsamos o novo argumento para entrada. 

    System.out.println("Digite o seu nome, em seguida aperte o ENTER: ");

    String nome = entrada.nextLine();// adicionamos a variavel nome.

    System.out.printf("Oi, %s%n", nome);  // saida do programa , com a formtação do printF
    // Lembrando: (%s)--> variavel , (%n)--> quebra de linha. em seguida com virgula o tipo da variavel. 

    //System.out.println(" Oi, "+ nome); // Modo de contenação normal.
  }

}