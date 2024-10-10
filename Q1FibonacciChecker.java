import java.util.Scanner;

public class Q1FibonacciChecker {
    
    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int number) {
        if (number < 0) return false;
        
        int a = 0, b = 1;
        
        // Caso o número seja 0 ou 1, já pertence à sequência
        if (number == a || number == b) return true;
        
        int next = a + b;
        
        // Gerando a sequência até que o número seja encontrado ou ultrapassado
        while (next <= number) {
            if (next == number) return true;
            a = b;
            b = next;
            next = a + b;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();
        
        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}