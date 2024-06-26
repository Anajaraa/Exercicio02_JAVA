public class Atividade_Sete {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = 3;
        boolean esquerda = true;

        int[] rotacionado = rotacionar(array, n, esquerda);

        System.out.println("Array rotacionado:");
        for (int num : rotacionado) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotacionar(int[] array, int n, boolean esquerda) {
        int tamanho = array.length;
        int[] novoArray = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            int novaPosicao;
            if (esquerda) {
                novaPosicao = (i + tamanho - n) % tamanho;
            } else {
                novaPosicao = (i + n) % tamanho;
            }
            novoArray[novaPosicao] = array[i];
        }

        return novoArray;
    }
}
