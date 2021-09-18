/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author marle
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in); 
        System.out.println("ingrese un numero entero: ");
        int num = ingreso.nextInt();
        int resultado = num * 2;
        int resultado1 = num * 3;
        
        System.out.println("el doble del numero es : " + resultado);
        System.out.println("el triple del numero es : " + resultado1);
    }
    
}
