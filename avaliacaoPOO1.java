public class avaliacaoPOO1 {
    public static void main(String[] args) {
        int[][] matriz2x2 = { { 0, 1 }, { 2, 3 } };
        matrizRotacao(matriz2x2);

        int[][] matriz3x3 = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
        matrizRotacao(matriz3x3);

        int[][] matriz4x4 = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 0, 1 }, {2, 3, 4, 5} };
        matrizRotacao(matriz4x4);
    }

    public static void matrizRotacao(int[][] matriz) {
        System.out.println("Rotação de 0 graus: ");
        mostrarMatriz(rotacionarMatriz(matriz, 0));
        System.out.println("Rotação de 90 graus: ");
        mostrarMatriz(rotacionarMatriz(matriz, 90));
        System.out.println("Rotação de 180 graus: ");
        mostrarMatriz(rotacionarMatriz(matriz, 180));
        System.out.println("Rotação de 270 graus: ");
        mostrarMatriz(rotacionarMatriz(matriz, 270));
        System.out.println("Rotação de 360 graus: ");
        mostrarMatriz(rotacionarMatriz(matriz, 360));
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotacionarMatriz(int[][] matriz, int graus) {
        int multiplo90graus = graus / 90;
        int[][] matrizRotacionada = matriz;
        for (int i = 0; i < multiplo90graus; i++) {
            matrizRotacionada = rotacao90graus(matrizRotacionada);
        }
        return matrizRotacionada;
    }

    public static int[][] rotacao90graus(int[][] matriz) {
        int[][] matrizRotacionada = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizRotacionada[i][j] = matriz[matriz.length - j - 1][i];
            }
        }
        return matrizRotacionada;
    }
}