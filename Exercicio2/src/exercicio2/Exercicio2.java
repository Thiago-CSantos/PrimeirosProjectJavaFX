/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author thiag
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float n1 = (float)8.9;
        float n2 = (float) 7;
        
        float media1 = (n1 + n2)/2;
        
        
        float n3 = (float) 4.5;
        float n4 = (float) 6;
        
        float media2 = (n3+n4)/2;
        
        float media = (media1+media2)/2;
        
        System.out.printf("Primeira media: %.2f \n", media1);
        
        System.out.printf("Segunda media: %.2f \n", media2);
        
        System.out.printf("Media da media: %.2f \n", media);
    }
    
}
