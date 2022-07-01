/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Digite seu salario para o reajuste de 1% ");
        Scanner sala = new Scanner(System.in);
        double salario = sala.nextDouble();
        
        double sal = (salario*0.01);
        
        double fsalario = salario+sal;
        
        System.out.printf("Seu reajuste salarial é :" +fsalario);
        
    }
    
}
