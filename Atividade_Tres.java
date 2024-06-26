//Média e Desvio Padrão: Escreva um programa que calcule a média e o desvio padrão de um array de números inteiros ou de ponto flutuante.

public class Atividade_Tres {
    public static void main(String[] args) {
        double[] numeros = {1.0, 2.0, 3.0, 4.0, 5.0};

        double soma = 0.0;
        for (double numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.length;

        double somaDasDiferencasAoQuadrado = 0.0;
        for (double numero : numeros) {
            somaDasDiferencasAoQuadrado += Math.pow(numero - media, 2);
        }
        double variancia = somaDasDiferencasAoQuadrado / numeros.length;
        double desvioPadrao = Math.sqrt(variancia);


        System.out.println("Média: " + media);
        System.out.println("Desvio Padrão: " + desvioPadrao);
    }
}



