package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    Random rand = new Random();

    private int codice;
    private String nome;
    private String descrizione;
    private float prezzo;
    private int iva;
    
    public Prodotto (){
        this.codice = rand.nextInt(1000);
        this.nome = "";
        this.descrizione = "";
        this.prezzo = 0;
        this.iva = 0;
    };

    public Prodotto (String nome, String descrizione, float prezzo, int iva){
        this.codice = rand.nextInt(1000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    };

    // GETTER

    public int getCodice (){
        return codice;
    }
    public String getNome (){
        return nome;
    }
    public String getDescrizione (){
        return descrizione;
    }
    public float getPrezzo() {
        return prezzo;
    }
    public int getIva(){
        return iva;
    }
    public float getPrezzoFinale() {
        float prezzoFinale = prezzo + (prezzo * iva / 100);
        return prezzoFinale;
    }
    public String getNomeCompleto () {
        String nomeCompleto = codice + "-" + nome;
        return nomeCompleto;
    }


    // SETTER

    public void setNome (String nome){
        if (nome.length() > 0){
            this.nome = nome;
        }
    }
    public void setDescrizione (String descrizione){
        if (descrizione.length() > 0){
            this.descrizione = descrizione;
        }
    }
    public void setPrezzo(float prezzo) {
        if(prezzo >= 0)
        {
            this.prezzo=prezzo;
        }
    }
    public void setIva(int iva) {
        if(iva >= 0)
        {
            this.iva=iva;
        }
    }
}
