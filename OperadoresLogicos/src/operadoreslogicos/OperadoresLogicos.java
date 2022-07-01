/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author thiag
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1 = 5;
        int n2 = 10;
        int n3 = 50;
        
        
        String res;
        
        
        res = (n1>=n2 ^ n1<n3)?"Ou exclussivo":"so é falso se as duas forem verdadeira";
        
         
        System.out.println(res);
    }
    
}
