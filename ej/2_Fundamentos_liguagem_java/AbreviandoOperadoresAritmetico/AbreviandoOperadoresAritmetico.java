public class AbreviandoOperadoresAritmetico {

    public static void main(String[] args) {

        int quantidadeProduto = 10;

        // Isso aqui:
        // quantidadeProduto = quantidadeProduto + 3;

        // e o mesmo que isso:
        // quantidadeProduto += 3;
        // quantidadeProduto -= 3;
        // quantidadeProduto *= 3;
        // quantidadeProduto /= 2;
        quantidadeProduto %= 4;

        System.out.println(quantidadeProduto);

    }
}