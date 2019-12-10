package com.dsi32g12.ReserviliApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.dsi32g12.ReserviliApp.ui.home.FragmentCommunicator;
import com.dsi32g12.ReserviliApp.ui.home.HomeFragment;

public abstract class ReservationActivity extends FragmentActivity implements HomeFragment.FragmentCommunicator {
    private TextView id_reservation;
    private TextView equipe1;
    private TextView equipe2;
    private TextView stade;
    private TextView datematch;
    private EditText ncin;
    private TextView prix;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_accueil);
        id_reservation = (EditText) findViewById(R.id.idreservation);
        ncin = (EditText) findViewById(R.id.ncin);
        button = (Button) findViewById(R.id.button);
        stade = findViewById(R.id.stade);
        prix = findViewById(R.id.prix);
        datematch = (EditText) findViewById(R.id.datematch);
        equipe1 = findViewById(R.id.equipe1);
        equipe2 = findViewById(R.id.equipe2);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ReservationActivity.this,Reservation.class);
                startActivity(intent);
            }
        });
        startActivity(new Intent(getApplicationContext(), Controle.class));
    }
}
