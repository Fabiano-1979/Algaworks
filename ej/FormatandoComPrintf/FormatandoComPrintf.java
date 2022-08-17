public class FormatandoComPrintf {

  public static void main(String[] args) {
    String nome1 = "Thiago";
    System.out.printf("Olá, %s%n", nome1); // Tipo de formataçãode saida , nesse caso (%s)= e a variavel, 
    // já (%n) e a quebra de linha , assim não precisamos de contatenar (+) ou com outro operador ... (*)

    int quantidade = 48;
    System.out.printf("Quantidade: %d itens%n", quantidade); // Tipo de formatação para NUMEROS INTEIROS (%d)= INT,
    // somente... 

    double peso = 938.22;
    System.out.printf("Peso: %10.2f%n", peso);// Nesse tipo e formatação para FLUTUANTES , ou decimais usamos (f%), 
    // podemos editar o tipo e quantidade e zeros que podemos acresentar antes , ou fomarmatar a quantidade com 
    // (%10) --> numeros de casa decimais, (.) a virgula com as casas decimais. OBS: tudo junto. 
  }

}