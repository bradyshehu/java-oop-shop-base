package org.lessons.java.shop;
import java.util.Random;

public class Main {

    Random rand = new Random();
    public static void main(String[] args) {
        Prodotto telefono = new Prodotto("Iphone", "Ultima generazione", 100.00f, 22);

        System.out.println(telefono.nome);
        System.out.printf("%.2f\n",telefono.ottieniPrezzo());
        System.out.printf("%.2f\n",telefono.ottieniPrezzoFinale());
        System.out.println(telefono.ottieniNomeCompleto());
    }
    
}
