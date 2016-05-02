<%-- 
    Document   : descrizione
    Created on : 29-apr-2016, 21.09.36
    Author     : zenpl
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pagina di descrizione</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Enrico Meloni">
        <meta charset="UTF-8">
        <meta name="keywords" content="Vendita app per il mobile">
        <link href="CSS/style.css" rel="stylesheet" type="text/css" media="screen" />
        <!-- modifica percorso CSS per matchiare con le cartelle -->
    </head>
    <body>
        <div id="page">
            
                <jsp:include page="header.jsp" />               <!--header-->
            
        <!--Sommario-->
            <div id="Sommario">
                <h2>All Thing App Market</h2>
                <ol>
                    <li><a href="#Introduzione">Cosa &egrave; All Thing App Market</a></li>
                    <li><a href="#Affari">Affari</a></li>
                    <li><a href="#ForWear">App per indossabili</a></li>
                    <li><a href="#Comunicazione">Communicazione</a></li>
                    <li><a href="#Famiglia">App per la famiglia</a></li>
                    <li><a href="#Finanza">Finanza</a></li>
                    <li><a href="#Fotografia">Fotografia</a></li>
                    <li><a href="#Fumetti">Fumtetti</a></li>
                    <li><a href="#Giochi">Giochi</a></li>  
                    <li><a href="#ForCast">App per Cast locale</a></li>
                    <li><a href="#Intrattenimento">Intrattenimento</a></li>
                    <li><a href="#Istruzione">Istruzione</a></li>
                    <li><a href="#Medicina">Medicina</a></li>
                    <li><a href="#Meteo">Meteo</a></li>
                    <li><a href="#Multimedia">Multimedia</a></li>
                    <li><a href="#MusicaAudio">Musica e riproduzione audio</a></li>
                    <li><a href="#News">News e Feed</a></li>
                    <li><a href="#Personalizzazione">Personalizzazione</a></li>
                    <li><a href="#Produttività">Produttività</a></li>
                    <li><a href="#SaluteFitnessSport">Salute, fitness e sport</a></li>
                    <li><a href="#Wallpapers">Wallpaper e sfondi animati</a></li>  
                    <li><a href="#Social">Social</a></li>
                    <li><a href="#Strumenti">Strumenti</a></li>
                    <li><a href="#ViaggiTrasporti">Viaggi e trasporto pubblico</a></li>
                    <li><a href="#Widget">Widget</a></li>
                </ol>

            </div>

            <!-- contenuto -->
            <div id="content">
                    <h2 id="Introduzione">Cos'è All Thing App Market?</h2>
                    <p>
                    All Thing App Market è un negozio virtuale online di applicazioni.
                    Qui puoi trovare tutte le applicazioni degli sviluppatori che
                    non hanno la possibilità di pubblicare il loro software sui market
                    convenzionali in quanto richiedono un pagamento per la stipulazione del
                    contratto d'uso. Qui tutti coloro che hanno sviluppato un app possono 
                    pubblicarla,a patto che venga fornito il codice sorgente. Perchè? 
                    Be il motivo che porta altri market a cancellare app presenti nei propri
                    store è la presenze di software malevolo. In questo modo avremo la 
                    possibilità di controllare e assicurare che il software pubblicato non 
                    sia dannoso per chi lo acuisterà e i sorgenti non saranno resi pubblichi
                    a meno che non sia lo sviluppatore stesso a renderli pubblici.
                    Vi chiederete, ma voi come guadagnate? La presenza di banner 
                    pubblicitari ci garantisce di fornire un servizio efficiente, in più è 
                    possibile effetuare delle donazioni libere. Oltre questo, per ogni 
                    transazione effettuata, il 5% sarà trattenuto, mentre il resto sarà 
                    versato allo sviluppatore.
                    Di seguito, un elenco della categorie di come è organizzato il sito.
                    </p>
                    <h3 id="Affari"> Affari </h3>     
                    <p>
                        In questa sezione saranno presenti le applicazioni per la produttività 
                        come lettori PDF, convertitori di valuta ecc.
                    </p>

                    <h3 id="ForWear"> App per indossabili </h3>
                     <p>
                        In questa sezione saranno presenti le applicazioni compatibili con i 
                        dispositivi indossabili
                    </p>

                    <h3 id="Communicazione"> Communicazione </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni per la 
                        commnunicazione come dialer per le telefonate e App per l'uso di canali 
                        IRC
                    </p>

                    <h3 id="Famiglia"> App per la famiglia </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni per l'utilizzo 
                        contemporaeno tra tutti i membri della famiglia
                    </p>    

                    <h3 id="Finanza"> Finanza </h3>     
                    <p>
                        In questa sezione saranno presenti le applicazioni per le news e per 
                        seguire gli andamenti dei mercati in tempo reale
                    </p>

                    <h3 id="Fotografia"> Fotografia </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni per la cattura e la 
                        modifica delle foto
                    </p>

                    <h3 id="Fumetti"> Fumetti </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni per la lettura 
                        online e offline di fumetti e manga
                    </p>

                    <h3 id="Giochi"> Giochi </h3>
                    <p>
                        In questa sezione saranno presenti i giochi, suddivisa in ulteriori 
                        categorie per tipologia di gioco
                    </p>

                    <h3 id="ForCast"> App per Cast locale </h3>     
                    <p>
                        In questa sezione saranno presenti le applicazioni per eseguire il cast 
                        via Wi-Fi verso HomeTV
                    </p>

                    <h3 id="Intrattenimento"> Intrattenimento </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni per streaming e/o 
                        download di film e serie TV come Netflix
                    </p>

                    <h3 id="Istruzione"> Istruzione </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni per l'itruzione, come 
                        tradutori, dizionari, calcolatrici e manuali
                    </p>

                    <h3 id="Medicina"> Medicina </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni inerenti alla 
                        medicina e all'anatomia
                    </p>

                    <h3 id="Meteo"> Meteo </h3>     
                    <p>
                        In questa sezione saranno presenti le applicazioni
                    </p>

                    <h3 id="Multimedia"> Multimedia </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni specializzate nella 
                        riproduzione ed editing audio e video
                    </p>

                    <h3 id="MusicaAudio"> Musica e riproduzione audio </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni per la riproduzione 
                        musicale e streaming radio via internet
                    </p>

                    <h3 id="News"> News e Feed </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni per la lettura delle 
                        più importanti testate giornalistiche italiane e internazionali
                    </p>

                    <h3 id="Personalizzazione"> Personalizzazione </h3>     
                    <p>
                        In questa sezione saranno presenti le applicazioni come iconpack, temi 
                        ecc
                    </p>

                    <h3 id="Produttività"> Produttività </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni simili a quelle 
                        contenute nella categoria  affari
                    </p>

                    <h3 id="SaluteFitnessSport"> Salute, fitness e sport </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni dedicate agli 
                        sportivi e app che sfruttano chip interni ai device per misurare 
                        pressione e battito cardiaco in tempo reale
                    </p>

                    <h3 id="Wallpapers"> Wallpaper e sfondi animati </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni contenenti wallpaper
                        statici o animati
                    </p>

                    <h3 id="Social"> Social </h3>     
                    <p>
                        In questa sezione saranno presenti le applicazioni come Facebook, 
                        Twitter, Google plus ecc.
                    </p>

                    <h3 id="Strumenti"> Strumenti </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni come file manager,
                        strumenti di editing e modifica del sistema (root users)
                    </p>

                    <h3 id="ViaggiTrasporti"> Viaggi e trasporto pubblico </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni dedicate alla
                        prenotazione di biglietti e consultare disponibilità di voli da e verso
                        una determinata meta e per quanto concerne il trasporto pubblico, 
                        visualizzare informzioni sui mezzi in transito in una data fermata
                    </p>

                    <h3 id="Widget"> Widget </h3>
                    <p>
                        In questa sezione saranno presenti le applicazioni che permetetranno la 
                        creazione di widget da aggiungere alla homescreen del dispositivo
                    </p>
            </div>
            
                <jsp:include page="footer-design.jsp" />        <!--footer-->
            
        </div>
    </body>
</html>

