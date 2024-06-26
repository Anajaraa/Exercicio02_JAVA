//5. Operações de Conjunto: Escreva funções que realizem operações de união, interseção e diferença entre dois arrays.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Atividade_Cinco {

    public static void main(String[] args) {
        Integer[] caixaA = {1, 2, 3, 4, 5};
        Integer[] caixaB = {4, 5, 6, 7, 8};

        Integer[] uniao = uniao(caixaA, caixaB);
        System.out.println("União: " + Arrays.toString(uniao));

        Integer[] intersecao = intersecao(caixaA, caixaB);
        System.out.println("Interseção: " + Arrays.toString(intersecao));

        Integer[] diferenca = diferenca(caixaA, caixaB);
        System.out.println("Diferença: " + Arrays.toString(diferenca));
    }

    public static Integer[] uniao(Integer[] a, Integer[] b) {
        Set<Integer> conjunto = new HashSet<>(Arrays.asList(a));
        conjunto.addAll(Arrays.asList(b));
        return conjunto.toArray(new Integer[0]);
    }

    public static Integer[] intersecao(Integer[] a, Integer[] b) {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(a));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(b));
        conjuntoA.retainAll(conjuntoB);
        return conjuntoA.toArray(new Integer[0]);
    }

    public static Integer[] diferenca(Integer[] a, Integer[] b) {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(a));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(b));
        conjuntoA.removeAll(conjuntoB);
        return conjuntoA.toArray(new Integer[0]);
    }
}

