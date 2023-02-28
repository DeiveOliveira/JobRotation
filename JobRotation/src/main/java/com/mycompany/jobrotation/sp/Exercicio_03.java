/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.jobrotation.sp;

/**
 *
 * @author deive
 */
public class Exercicio_03 {

    public static double[] vetor() {
        double vetor[] = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0,
            42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448,
            18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318,
            1718.1221, 13220.495, 8414.61};

        return vetor;
    }

    public static double media(double vetor[]) {
        int aux = 0;
        double soma = 0;
        double media;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                aux++;
                soma += vetor[i];
            }
        }
        media = soma / aux;
        return media;
    }

    public static double diasSuperiorMedia(double vetor[], double media) {
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                cont++;
            }
        }
        return cont;
    }

    public static double menor(double vetor[]) {
        double menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] != 0 && menor > vetor[i]) {

                menor = vetor[i];
            }
        }
        return menor;
    }

    public static double maior(double vetor[]) {
        double maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês que não seja 0.0 é: " + menor(vetor()));
        System.out.println("");
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: " + maior(vetor()));
        System.out.println("");

        System.out.println("A média de faturamento da empresa é: " + media(vetor()));
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + 
                diasSuperiorMedia(vetor(), media(vetor()))+ " dias");
    }

}
