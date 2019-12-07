package com.DSI32G4.MyLab;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class AccesLocal {
    //proprietes
    private  String nomBase ="reservili.sqlite";
    private  Integer versionBase =1;
    private MySQLITE accesBD;
    private SQLiteDatabase bd;
    public AccesLocal(Context contexte){
        accesBD=new MySQLITE(contexte, nomBase ,null,versionBase);

    }

    /**
     * Ajout de reservation dans la base donnee
     * @param reservation
     */
    public void ajout (Reservation reservation)
    {
bd=accesBD.getWritableDatabase();
        String req="insert into reservation (id_reservation,equipe1,equipe2,stade,datematch,ncin,prix)";
        req += "("+reservation.getId_reservation()+",\""+reservation.getEquipe1()+"\",\""+reservation.getEquipe2()+"\",\""+reservation.getStade()+"\","+reservation.getNcin()+","+reservation.getPrix()+")";
bd.execSQL(req);
    }

    /**
     * Recuperation de dernier reservation
     */
    public void RecupDernier(){
bd = accesBD.getReadableDatabase();
Reservation reservation =null;
String req="select * FROM reservation";
        Cursor curseur = bd.rawQuery(req, null);
curseur.moveToLast();
//if (curseur.isAfterLast()){
//Date date=new Date();
//Integer id_reservation= curseur.getInt(1);
   // Integer id_reservation= curseur.getInt(1);
//}

    }
}
