package com.example.ps008119ur.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    TextView tvA;
    Button btSoma;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.valor1);
        ed2 = findViewById(R.id.valor2);
        tvA = findViewById(R.id.textViewAviso);
        btSoma = findViewById(R.id.Soma);

        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed1.getText().toString().isEmpty() && ed2.getText().toString().isEmpty()){

                    tvA.setText("Digite um valor");
                    return;
                }

                Double v1;
                Double v2;
                Double res;

                v1 = Double.parseDouble( ed1.getText().toString());
                v2 = Double.parseDouble( ed2.getText().toString());

                res = v1 +v2;


                Intent ResultadoActivity = new Intent(MainActivity.this, ResultadoActivity.class);

                Bundle parametros = new Bundle();

                parametros.putString("resultado", res.toString() );

                ResultadoActivity.putExtras(parametros);

                startActivity(ResultadoActivity);


            }
        });
    }
}
