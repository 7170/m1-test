package fr.rouen.mastergil.tptest;

import java.sql.Connection;

public interface JdbcDAO {
    Connection setUpConnection();

    Money getSolde();

    int saveMoney(Money solde);

    void creerCompte();

    void creerCompte(int montant, Devise devise);
}
