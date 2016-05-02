/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

import java.util.ArrayList;

/**
 *
 * @author zenpl
 */
public class FactoryVenditori {

    private static FactoryVenditori singleton;
    static ArrayList<Venditore> listaVenditori = new ArrayList<Venditore>();
   
    public static FactoryVenditori getInstance() {
        if (singleton == null) {
            singleton = new FactoryVenditori();
        }
        return singleton;
    }
   
    public FactoryVenditori(){       
        Venditore venditore1 = new Venditore();
        venditore1.setNome("Alberto");
        venditore1.setCognome("Alberti");
        venditore1.setNickname("AAAAAA");
        venditore1.setPassword("0");
        venditore1.setId(0);
        listaVenditori.add(venditore1);
        
        //#2
        Venditore venditore2 = new Venditore();
        venditore2.setNome("Bruno");
        venditore2.setCognome("Bruni");
        venditore2.setNickname("BBBBBB");
        venditore2.setPassword("1");
        venditore2.setId(1);
        listaVenditori.add(venditore2); 
    }
   
    public static ArrayList<Venditore> getVendtioriList(){
        return listaVenditori;
    }   
}
