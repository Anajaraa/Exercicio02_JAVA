// Ordenação Personalizada: Implemente um algoritmo que ordene um array de objetos com base em um critério personalizado (por exemplo, ordem alfabética de strings ou ordenação numérica).

import java.util.Arrays;

public class Atividade_Um {
    public static void main(String[] args) {
        String[] pessoas = {"Maria", "João", "Pedro", "Maria", "João", "Pedro", "Maria", "João", "Pedro"};
        Arrays.sort(pessoas);
        System.out.println("Ordem Alfabética:" + Arrays.toString(pessoas));
    }
}