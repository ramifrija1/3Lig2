package com.firstapp.rami;

public class Recruteur {
    String nom,email,description,pass;
    public Recruteur(){

    }
    public Recruteur(String nom,String email, String description,String pass){
        this.nom=nom;

        this.email=email;
        this.description=description;
        this.pass=pass;
    }
    public String getPass(){return  pass;}

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
