package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class NameAndSexOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite belos nomes separados por , :");
            String line = scanner.nextLine();
            
            // Corrigido o delimitador para ","
            String[] response = line.split(",", 0);

            // Criando uma cópia do array original
            String[] ordenado = Arrays.copyOf(response, response.length);
            
            // Ordenando a cópia
            Arrays.sort(ordenado);

            // Imprimindo o array ordenado
            System.out.println(Arrays.toString(ordenado));
        }
    }
}
