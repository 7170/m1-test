package fr.rouen.mastergil.tptest;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyUnitTest {

    @Test
    public void le_constructeur_vide_doit_creer_un_objet_0_EURO() throws Exception {
        final Money money = new Money();
        assertEquals(0, money.getMontant());
        assertEquals(Devise.EURO, money.getDevise());
    }

    @Test
    public void le_constructeur_non_vide_doit_creer_un_objet_avec_les_valeurs_en_parametre() throws Exception {
        final Money money = new Money(20, Devise.DOLLAR);
        assertEquals(20, money.getMontant());
        assertEquals(Devise.DOLLAR, money.getDevise());
    }

    @Test
    public void getMontant_doit_retourner_le_montant_correct() throws Exception {
        final Money money = new Money(20, Devise.EURO);
        final int montant = money.getMontant();
        assertEquals(20, montant);
    }

    @Test
    public void getDevise_doit_retourner_la_devise_correcte() throws Exception {
        final Money money = new Money(20, Devise.EURO);
        final Devise devise = money.getDevise();
        assertEquals(Devise.EURO, devise);
    }

    @Test
    public void isPositif_doit_etre_vrai_si_montant_superieur_a_zero() throws Exception {
        final Money money = new Money(20, Devise.EURO);
        final boolean positif = money.isPositif();
        assertTrue(positif);
    }

    @Test
    public void isPositif_doit_etre_vrai_si_montant_egal_a_zero() throws Exception {
        final Money money = new Money(0, Devise.EURO);
        final boolean positif = money.isPositif();
        assertTrue(positif);
    }

    @Test
    public void isPositif_doit_etre_faux_si_montant_inferieur_a_zero() throws Exception {
        final Money money = new Money(-20, Devise.EURO);
        final boolean positif = money.isPositif();
        assertFalse(positif);
    }


    @Test
    public void il_est_impossible_d_avoir_une_devise_nulle() throws Exception {
        final Money money = new Money(20, Devise.EURO);
        try {
            money.setDevise(null);
            fail("setDevise doit envoyer une exception si aucune devise n'est spécifiée");
        } catch (IllegalArgumentException iae) {
            assertEquals("Devise doit être spécifiée", iae.getMessage());
        }
    }

}