//6. Maior Sequência Crescente: Encontre a maior sequência crescente de números em um array e imprima os números dessa sequência.

import java.util.ArrayList;

public class Atividade_Seis {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 4, 8, 6, 7, 8, 9};
        encontrarMaiorSC(array);
    }

    public static void encontrarMaiorSC(int[] array) {
        ArrayList<Integer> atual = new ArrayList<Integer>();
        ArrayList<Integer> maior = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (atual.isEmpty() || array[i] > atual.get(atual.size() - 1)) {
                atual.add(array[i]);
            } else {
                if (atual.size() > maior.size()) {
                    maior = new ArrayList<Integer>(atual);
                }
                atual.clear();
                atual.add(array[i]);
            }
        }

        if (atual.size() > maior.size()) {
            maior = new ArrayList<Integer>(atual);
        }

        System.out.println("A maior sequência crescente é:");
        for (int num : maior) {
            System.out.print(num + " ");
        }
    }
}
