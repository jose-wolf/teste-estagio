package exercicio5;

import java.util.Scanner;

public class teste5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algum texto");

        String texto = scanner.nextLine();
        String reverso = " ";

        for(int i = texto.length()-1; i >=0; i--){
            reverso += String.valueOf(texto.charAt(i));
        }

        System.out.println(reverso);
        scanner.close();
    }
}
