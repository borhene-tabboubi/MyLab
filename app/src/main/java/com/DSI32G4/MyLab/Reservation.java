package com.DSI32G4.MyLab;


public class Reservation{
   Integer id_reservation;
        String equipe1;
        String equipe2;
        String     stade;
        String  datematch;
    Integer       ncin;
  Integer prix;

    public Reservation() {
    }

    public Reservation(Integer id_reservation, String equipe1, String equipe2, String stade, String datematch, Integer ncin, Integer prix) {
        this.id_reservation = id_reservation;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.stade = stade;
        this.datematch = datematch;
        this.ncin = ncin;
        this.prix = prix;
    }

    public int getId_reservation() {
        return id_reservation;
    }

    public String getEquipe1() {
        return equipe1;
    }

    public String getEquipe2() {
        return equipe2;
    }

    public String getStade() {
        return stade;
    }

    public String getDatematch() {
        return datematch;
    }

    public int getNcin() {
        return ncin;
    }

    public int getPrix() {
        return prix;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }

    public void setEquipe1(String equipe1) {
        this.equipe1 = equipe1;
    }

    public void setEquipe2(String equipe2) {
        this.equipe2 = equipe2;
    }

    public void setStade(String stade) {
        this.stade = stade;
    }

    public void setDatematch(String datematch) {
        this.datematch = datematch;
    }

    public void setNcin(int ncin) {
        this.ncin = ncin;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
