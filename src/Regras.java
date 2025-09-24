import java.util.Random;
import java.util.Scanner;

class Rolagen {

    public static int rolarDados(int lados) {
        if (lados <= 0) {
            return -1;
        }
        Random random = new Random();
        return random.nextInt(lados) + 1;
    }

    public static int RDado(String dados) {
        Scanner scanner = new Scanner(System.in);

        String valorDados = dados;
        int numDice = 1;
        int lados;
        int totalResult = 0;

        try {
            // Verifica se a entrada contém 'd' para múltiplos dados.
            if (valorDados.toLowerCase().contains("d")) {
                String[] parts = valorDados.toLowerCase().split("d");
                numDice = Integer.parseInt(parts[0]);
                lados = Integer.parseInt(parts[1]);
            } else {
                // Se não contiver 'd', assume-se 1 dado.
                lados = Integer.parseInt(valorDados);
            }

            // Garante que a quantidade de dados e o número de lados são válidos.
            if (numDice > 0 || lados > 0) {
                // Rola cada dado e adiciona ao resultado total.
                for (int i = 0; i < numDice; i++) {
                    int result = rolarDados(lados);
                    totalResult += result;
                }

                return totalResult;
            }

        } finally {
            scanner.close();
        }
        return totalResult;
    }
}