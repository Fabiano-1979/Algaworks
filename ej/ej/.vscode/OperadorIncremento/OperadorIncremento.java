package ej.ej.OperadorIncremento;

public class OperadorIncremento {
    public static void main(String[] args) {

        int totalDownloads = 10;

        // Pode ser:
        // totalDownloads = totalDownloads + 1;

        // ou:
        // totalDownloads++;

        // podemos atribuir incremento em PÓS ou PRÉ fixado, colocado os operadores
        // antes ou depois.
        // int novoTotalDownloads = totalDownloads++; // forma PÓS-FIXADA.
        int novoTotalDownloads = ++totalDownloads;

        System.out.println(" Total de downloads: " + totalDownloads);

        System.out.println("  NOVO Total de downloads: " + novoTotalDownloads);// forma PRÉ-fixada.

    }
}
