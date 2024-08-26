public class OperadoresAritmeticos {

  public static void main(String[] args) {
  
    int minhaIdade = 42;
    int suaIdade = 25;
    int idadeJoao = 50;
    
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

    //Media de idade
    int mediaIdade2 = (suaIdade + minhaIdade + idadeJoao) / 3; // Lembre-se , sem o parentes () vai resolver a divisão 1º 
    // para depois a SOMA ++
    int mediaIdade = suaIdade + minhaIdade + idadeJoao / 3;
      System.out.println(" Media das idades é: "+mediaIdade2+" - Sem parentes () :"+mediaIdade);


  

   
  }

}
