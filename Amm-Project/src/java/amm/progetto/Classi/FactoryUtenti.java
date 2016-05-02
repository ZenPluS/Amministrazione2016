/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

import java.util.ArrayList;

/**
 * @author zenpl
 */
public class FactoryUtenti {
    // Attributi
    private static FactoryUtenti singleton;
    public static FactoryUtenti getInstance() {
        if (singleton == null) {
            singleton = new FactoryUtenti();
        }
        return singleton;
    }

    private ArrayList<Oggetto> listaOggetti = new ArrayList<Oggetto>();
    private ArrayList<Utente> listaVenditori = new ArrayList<Utente>();
    private ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
    private ArrayList<Utente> listaClienti = new ArrayList<Utente>();
    private ArrayList<Saldo> listaSaldi = new ArrayList<Saldo>();
    
    /* Costruttore */
    public FactoryUtenti() {
        
        
        listaVenditori.addAll(FactoryVenditori.getVendtioriList());
        listaClienti.addAll(FactoryClienti.getClientiList());
        
        listaUtenti.addAll(listaVenditori);
        listaUtenti.addAll(listaClienti);
        
        listaOggetti.addAll(FactoryOggetti.getOggettiList());
        listaSaldi.addAll(FactorySaldi.getSaldiList());
        
        ArrayList<Oggetto> oggV1 = new ArrayList<Oggetto>();
        oggV1.add(listaOggetti.get(0)); oggV1.add(listaOggetti.get(1));
        
        ArrayList<Oggetto> oggV2 = new ArrayList<Oggetto>();
        oggV2.add(listaOggetti.get(2));
        
        ArrayList<Oggetto> oggC1 = new ArrayList<Oggetto>();
        oggC1.add(listaOggetti.get(1));
        
        ArrayList<Oggetto> oggc2 = new ArrayList<Oggetto>();
        oggc2.add(listaOggetti.get(0)); oggc2.add(listaOggetti.get(2));
        
        
        for(Utente u : listaUtenti){
            if(u instanceof Venditore){
                switch(u.id){
                    case 0:{
                        ((Venditore) u).setMySaldo(listaSaldi.get(0));
                        ((Venditore) u).setOggettioggettiInVendita(oggV1);
                    }
                    case 1:{
                        ((Venditore) u).setMySaldo(listaSaldi.get(1));
                        ((Venditore) u).setOggettioggettiInVendita(oggV2);
                    }
                }
            }
            else if (u instanceof Cliente){
                switch(u.id){
                    case 9:{
                        ((Cliente) u).setMySaldo(listaSaldi.get(2));
                        ((Cliente) u).setOggettiAcquistati(oggC1);
                    }
                    case 8:{
                        ((Cliente) u).setMySaldo(listaSaldi.get(3));
                        ((Cliente) u).setOggettiAcquistati(oggc2);
                    }
                }
            }

        }
    }   
    /* Metodi */
    public ArrayList<Utente> getVenditoriList(){
        return listaVenditori;
    }
    
    public Utente getVenditore(int id){
        for(Utente u : listaVenditori){
            if(u.id == id)
                return u;
        }
        
        return null;
    }
    
    public ArrayList<Utente> getClientiList(){
        return listaClienti;
    }
    
    public Utente getCliente(int id){
        for(Utente u : listaClienti)
        {
            if(u.id == id)
                return u;
        }
        
        return null;
    }
    
    public ArrayList<Utente> getUserList() {               
        return listaUtenti;
    }
    
    public ArrayList<Oggetto> getOggettiList(){
        return listaOggetti;
    }
    public void addNew(Utente u){
        listaUtenti.add(u);
    }

}