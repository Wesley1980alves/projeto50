/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto50;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class ClasseValorReal {

    public double mostrarDecimal(double valorDecimal) {

        Scanner num = new Scanner(System.in);
        System.out.println("Digite um valor decimar ");
        valorDecimal = num.nextDouble();
        int valor = (int) valorDecimal;
        System.out.println(" A Parte Decimal e: " +""+ valor);
        return 0;

    }

}
