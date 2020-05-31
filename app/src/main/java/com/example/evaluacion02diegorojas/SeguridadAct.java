
package com.example.evaluacion02diegorojas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * Esta clase representa la vista de incidencias de seguridad
 * @author Diego Rojas
 * @version 1.0.0
 */
public class SeguridadAct extends AppCompatActivity {

    private TextView textMensaje;
    private String valorPass;

    /**
     * Método onCreate
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguridad);

        valorPass = getIntent().getStringExtra("pass");

        textMensaje = (TextView)findViewById(R.id.tvMensaje);
    }

    /**
     * Este método muestra un mensaje de alerta ante la primera incidencia
     * @param view
     */
    public void ejecutarIncidenciaUno(View view){
        textMensaje.setText("Alerta: Se ingreso a un sitio web externo");
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    /**
     * Este método muestra un mensaje de alerta ante la segunda incidencia
     * @param view
     */
    public void ejecutarIncidenciaDos(View view){
        if(valorPass.equals("123")){
            textMensaje.setText("Alerta: Su contraseña es insegura");
        }
    }
}
