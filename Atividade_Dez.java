//10. Palíndromos: Verifique se um array de strings contém palavras que são palíndromos (palavras que se leem da mesma forma de trás para frente).

public class Atividade_Dez {


        public static void main(String[] args) {
            String[] palavras = {"radar", "hello", "level", "banana", "ana", "java"};

            for (String word : palavras) {
                if (isPalindrome(word)) {
                    System.out.println(word + " é um palíndromo.");
                } else {
                    System.out.println(word + " não é um palíndromo.");
                }
            }
        }

        public static boolean isPalindrome(String word) {
            int len = word.length();

            for (int i = 0; i < len / 2; i++) {
                if (word.charAt(i) != word.charAt(len - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }


