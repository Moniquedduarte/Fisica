package com.example.monique.fisica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openTermometria(View view) {
        Intent termometria = new Intent(this, TermometriaActivity.class);
        startActivity(termometria);
    }

    public void openCalorimetria(View view) {
        Intent calorimetria = new Intent(this, CalorimetriaActivity.class);
        startActivity(calorimetria);
    }

    public void openTermodinamica(View view) {
        Intent termodinamica = new Intent(this, TermodinamicaActivity.class);
        startActivity(termodinamica);
    }

    public void openOptica(View view) {
        Intent optica = new Intent(this, OpticaActivity.class);
        startActivity(optica);
    }

    public void openOndulatoria(View view) {
        Intent ondulatoria = new Intent(this, OndulatoriaActivity.class);
        startActivity(ondulatoria);
    }

}
