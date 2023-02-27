/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.jobrotation.sp;

import java.text.DecimalFormat;

/**
 *
 * @author deive
 */
public class Exercicio_04 {

    static double sp = 67836.43;
    static double rj = 36678.66;
    static double mg = 29229.88;
    static double es = 27165.48;
    static double outros = 19849.53;

    public static double total() {

        double total = sp + rj + mg + es + outros;
        return total;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("O percentual de representação das empresas são:");
        System.out.println("SP: " + df.format(((sp*100)/total())) + "%");
        System.out.println("RJ: " + df.format(((rj*100)/total())) + "%");
        System.out.println("MG: " + df.format(((mg*100)/total())) + "%");
        System.out.println("ES: " + df.format(((es*100)/total())) + "%");
        System.out.println("Outros: " + df.format(((outros*100)/total())) + "%");

    }

}
