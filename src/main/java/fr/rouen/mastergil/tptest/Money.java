package fr.rouen.mastergil.tptest;

public class Money {

    private int montant;
    private Devise devise;

    public Money() {
        this.setMontant(0);
        this.setDevise(Devise.EURO);
    }

    public Money(int montant, Devise devise) {
        this.setMontant(montant);
        this.setDevise(devise);
    }

    public boolean isPositif() {
        return this.montant >= 0;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        if (null == devise) {
            throw new IllegalArgumentException("Devise doit être spécifiée");
        }
        this.devise = devise;
    }
}
