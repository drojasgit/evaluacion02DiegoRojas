package com.example.evaluacion02diegorojas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Esta clase representa la animación de bienvenida que se muestra
 * @author Diego Rojas
 * @version 1.0.0
 */
public class BienvenidaAct extends Fragment {

    /**
     * Constructor de la clase BienvenidaAct
     */
    public BienvenidaAct() {
        // Required empty public constructor
    }

    /**
     * Método onCreateView
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return View
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bienvenida_act, container, false);
    }
}
