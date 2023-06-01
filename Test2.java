/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
/**
 *
 * @author KEVIN
 */
public class Test2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        int numero;
        
        System.out.println("Ingrese una opción");
        numero = leer.nextInt();
        
        switch(numero) {
            case 1: 
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2: 
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3: 
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4: 
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para el tipo de bomba");
        }
    
}
}    
