public class FibonacciDinamico {
    public static int fibonacciDinamico(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10; // Exemplo de número Fibonacci a ser calculado
        long startTime = System.nanoTime();
        int resultado = fibonacciDinamico(n);
        long endTime = System.nanoTime();
        long tempoExecucao = endTime - startTime;
        System.out.println("Fibonacci de " + n + " é: " + resultado);
        System.out.println("Tempo de execução: " + tempoExecucao + " nanossegundos");
    }
}