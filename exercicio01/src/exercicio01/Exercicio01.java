/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite quantos anos voce tem");
        Scanner x = new Scanner(System.in);
        
        int ano = x.nextInt();
        
        System.out.println("Digite quantos meses voce tem:");
        Scanner xx = new Scanner(System.in);
        
        int mes = xx.nextInt();
        
        System.out.println("Digite quantos dias voce tem:");
        Scanner xxx = new Scanner(System.in);
        
        int dia = xxx.nextInt();
        
        int result = (ano*365)+(mes*30)+dia;
        
        System.out.printf("%d %d %d = %d", ano, mes, dia, result);
        
        
        
        
        
        
    }
    
}
