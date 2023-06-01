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
public class Test3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        String respuesta = "S";
        
        System.out.println("Debe escribir una nota entre 0 y 10");
            nota = leer.nextInt();
        
        while (respuesta.equalsIgnoreCase("S")) {
            
            
            if (nota < 11 && nota > 0) {
                System.out.println("Tu nota es " + nota);
                respuesta = "N";
            } else  {
            System.out.println("Debe escribir una nota entre 0 y 10");
                nota = leer.nextInt();    
        }
            
        
    }
}}
