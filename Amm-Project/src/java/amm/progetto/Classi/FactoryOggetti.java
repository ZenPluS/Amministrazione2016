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
public class FactoryOggetti {
  
    private static FactoryOggetti singleton;
    static ArrayList<Oggetto> listaOggetti = new ArrayList<Oggetto>();
   
    public static FactoryOggetti getInstance() {
        if (singleton == null) {
            singleton = new FactoryOggetti();
        }
        return singleton;
    }
   
    public FactoryOggetti(){       
        Oggetto oggetto1 = new Oggetto();
        oggetto1.setNome("Impulse IconPack");
        oggetto1.setDescrizione("Iconpack per il vostro device che utilizza le basi del" +
                                " Material Design detate da Google e pochi colori minimali");
        oggetto1.setPrezzo(1.77);
        oggetto1.setId(0);
        oggetto1.setIcona("SRC/IMG/ImpulseIconPack.png");
        listaOggetti.add(oggetto1);
        
        Oggetto oggetto2 = new Oggetto();
        oggetto2.setNome("Google Search Now");
        oggetto2.setDescrizione("App Google per mobile: il modo più semplice e veloce per" +
                                "trovare ciò che ti serve sul Web e sul tuo dispositivo");
        oggetto2.setPrezzo(0.0);
        oggetto2.setId(1);
        oggetto2.setIcona("SRC/IMG/GoogleSearchNow.png");
        listaOggetti.add(oggetto2);
        
        Oggetto oggetto3 = new Oggetto();
        oggetto3.setNome("MultiROM Manager");
        oggetto3.setDescrizione("App che aggiunge un modulo kernel al vostro dispositivo e" +
                                " e permette l'installazione e l'avvio di più Rom e permette" +
                                "anche la compilazione e l'avvio di Ubuntu Touch");
        oggetto3.setPrezzo(0.0);
        oggetto3.setId(2);
        oggetto3.setIcona("SRC/IMG/MultiRomManager.png");
        listaOggetti.add(oggetto3);
        
        Oggetto oggetto4 = new Oggetto();
        oggetto4.setNome("Browser Chrome - Google");
        oggetto4.setDescrizione("Naviga velocemente sul tuo cellulare o tablet Android con" +
                                " il browser Google Chrome che utilizzi abitualmente sul" +
                                " desktop. Riprendi le tue attività sugli altri dispositivi" +
                                " grazie alla sincronizzazione delle schede, esegui ricerche" +
                                " vocali e riduci l'utilizzo dei dati fino al 50% durante" +
                                " la navigazione");
        oggetto4.setPrezzo(0.0);
        oggetto4.setId(3);
        oggetto4.setIcona("SRC/IMG/GoogleChromeBrowser.png");
        listaOggetti.add(oggetto4);
        
        Oggetto oggetto5 = new Oggetto();
        oggetto5.setNome("Solid Explorer File Manager");
        oggetto5.setDescrizione("Siete alla ricerca di un buon file explorer con un look" +
                                " elegante, moderno e con molte funzioni? Siete nel posto" +
                                " giusto! Solid Explorer è il miglior file & cloud manager," +
                                " con due pannelli indipendenti, che porta una nuova" +
                                " esperienza nella navigazione tra i file");
        oggetto5.setPrezzo(0.0);
        oggetto5.setId(4);
        oggetto5.setIcona("SRC/IMG/SolidExplorerFileManager.png");
        listaOggetti.add(oggetto5);
    }
   
    public static ArrayList<Oggetto> getOggettiList(){
        return listaOggetti;
    }
    
    public Oggetto getOggettotByID(int ID){
        int i;
        for(i=0; i<listaOggetti.size(); i++)
            if (listaOggetti.get(i).getId()== ID)
                return listaOggetti.get(i);
        return null;
    }
}
