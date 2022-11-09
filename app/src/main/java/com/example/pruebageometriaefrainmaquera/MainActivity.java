package com.example.pruebageometriaefrainmaquera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void transCirculo(View view){
        Intent siguiente1 = new Intent(this, areaCirculo.class);
        startActivity(siguiente1);
    }

    public void transRectangulo(View view){
        Intent siguiente2 = new Intent(this, areaRectangulo.class);
        startActivity(siguiente2);
    }

    public void transTriangulo(View view){
        Intent siguiente3 = new Intent(this, areaTriangulo.class);
        startActivity(siguiente3);
    }

}