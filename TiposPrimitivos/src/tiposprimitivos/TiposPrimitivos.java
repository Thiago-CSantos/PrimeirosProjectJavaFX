/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite sua nota:");
        Scanner n1 = new Scanner(System.in);
        float nota = n1.nextFloat();
        
        System.out.println("Qual o seu nome:");
        Scanner teclado = new Scanner (System.in);
        String nome = teclado.nextLine();
        
        
        System.out.printf("Olá %s sua nota é: %.3f", nome, nota);
                //printf (Impressão formatadam, igual se usa em 'C');
                //print (Igual de 'javaScript' print("" +nota);
       
        
        
    }
    
}
