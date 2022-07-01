/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Insira um numero: ");
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();
        
        int ant = num-1;
        int suc = num+1;
        
        System.out.printf("Antecessor %d de %d e seu sucessor %d \n", ant, num, suc);
        
    }
    
}
