package org.example;

import java.util.ArrayList;
import java.util.Observable;

public class Panier {
    private GestionDeStock stock;
    private Comptabilite compta;
    private String contenu;

    private DeclenchementCommande sujet = new DeclenchementCommande();

    public Panier (GestionDeStock pStock, Comptabilite pCompta) {
        this.stock = pStock;
        this.compta = pCompta;
        this.contenu = new String ("Contenu du panier");
    }

    public String getContenu() {
        return this.contenu;
    };

    public void declencherCommande() {
        this.stock.traite(this.contenu);
        this.compta.traite(this.contenu);
    }

    public class DeclenchementCommande extends Observable {
        public void notifyObservers;
    }
}
