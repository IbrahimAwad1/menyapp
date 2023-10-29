package com.example.menuapp;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ForrattFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflera layouten för detta fragment
        return inflater.inflate(R.layout.fragment_kibbeh, container, false);
    }
}
