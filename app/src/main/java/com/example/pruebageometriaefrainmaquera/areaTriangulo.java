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

public class areaTriangulo extends AppCompatActivity {

EditText base;
EditText altura;

Button boton;

TextView resultado;

AlertDialog.Builder alerta;
double area;
DecimalFormat formato = new DecimalFormat("#.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_triangulo);

        base = (EditText)findViewById(R.id.edBaseTriangulo);
        altura = (EditText) findViewById(R.id.edAlturaTriangulo);

        boton = (Button) findViewById(R.id.botonTriangulo);

        resultado = (TextView) findViewById(R.id.ttRespuestaTriangulo);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (altura.getText().toString().length() ==0){
                    alerta = new AlertDialog.Builder(areaTriangulo.this);
                    alerta.setTitle("Error");
                    alerta.setMessage("Ingrese la altura del triangulo");
                    alerta.setCancelable(false);
                    alerta.setPositiveButton("cerrar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogo, int i) {
                            dialogo.cancel();
                            altura.requestFocus();
                                                    }
                    });
                    alerta.show();
                } else{
                if (base.getText().toString().length()==0){
                alerta.setTitle("error");
                alerta.setMessage("Ingrese la base del triangulo");
                alerta.setCancelable(false);
                alerta.setPositiveButton("cerrar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogo, int i) {
            dialogo.cancel();
            base.requestFocus();

            }
        });
                alerta.show();
                    } else {
                    area = Double.parseDouble(altura.getText().toString()) * Double.parseDouble(base.getText().toString())/2;
                    resultado.setText("El area es: "+ formato.format(area)+" cm2");
                }
                }
            }
        });
    }
}