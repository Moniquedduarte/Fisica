package com.example.monique.fisica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Define a atividade principal da aplicação. Esta atividade exibe
 * a tela que contém a navegação principal.
 *
 * @author Monique Duarte <moniqueduartes123@gmail.com>
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Cria uma instância da atividade.
     * @param savedInstanceState se a atividade está sendo reinicializada, recebe o estado anterior
     *                           nessa variável
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Exibe a atividade Termometria.
     *
     * @param view a visão que provocou a execução desse metódo.
     */
    public void openTermometria(View view) {
        Intent termometria = new Intent(this, TermometriaActivity.class);
        startActivity(termometria);
    }

    /**
     * Exibe a atividade Calorimetria.
     *
     * @param view a visão que provocou a execução desse metódo.
     */
    public void openCalorimetria(View view) {
        Intent calorimetria = new Intent(this, CalorimetriaActivity.class);
        startActivity(calorimetria);
    }

    /**
     * Exibe a atividade de Termodinamica.
     *
     * @param view a visão que provocou a execução desse metódo.
     */
    public void openTermodinamica(View view) {
        Intent termodinamica = new Intent(this, TermodinamicaActivity.class);
        startActivity(termodinamica);
    }

    /**
     * Exibe a atividade de Optica.
     *
     * @param view a visão que provocou a execução desse metódo.
     */
    public void openOptica(View view) {
        Intent optica = new Intent(this, OpticaActivity.class);
        startActivity(optica);
    }

    /**
     * Exibe a atividade de Ondulatoria.
     *
     * @param view a visão que provocou a execução desse metódo.
     */
    public void openOndulatoria(View view) {
        Intent ondulatoria = new Intent(this, OndulatoriaActivity.class);
        startActivity(ondulatoria);
    }

}
