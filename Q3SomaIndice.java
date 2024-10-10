public class Q3SomaIndice {
    public static void main(String[] args) {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        // Laço de repetição equivalente ao "enquanto K < INDICE faça"
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        // Imprimindo o valor final de SOMA
        System.out.println("O valor final de SOMA é: " + SOMA);
    }
}

// Resultado final:
// O valor da variável SOMA ao final do processamento será 77.
