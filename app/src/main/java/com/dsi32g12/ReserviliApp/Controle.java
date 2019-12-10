package com.dsi32g12.ReserviliApp;

import android.content.Context;

public class Controle {
    private  static AccesLocal accesLocal;
private static  Controle instance=null;
    private Reservation reservation;

    public Controle() {
    }
public static Controle getInstance(Context context){
        if(Controle.instance==null){
            Controle.instance =new Controle();
            accesLocal= new AccesLocal(context);
        }
        return Controle.instance;
}
    /**
     *
     * @param id_reservation
     * @param equipe1
     * @param equipe2
     * @param stade
     * @param datematch
     * @param ncin
     * @param prix
     */
    public void creerReservation (Integer id_reservation, String equipe1, String equipe2, String stade, String datematch, Integer ncin, Integer prix){
reservation =new Reservation(id_reservation,equipe1,equipe2,stade,datematch,ncin,prix);
   accesLocal.ajout(reservation);
    }
}
