/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sexo = 0, i = 0;
        int contM = 0, contF = 0;
        double altura = 0, maior = 0, menor = 0, soma=0, media=0;

        for (i = 0; i < 10; i++) {
            System.out.println("Digite 1-Masculino e para 2-Feminino");
            Scanner entrada = new Scanner(System.in);
            sexo = entrada.nextInt();

            if (sexo == 1) {
                    contM = contM + 1;

                    System.out.println("Qual a sua altura: ");
                    Scanner alt = new Scanner(System.in);
                    altura = alt.nextDouble();
                    
                    soma = soma + altura;

                if (altura >= maior) {
                    maior = altura;
                } 
                
                else if (altura < maior) {
                    menor = altura;
                }
                    
                    
                
            }

            if (sexo == 2) {
                contF = contF + 1;

                System.out.println("Qual a sua altura: ");
                Scanner alt = new Scanner(System.in);
                altura = alt.nextDouble();

                if (altura >= maior) {
                    maior = altura;
                } 
                
                else if (altura < maior) {
                    menor = altura;
                }
            }

        }
//        System.out.printf("ContadorM " + contM + "\n");
//        System.out.printf("ContadorF " + contF + "\n");
        System.out.printf("Menor:" + menor + " maior:" + maior + "\n");
        System.out.printf("Media da altura dos homens" +soma/contM);
        System.out.printf("Numero de mulheres é:"+contF );
    }

}
