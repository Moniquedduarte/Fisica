package com.example.monique.fisica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * Define a atividade Calorimetria.
 *
 * @author Monique Duarte <moniqueduartes123@gmail.com>
 */
public class CalorimetriaActivity extends AppCompatActivity {

    /**
     * Instância a atividade.
     *
     * @param savedInstanceState se a atividade está sendo reinicializada, recebe o estado anterior
     *                           nessa variável
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorimetria);
    }
}
