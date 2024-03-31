package com.calculadora;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // scanner faz a leitura do meu input (in)
        Scanner scanner = new Scanner(System.in);

        //criar variaveis para armazenar valores
        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar;

        //leitura dos valores
        do{
            System.out.println("Digite o valor um: ");
            valorUm = scanner.nextDouble();
    
            System.out.println("Digite a operação desejada (+, -, *, /)");
            operacao = scanner.next();
    
            System.out.println("Digite o valor dois: ");
            valorDois = scanner.nextDouble();
    
            System.out.println("Resultado: "+ realizarCalculo(valorUm, valorDois, operacao));

            continuar = verificarNovaOperacao();
        }while(continuar);
       // O laço Do vai fazer a leitura dos valores e realizar a acao

    }

    //Nesta classe, enquanto o valor for "S", a calculadora continua a funcionar, até que
    // o valor seja "N" ou "NÃO".
    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação? (S ou N): ");

        //leitura do valor
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");

    };
    
    public static Double realizarCalculo (Double valorUm, Double valorDois, String operacao){
        Double respostaCalculo =0.0;

        switch(operacao){
            case "+":
                respostaCalculo= valorUm + valorDois;
            break;

            case "-":
                respostaCalculo= valorUm - valorDois;
            break;

            case "*":
            respostaCalculo= valorUm * valorDois;
            break;

            case "/":
            respostaCalculo= valorUm / valorDois;
            break;

            default:
        };
        return respostaCalculo;
    }
}
    
    
