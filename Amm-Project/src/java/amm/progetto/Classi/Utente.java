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
public abstract class Utente {
    /* Attributi */
    protected int id;
    protected String nome;
    protected String cognome;
    protected String nickname;
    protected String password;
    
    
    /* Costruttore senza parametri*/
    public Utente(){
        id = 0;
        nome = "";
        cognome = "";
        nickname="";
        password="";
    }
    
    /* Costruttore con parametri*/
    public Utente( String nome, String cognome, String nickname, String password, int id){
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.nickname= nickname;
        this.password= password;
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
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
