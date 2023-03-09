package Questoes;

import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Essa linha lê a string que vai ser invertida
        System.out.println("Digite uma String / Texto ");
        String normal = scanner.nextLine();

        //Essa linha inverte a String/Texto escrito acima
        StringBuilder invertida = new StringBuilder();
        for (int i = normal.length() - 1; i >= 0; i--) {
            invertida.append(normal.charAt(i));
        }

        System.out.println(" String Invertida: " + invertida);

        scanner.close();
    }
}
