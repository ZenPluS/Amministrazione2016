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
public class Oggetto {
    private String nome;
    private int id;
    private String icona; ///icona perchè immagine, ma in realtà sono link
    private String descrizione;
    private Double prezzo;
    private Venditore venditore;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * @param descrizione the descrizione to set
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * @return the prezzo
     */
    public Double getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the prezzo to set
     */
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * @return the venditore
     */
    public Venditore getVenditore() {
        return venditore;
    }

    /**
     * @param venditore the venditore to set
     */
    public void setVenditore(Venditore venditore) {
        this.venditore = venditore;
    }

    /**
     * @return the icona
     */
    public String getIcona() {
        return icona;
    }

    /**
     * @param icona the icona to set
     */
    public void setIcona(String icona) {
        this.icona = icona;
    }
}
