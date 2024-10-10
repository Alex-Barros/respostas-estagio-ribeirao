import java.util.Scanner;

public class Q2LetraAChecker {
    
    // Método para contar a quantidade de ocorrências da letra 'a' (maiúscula ou minúscula) em uma string
    public static int contarLetraA(String texto) {
        int contador = 0;
        
        // Convertendo o texto para minúsculas para facilitar a comparação
        texto = texto.toLowerCase();
        
        // Percorrendo cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();
        
        int quantidade = contarLetraA(texto);
        
        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        scanner.close();
    }
}
