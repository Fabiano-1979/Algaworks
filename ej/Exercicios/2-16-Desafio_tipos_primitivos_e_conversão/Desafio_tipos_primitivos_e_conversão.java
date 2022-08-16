/* 
Um programador começou a desenvolver um programa para o departamento de 
logística de uma empresa, que calcula o peso total das cargas de um caminhão, 
porém ele saiu de férias e você foi chamado para finalizar o trabalho.
Embora o peso das cargas sejam com decimais (ponto-flutuante), o usuário quer 
saber o peso total das cargas sem casas decimais, ou seja, o valor total deve ser "truncado".
Finalize o programa exibindo o peso total das cargas em inteiro.
*/

public class CalculadoraPesosDasCargas {

    public static void main(String[] args) {
      double pesoCarga1 = 1033.49;
      double pesoCarga2 = 849.88;
  
      int pesoTotalCargas = (int) (pesoCarga1+pesoCarga2); // Aqui fazemos a magica, usamos a  instrução de casting. (INT)
  
      // O resultado deve ser 1883
      System.out.println("Peso total das cargas: " + pesoTotalCargas);
    }
  
  }
