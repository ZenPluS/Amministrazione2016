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
public class Cliente extends Utente{
    /* Attributi */
    protected ArrayList<Oggetto> oggettiAcquistati = new ArrayList<Oggetto>();
    private Saldo mySaldo;
    
    /* Costruttore */
    public Cliente(){
        super();
    }
    
    public Cliente(String nickname, String password, String nome, String cognome, int id){
        super(nickname, password, nome, cognome, id);
    }
            
    /* Metodi */
    /**
     * @return the esamiSuperati
     */
    public ArrayList<Oggetto> getOggettiAcquistati() {
        return oggettiAcquistati;
    }

    /**
     * @param oggettiAcquistati the oggettiAcquistati to set
     */
    public void setOggettiAcquistati(ArrayList<Oggetto> oggettiAcquistati) {
        this.oggettiAcquistati = oggettiAcquistati;
    }

    /**
     * @return the mySaldo
     */
    public Saldo getMySaldo() {
        return mySaldo;
    }

    /**
     * @param mySaldo the mySaldo to set
     */
    public void setMySaldo(Saldo mySaldo) {
        this.mySaldo = mySaldo;
    }
}
