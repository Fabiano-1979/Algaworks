public class Operadores_de_IgualdadeNegacao {

    public static void main(String[] args) {
      // boolean numerosIguais = 10 == 10; // para numeros IGUAIS.

      // boolean numerosIguais = (4 + 6) == (5 * 2); // para equações equivalantes  (==) SÃO IGUAIS 
      // exemplo; (4 + 6)= 10 ou (5 * 2)= 10

      int numero1 = 10;
      int numero2 = 11;
      // boolean numerosIguais = numero1 == 10;
      boolean numerosIguais = numero1 == numero2;
  
      // boolean numerosDiferentes = !numerosIguais; //Aqui negamos numeros iguais (!) , na frente da variavel
      // boolean numerosDiferentes = !(numero1 == numero2); //Aqui negamos numeros iguais (!) ,
      // Antes dos parentes , NEGANDO O RESULTADO DA IGUALDADE.

      boolean numerosDiferentes = numero1 != numero2; // aqui fazemos a DIFERENCIAÇÃO DIRETO. (!=), em comparação.
  
      System.out.printf("Números iguais: %b%n", numerosIguais); // (%b--> Numeros boleanos, (%n--> quebra de linha).
      // Nesse casso tudo junto.

      // System.out.printf("Números iguais: %b%n", numero1 == numero2); // (%b--> Numeros boleanos, (%n--> quebra de linha).
      // Nesse casso tudo junto.
  
      System.out.printf("Números diferentes: %b%n", numerosDiferentes);
  
      String nome1 = "Thiago";
      String nome2 = "Miguel";
  
      boolean nomesIguais = nome1 == nome2; // CUIDADO!!!  Ao comparar com com STRING, pode gerar valores FALSE. 
      // Em futuras aulas a EXPLICAÇÃO.
  
      System.out.printf("Nomes iguais: %b%n", nomesIguais);
    }
  
  }