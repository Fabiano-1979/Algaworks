public class OperadorDecremento {

    public static void main(String[] args) {
        int limiteTentativasLogin = 10;

        // limiteTentativasLogin--; // METADO PÓS-FIXADO.

        // int novoLimiteTentativasLogin = limiteTentativasLogin--; // METADO PÓS
        int novoLimiteTentativasLogin = --limiteTentativasLogin; // METADO PRÉ, DEIXANDO AS DUAS VARIAVEIS IGUAIS.

        // System.out.println("Limite de tentativas de login: " +
        // limiteTentativasLogin);
        System.out.println("Novo limite de tentativas de login: " + novoLimiteTentativasLogin);
    }

}