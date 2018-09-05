package com.example.ps008119ur.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Resultado = findViewById(R.id.Resultado);

        Intent telaReferencia = getIntent();

        if (telaReferencia != null){
            Bundle parametros = telaReferencia.getExtras();
            if (parametros != null){
                String resultado = parametros.getString("resultado");
                Resultado.setText(resultado);
            }
        }
    }
}
