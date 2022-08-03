public class OperadoresAritmeticos {

  public static void main(String[] args) {
  
    int minhaIdade = 42;
    int suaIdade = 25;
    
    //Adição
    int totalIdades = minhaIdade + suaIdade + 100;
    
    System.out.println(" Soma das idades: "+totalIdades);
    
    //subtração
    int diferencaIdades = minhaIdade - suaIdade;
     
    System.out.println(" Diferença das Idades é: "+diferencaIdades); 
    
    //multiplicação
    int dobroIdade = 2 * suaIdade;
     
    System.out.println(" Dobro da sua Idade é: "+dobroIdade); 
    
    //Divisão
    int metadeIdade = suaIdade / 2; // Lembrando que na divisão , o fator veem depois da variavel.
     
    System.out.println(" Metade da sua Idade é: "+metadeIdade);
   
  }

}
