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
public class FactoryClienti {
   
    private static FactoryClienti singleton;
    static ArrayList<Cliente> listaClienti = new ArrayList<Cliente>();
   
    public static FactoryClienti getInstance() {
        if (singleton == null) {
            singleton = new FactoryClienti();
        }
        return singleton;
    }
   
    public FactoryClienti(){
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Carlo");
        cliente1.setCognome("Contu");
        cliente1.setNickname("CCCCCC");
        cliente1.setPassword("3");
        cliente1.setId(9);
        listaClienti.add(cliente1);
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Dario");
        cliente2.setCognome("Dessi");
        cliente2.setNickname("DDDDDD");
        cliente2.setPassword("4");
        cliente2.setId(8);
        listaClienti.add(cliente2);
    }
   
    public static ArrayList<Cliente> getClientiList(){
        return listaClienti;
    }
   
}
