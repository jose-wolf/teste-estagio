package exercicio2;

import java.util.Scanner;

public class Teste2 {
    /*
    Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
    anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
    informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
    pertence ou não a sequência.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade para o cálculo de Fibonacci");
        int numero1 = 0;
        int numero2 = 1;
        int soma = 0;

        for(int qtd = Integer.parseInt(scanner.nextLine()); qtd > 0; qtd--){
            System.out.print(numero1 + " ");
            soma = numero1 + numero2;
            numero1 = numero2;
            numero2 = soma;
        }
        System.out.println("\nValor total do calculo Fibonacci é: " + numero1);
        scanner.close();
    }

}
