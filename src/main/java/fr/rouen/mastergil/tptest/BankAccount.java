package fr.rouen.mastergil.tptest;


import java.text.MessageFormat;

public class BankAccount {
    Money solde;

    public void creerCompte() {
        solde = new Money();
    }

    public void creerCompte(int montant, Devise devise) {
        solde = new Money(montant, devise);
    }

    public String consulterSolde() {
        return MessageFormat.format("Votre solde actuel est de {0} {1}", solde.getMontant(), solde.getDevise().name());
    }

    public void deposerArgent(int montant) {
        solde.setMontant(solde.getMontant() + montant);
    }

    public void retirerArgent(int montant) {
        solde.setMontant(solde.getMontant() - montant);
    }

    public boolean isSoldePositif() {
        return solde.isPositif();
    }
}
