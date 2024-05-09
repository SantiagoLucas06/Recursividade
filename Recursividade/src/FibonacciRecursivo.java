public class FibonacciRecursivo {
    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Exemplo de número Fibonacci a ser calculado
        long startTime = System.nanoTime();
        int resultado = fibonacciRecursivo(n);
        long endTime = System.nanoTime();
        long tempoExecucao = endTime - startTime;
        System.out.println("Fibonacci de " + n + " é: " + resultado);
        System.out.println("Tempo de execução: " + tempoExecucao + " nanossegundos");
    }
}