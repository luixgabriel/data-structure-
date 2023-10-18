package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class NameAndSex {
   
    public static void main(String[] args) {
        ArrayList<String> mascArray = new ArrayList<>();
        ArrayList<String> femArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite seu nome e sexo separados por virgula (ou 'sair' para terminar):");
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("sair")) {
                break;  // Sai do loop se o usuário digitar 'sair'
            }

            String[] data = line.split(",", 0);
            String name = data[0].trim();  // Remover espaços em branco no início e fim
            String sex = data[1].trim().toLowerCase();  // Converter para minúsculo e remover espaços

            if(sex.equals("masc")) {
                mascArray.add(name);
            } else {
                femArray.add(name);
            }

            System.out.println("Array masculino: " + mascArray);
            System.out.println("Array feminino: " + femArray);
        }

        scanner.close();  // Lembre-se de fechar o scanner quando terminar de usá-lo
    }
}

