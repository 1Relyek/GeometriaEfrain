package com.example.pruebageometriaefrainmaquera;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class areaCirculo extends AppCompatActivity {

    EditText radio;

    Button boton;
    TextView resultado;
    AlertDialog.Builder alerta;
    double area;
    DecimalFormat formato = new DecimalFormat("#.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_circulo);

        radio = (EditText) findViewById(R.id.edRadio);
        boton = (Button) findViewById(R.id.botonCirculo);
        resultado = (TextView) findViewById(R.id.ttRespuestaCirculo);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radio.getText().toString().length() ==0){

                    alerta = new AlertDialog.Builder(areaCirculo.this);
                    alerta.setTitle("error");
                    alerta.setMessage("Ingrese el radio del circulo");
                    alerta.setCancelable(false);
                    alerta.setPositiveButton("cerrar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogo, int i) {
                            dialogo.cancel();
                            radio.requestFocus();
                        }

                    });
            } else {
                area = Math.pow(Double.parseDouble(radio.getText().toString()),2.0)* Math.PI;
                resultado.setText("El area es "+ formato.format(area)+" cm2");

            }
            }
        });
    }
}