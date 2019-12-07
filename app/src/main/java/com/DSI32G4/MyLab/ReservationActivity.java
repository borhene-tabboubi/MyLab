package com.DSI32G4.MyLab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class ReservationActivity extends Activity {
    private TextView id_reservation;
    private TextView equipe1;
    private TextView equipe2;
    private TextView stade;
    private TextView datematch;
    private EditText ncin;
    private TextView prix;
    private Button button;

    private void init() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        id_reservation = (EditText) findViewById(R.id.idreservation);
        ncin = (EditText) findViewById(R.id.ncin);
        button = (Button) findViewById(R.id.button);
        stade = findViewById(R.id.stade);
        prix = findViewById(R.id.prix);
        datematch = (EditText) findViewById(R.id.datematch);
        equipe1 = findViewById(R.id.equipe1);
        equipe2 = findViewById(R.id.equipe2);
        startActivity(new Intent(getApplicationContext(), Controle.class));
    }
}
