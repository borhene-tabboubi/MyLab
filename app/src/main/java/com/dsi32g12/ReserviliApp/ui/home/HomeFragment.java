package com.dsi32g12.ReserviliApp.ui.home;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.dsi32g12.ReserviliApp.R;
import com.dsi32g12.ReserviliApp.Reservation;
import com.dsi32g12.ReserviliApp.ReservationActivity;

public class HomeFragment extends Fragment implements View.OnClickListener{
    public FragmentCommunicator fComm;
    int c;
    private HomeViewModel homeViewModel;
    private TextView id_reservation;
    private TextView equipe1;
    private TextView equipe2;
    private TextView stade;
    private TextView datematch;
    private EditText ncin;
    private TextView prix;
    private Button button;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_accueil, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);

            id_reservation = (EditText) getActivity().findViewById(R.id.idreservation);
            ncin = (EditText) getActivity().findViewById(R.id.ncin);
            button = (Button) getActivity().findViewById(R.id.button);
            stade = getActivity().findViewById(R.id.stade);
            prix = getActivity().findViewById(R.id.prix);
            datematch = (EditText) getActivity().findViewById(R.id.datematch);
            equipe1 = getActivity().findViewById(R.id.equipe1);
            equipe2 = getActivity().findViewById(R.id.equipe2);
            button = (Button) getActivity().findViewById(R.id.button);


        }
    public void onClick(final View v) { //check for what button is pressed

                c *= fComm.fragmentContactActivity();
        }


    public interface FragmentCommunicator {
        int fragmentContactActivity();
    }
}