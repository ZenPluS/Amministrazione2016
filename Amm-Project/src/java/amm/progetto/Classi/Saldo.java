/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

/**
 *
 * @author zenpl
 */
public class Saldo {
    private Double entrate;
    private Double uscite;
    private Double saldoAttuale;
    
    /* Costruttore con parametri*/
    public Saldo(){
        entrate=0.0;
        uscite=0.0;
        saldoAttuale=0.0;
    }
    
    /* Costruttore senza parametri*/
    public Saldo(Double entrte, double uscite){
        this.entrate = entrte;
        this.uscite = uscite;
        this.saldoAttuale = entrte - uscite;
    }
        
        
    /**
     * @return the entrate
     */
    public Double getEntrate() {
        return entrate;
    }

    /**
     * @param entrate the entrate to set
     */
    public void setEntrate(Double entrate) {
        this.entrate = entrate;
    }

    /**
     * @return the uscite
     */
    public Double getUscite() {
        return uscite;
    }

    /**
     * @param uscite the uscite to set
     */
    public void setUscite(Double uscite) {
        this.uscite = uscite;
    }

    /**
     * @return the saldoAttuale
     */
    public Double getSaldoAttuale() {
        return saldoAttuale;
    }

    /**
     * Other version of setSaldoAttuale
     */
    public void setSaldoAttuale() {
        this.saldoAttuale = this.saldoAttuale + this.entrate - this.uscite;
    }
    
    /**
     * @param saldoAttuale the saldoAttuale to set
     */
    public void setSaldoAttuale(Double saldoAttuale) {
        this.saldoAttuale = saldoAttuale;
    }
    
}
