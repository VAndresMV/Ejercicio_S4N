/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_s4n;

/**
 *
 * @author MyA
 */
import java.util.Scanner;


public class Ejerc_S4N {
     public static void main(String[] args) {
         
        //Prueba:
        // Multiplos de 1 a 100
        // Multiplos de 5 y 3 imprimir "FizzBuzz"
        // Multiplos de 3 imprimir "Fizz"
        // Multiplos de 5 imprimir "Buzz"
        
        Scanner scn = new Scanner(System.in);
        int num = 0, limite = 100;

        System.out.println("Ingresar numero para calcular multiplo:");
        num = scn.nextInt();
        System.out.println("Resultado:");

        for (int i = 0; i <= limite; i++) {

            if (i % num == 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    if (i % 3 == 0) {
                        System.out.println("Fizz");
                    } else {
                        if (i % 5 == 0) {
                            System.out.println("Buzz");
                        } else {
                            System.out.println(i);
                        }
                    }
                }
            }
        }
    }
}

