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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1=leer.nextInt();
        // TODO code application logic here
        System.out.println("Hola");
        System.out.println(num1);
       num1 = 48;
        System.out.println(num1);
       double num2 = 50.04;
       System.out.println(num2);
       boolean val1 = false;
       System.out.println(val1);
       boolean val2 = true ;
       System.out.println(val2);
       String pala1 = "palabra1";
       System.out.println(pala1);
       String pala2 = "palabra2";
       System.out.println(pala2);                        
    }
    
}
