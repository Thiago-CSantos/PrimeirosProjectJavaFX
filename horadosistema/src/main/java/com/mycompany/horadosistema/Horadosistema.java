package com.mycompany.horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.*;

/**
 *
 * @author thiag
 */
public class Horadosistema {

    public static void main(String[] args) {
        Date datahora = new Date();
        System.out.println("A hora do sistema é:");
        System.out.println(datahora.toString());

        Locale lingua = Locale.getDefault();
        System.out.println("A linguagem do sistema esta em: " + lingua.getDisplayLanguage());

        // Resolução da tela
        Toolkit tela = Toolkit.getDefaultToolkit();
        
        Dimension wh = tela.getScreenSize();
        
        System.out.print(wh);
    }
}
