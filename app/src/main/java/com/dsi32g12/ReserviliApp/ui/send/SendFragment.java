package com.dsi32g12.ReserviliApp.ui.send;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.dsi32g12.ReserviliApp.loginActivity;

public class SendFragment extends Fragment {

    private SendViewModel sendViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        Intent intent = new Intent(getActivity(), loginActivity.class);
        startActivity(intent);
        return null;
    }
}