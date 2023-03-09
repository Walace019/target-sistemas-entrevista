package Questoes;

import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para calcular a sequência Fibbonaci");
        int num = scanner.nextInt();
        int fibo1 = 0;
        int fibo2 = 2;
        int fibo;
        boolean pertence = false;

        for (int i = 2; i <= num; i++) {
            fibo = fibo1 + fibo2;
            if (fibo == num) {
                pertence = true;
                break;
            }
            fibo1 = fibo2;
            fibo2 = fibo;
        }

        if (pertence) {
            System.out.println(num + " Pertence á sequencia de Fibonnaci !");
        } else {
            System.out.println(num + " Não pertence á sequencia de Fibbonaci ! ");
        }

    }

}
