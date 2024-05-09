public class FatorialBottomUp {
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo.");
        }

        long[] dp = new long[numero + 1];
        dp[0] = 1;

        for (int i = 1; i <= numero; i++) {
            dp[i] = dp[i - 1] * i;
        }

        return dp[numero];
    }

    public static void main(String[] args) {
        int numero = 7;
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }
}
