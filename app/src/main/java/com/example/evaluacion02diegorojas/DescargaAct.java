package com.example.evaluacion02diegorojas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Esta clase representa la vista de descargas
 * @author Diego Rojas
 * @version 1.0.0
 */
public class DescargaAct extends AppCompatActivity {

    private Button botonDescargar;
    private TextView txtEstado;

    /**
     * Método onCreate
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descarga);

        botonDescargar = (Button)findViewById(R.id.btnDescarga);
        txtEstado = (TextView)findViewById(R.id.tvEstado);

        //Disparamos el boton onClick

        botonDescargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Task().execute(txtEstado.getText().toString());  //ejecuta mi AsyncTask
            }
        });
    }

    //Clase Task
    class Task extends AsyncTask<String, Void, String> {

        //Configurar la tarea inicial
        @Override
        protected void onPreExecute() {
            txtEstado.setText("Ha iniciado la descarga");
        }

        //Ejecutar la tarea en segundo plano
        @Override
        protected String doInBackground(String... strings) {

            try{
                Thread.sleep(5000);
            }
            catch (Exception e){
                e.printStackTrace();
            }

            return null;
        }

        //Finaliza la tarea o se muestra el resultado
        @Override
        protected void onPostExecute(String s) {
            txtEstado.setText("Ha finalizado la descarga");
        }
    }


}
