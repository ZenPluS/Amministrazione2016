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
public class FactorySaldi {

    private static FactorySaldi singleton;
    static ArrayList<Saldo> listaSaldi = new ArrayList<Saldo>();
   
    public static FactorySaldi getInstance() {
        if (singleton == null) {
            singleton = new FactorySaldi();
        }
        return singleton;
    }
   
    public FactorySaldi(){       
        Saldo saldoV1 = new Saldo();
        saldoV1.setEntrate(400.00);
        saldoV1.setUscite(200.00);
        saldoV1.setSaldoAttuale();
        
        Saldo saldoV2 = new Saldo();
        saldoV2.setEntrate(210.00);
        saldoV2.setUscite(160.00);
        saldoV2.setSaldoAttuale();

        Saldo saldoC1 = new Saldo();
        saldoC1.setEntrate(150.00);
        saldoC1.setUscite(30.00);
        saldoC1.setSaldoAttuale();
        
        Saldo saldoC2 = new Saldo();
        saldoC2.setEntrate(200.00);
        saldoC2.setUscite(160.00);
        saldoC2.setSaldoAttuale();
        
        listaSaldi.add(saldoV1);//0
        listaSaldi.add(saldoV2);//1
        listaSaldi.add(saldoC1);//2
        listaSaldi.add(saldoC2);//3
    }
   
    public static ArrayList<Saldo> getSaldiList(){
        return listaSaldi;
    }
}
