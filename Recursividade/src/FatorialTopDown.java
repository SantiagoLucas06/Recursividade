import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo.");
        }

        if (numero == 0 || numero == 1) {
            return 1;
        }

        if (memo.containsKey(numero)) {
            return memo.get(numero);
        }

        long resultado = numero * calcularFatorial(numero - 1);
        memo.put(numero, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 7;
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }
}
