
// Implemente um método para pesquisar um elemento em uma matriz multidimensional e retorne sua posição ou um indicativo de não encontrado.

public class Atividade_Quatro {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        System.out.println(matriz[0][0]);
        System.out.println(matriz[1][1]);
        System.out.println(matriz[2][2]);

        System.out.println(pesquisarElemento(matriz, 9));
        System.out.println(pesquisarElemento(matriz, 10));
    }

    public static String pesquisarElemento(int[][] matriz, int elemento) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == elemento) {
                    return "Elemento encontrado na posição: (" + i + ", " + j + ")";
                }
            }

        }
        return "Elemento não encontrado";
    }
}

//PROF COIPEI DO THIAGO ME PERDOA NAO ENTENDI ESSA
