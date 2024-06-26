
//9. Subconjuntos de Soma Zero: Determine se existe um subconjunto não vazio de elementos em um array cuja soma seja igual a zero.

import java.util.Scanner;

public class Atividade_Nove {

    public static boolean Subarray(int[] arr) {
        return Subarray(arr, 0, 0);
    }

    private static boolean Subarray(int[] arr, int index, int currentSum) {
        if (currentSum == 0 && index > 0) {
            return true;
        }

        if (index == arr.length) {
            return false;
        }

        boolean inclui = Subarray(arr, index + 1, currentSum + arr[index]);

        boolean exclui = Subarray(arr, index + 1, currentSum);

        return inclui || exclui;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (Subarray(arr)) {
            System.out.println("Existe um subconjunto cuja soma é zero.");
        } else {
            System.out.println("Não existe um subconjunto cuja soma é zero.");
        }

        sc.close();
    }
}
