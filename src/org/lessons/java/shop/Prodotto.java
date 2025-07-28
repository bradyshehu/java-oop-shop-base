package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    Random rand = new Random();

    int codice;
    String nome;
    String descrizione;
    float prezzo;
    int iva;
    
    public Prodotto (String nome, String descrizione, float prezzo, int iva){
        this.codice = rand.nextInt(1000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    };

    public float ottieniPrezzo() {
        return Math.round(prezzo*100)/100f;
    }
    public float ottieniPrezzoFinale() {
        float prezzoFinale = prezzo + (prezzo * iva / 100);
        return Math.round(prezzoFinale*100)/100f;
    }
    public String ottieniNomeCompleto () {
        String nomeCompleto = codice + "-" + nome;
        return nomeCompleto;
    }
}
