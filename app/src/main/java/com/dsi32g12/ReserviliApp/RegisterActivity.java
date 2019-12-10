package com.dsi32g12.ReserviliApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class RegisterActivity extends Activity {

        EditText first, last, email, DateNaissance, pass, confpass;
        String sexe="null";
        Button save, cancel;
        DataBAseHandler db;
@Override
       protected void onCreate(Bundle savedInstanceState) {
               super.onCreate(savedInstanceState);
               setContentView(R.layout.activity_register);

//recuperations des variables depuis interface graphique
               first= (EditText)findViewById(R.id.editfirstname);
               last =(EditText)findViewById(R.id.editlastname);
               email=(EditText)findViewById(R.id.editemail);
               DateNaissance =(EditText)findViewById(R.id.editmobileno);
               pass=(EditText)findViewById(R.id.editpassword);
               confpass=(EditText)findViewById(R.id.editconformpassword);


               save=(Button)findViewById(R.id.btnsave);
               cancel=(Button)findViewById(R.id.btncancel);

               cancel.setOnClickListener(new OnClickListener() {

                       @Override
                       public void onClick(View arg0) {
                               // passer a la page loginActivity
                               startActivity(new Intent(getApplicationContext(), loginActivity.class));

                       }
               });


               save.setOnClickListener(new OnClickListener() {

@Override
                     public void onClick(View arg0) {
                             // TODO Auto-generated method stub

                             String edfirst = first.getText().toString();
                             String edlast = last.getText().toString();
                             String edemail = email.getText().toString();
                             String edmobile = DateNaissance.getText().toString();
                             String edpass = pass.getText().toString();
                             String edConf = confpass.getText().toString();

                             if(edConf.equals(edpass) ){


                             db = new DataBAseHandler(RegisterActivity.this, null, null, 2);
                                 RegisterData reg = new RegisterData();

                             reg.setfirstName(edfirst);
                             reg.setlastName(edlast);
                             reg.setEmailId(edemail);
                             reg.setDateNaissance(edmobile);
                             reg.setPassword(edpass);
                             db.addregister(reg);

                             Toast.makeText(getApplicationContext(), "Registered", Toast.LENGTH_LONG).show();
                             startActivity(new Intent(getApplicationContext(), loginActivity.class));
        }
        else{

        Toast.makeText(getApplicationContext(), "Password doesn't match", Toast.LENGTH_LONG).show();
        pass.setText("");
        confpass.setText("");
        }
        }
        });
        }
        public void onRadioButtonClicked(View view) {
                // Is the button now checked?
                boolean checked = ((RadioButton) view).isChecked();

                // Check which radio button was clicked
                switch(view.getId()) {
                        case R.id.radio_homme:
                                if (checked){
                                        sexe="Homme";
                                        break;
                                }
                        case R.id.radio_femme:
                                if (checked) {
                                        sexe="Femme";
                                        break;
                                }
                }
        }



        }