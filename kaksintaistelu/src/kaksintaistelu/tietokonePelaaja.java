/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kaksintaistelu;

import java.util.Random;

/**
 *
 * @author Timo Jääskeläinen @versio 0.02
 * @since 21-3-2012
 *
 * Luokan ohjaa tietokonevastustajan käytöstä.
 *
 * Tänne ohjelmoidaan kuinka tietokonepelaaja toimii erillaisissa tilanteissa.
 * Luokka perii myös luokan Pelaaja
 */
public class TietokonePelaaja extends Pelaaja {

    private int vastustajanHP;
    private int apuNRO;
    private Kortti kortti;

    public TietokonePelaaja(int maara) {
        super(maara);

    }

    /**
     * Metodin on tarkoitus päättää minkä kortin tietokonepelaa
     *
     * Päätös tehdään vastustajan kestojen, omien kestojen ja valittavana
     * olevien korttien perusteella
     *
     * @param ihminenHP saa vastustajan kestot päätöstä varten
     * @return
     */
    public Kortti AIpelaaKortti(int ihminenHP) {
        Random arpoja = new Random();
        apuNRO = arpoja.nextInt(5);
        vastustajanHP = ihminenHP;
        if (getHP() <= vastustajanHP && getHP() <= 16) {
            for (int i = 0; i < kasiKortit.size(); i++) {
                kortti = haeKorttiTietystaPaikasta(i);
                if (kortti.getTunniste() == 3) {
                    return pelaaKortti(i);
                } else if (kortti.getTunniste() == 4) {
                    return pelaaKortti(i);
                }
            }
        } else if (getHP() <= vastustajanHP && vastustajanHP <= 10) {
            for (int i = 0; i < kasiKortit.size(); i++) {
                kortti = haeKorttiTietystaPaikasta(i);
                if (kortti.getTunniste() == 1) {
                    return pelaaKortti(i);
                } else if (kortti.getTunniste() == 2) {
                    return pelaaKortti(i);
                }
            }
        } else if (getHP() <= 4 && vastustajanHP >= 18) {
            for (int i = 0; i < kasiKortit.size(); i++) {
                kortti = haeKorttiTietystaPaikasta(i);
                if (kortti.getTunniste() == 5) {
                    return pelaaKortti(i);
                }
            }
        }

        return pelaaKortti(apuNRO);
    }
    
}
