package com.DSI32G4.MyLab.ui.send;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.DSI32G4.MyLab.Accueil;
import com.DSI32G4.MyLab.R;
import com.DSI32G4.MyLab.loginActivity;

public class SendFragment extends Fragment {

    private SendViewModel sendViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        Intent intent = new Intent(getActivity(), loginActivity.class);
        startActivity(intent);
        return null;
    }
}