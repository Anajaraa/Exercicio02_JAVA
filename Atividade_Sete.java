public class Atividade_Sete {
   public static void main(String[] args) {
     
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array original: " + Arrays.toString(lista));

        Scanner entrada = new Scanner(System.in);

        System.out.println("Número de posições a serem rotacionadas (de 1 a 9): ");
        int n = entrada.nextInt();

        System.out.println("Digite 'd' para rotacionar para a direita ou 'e' para rotacionar para a esquerda: ");
        char r = entrada.next().charAt(0);

        boolean esquerda = true;

        switch (r) {
            case 'd':
                esquerda = false;
                break;
            case 'e':
                esquerda = true;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        int[] rotacionado = rodar(lista, n, esquerda);

        System.out.println("Array rotacionado: " + Arrays.toString(rotacionado));
        
        entrada.close();

    }

    public static int[] rodar(int[] array, int n, boolean esquerda) {
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
