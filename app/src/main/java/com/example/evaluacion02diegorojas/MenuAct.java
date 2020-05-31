package com.example.evaluacion02diegorojas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Esta clase representa el Menú Sura
 * @author Diego Rojas
 * @version 1.0.0
 */
public class MenuAct extends AppCompatActivity {

    private VideoView video;
    private BienvenidaAct bienvenidaAct;
    private String valorPass;

    /**
     * Método onCreate
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bienvenidaAct = new BienvenidaAct();

        valorPass = getIntent().getStringExtra("pass");

        video = (VideoView)findViewById(R.id.vVideo);
        //setear URL al VideoView
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));

        //agregar botones de reproducción del video
        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);
    }

    /**
     * Método que muestra la animación
     * @param view
     */
    public void mostrarAnimacion(View view){
        //aparece el fragment
        getSupportFragmentManager().beginTransaction().add(R.id.flContenedor, bienvenidaAct).commit();  //añade el fragmento
    }

    /**
     * Método que muestra la vista de seguridad
     * @param view
     */
    public void mostrarVistaSeguridad(View view){
        Intent intent = new Intent(this, SeguridadAct.class);
        intent.putExtra("pass", valorPass);
        startActivity(intent);
    }

    /**
     * Método que muestra la vista de descargar archivo
     * @param view
     */
    public void mostrarVistaDescargas(View view){
        Intent intent = new Intent(this, DescargaAct.class);
        startActivity(intent);
    }
}
