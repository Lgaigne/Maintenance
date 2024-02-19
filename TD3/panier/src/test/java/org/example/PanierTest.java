package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PanierTest {

    @Test
    void devrait_activer_traitement_contenu_Comptabilite_GestionStock() {
        GestionDeStock stock = new GestionDeStock("service Gestion des Stocks");
        Comptabilite compta = new Comptabilite("service Comptable");
        Panier panier = new Panier(stock,compta);

    }
}