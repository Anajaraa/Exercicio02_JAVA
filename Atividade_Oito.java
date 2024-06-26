//8. Histograma de Frequência: Construa um histograma de frequência a partir de um array de números, mostrando quantas vezes cada número aparece.

public class Atividade_Oito {

        public static void main(String[] args) {
            int[] numeros = {2,1, 1, 4, 4, 4, 3, 3, 3, 3};

            int max = 0;
            for (int numero : numeros) {
                if (numero > max) {
                    max = numero;
                }
            }

            int[] contador = new int[max + 1];

            for (int numero : numeros) {
                contador[numero]++;
            }

            for (int i = 1; i < contador.length; i++) {
                System.out.println("Número " + i + ": " + contador[i] + " vezes");
            }
        }
    }


