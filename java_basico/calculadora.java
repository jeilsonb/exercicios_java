package java_basico;

// Calculadora Simples

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double numero1, numero2;
        double soma, subtracao, multiplicacao, divisao;
        int operador;
        
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("\nInforme o Primeiro Valor: ");
            numero1 = entrada.nextDouble();

            System.out.println("\nInforme o Segundo Valor: ");
            numero2 = entrada.nextDouble();

            System.out.println("\n--- SELECIONE UMA OPERAÇÃO ---");
            System.out.println("1 - Para Soma \n2 - Para Subtração \n3 - Para Multiplicação \n4 - Para Divisão\n");
            operador = entrada.nextInt();
        }

        switch(operador) {
            case 1:
                soma = numero1 + numero2;
                System.out.print("\nA soma é: " + soma);
                break;

            case 2:
                subtracao = numero1 - numero2;
                System.out.println("\nA subtraçao é: " + subtracao);
                break;

            case 3:
                multiplicacao = numero1 * numero2;
                System.out.println("\nA multiplicação é: " + multiplicacao);
                break;

            case 4:
                if (numero1 < numero2) {
                    System.out.println("\nImpossivel de Realizar o cálculo");
                } else {
                    divisao = numero1 / numero2;
                    System.out.println("\nA divisão é: " + divisao);
                }
                break;

            default:
                System.out.println("\nOPERAÇÃO INVÁLIDA!");     
        }  
    }
}