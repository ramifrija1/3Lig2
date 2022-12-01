package com.firstapp.rami;

public class UserModel {
    String nom,prenom,email,location,experience,domaine,pass;
    public UserModel(){

    }
    public UserModel(String nom,String prenom,String email,String location, String experience,String domaine,String pass){
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.location=location;
        this.experience=experience;
        this.domaine=domaine;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
