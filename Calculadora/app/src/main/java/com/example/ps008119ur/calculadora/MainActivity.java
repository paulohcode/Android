package com.example.ps008119ur.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    TextView tvA;
    Button btnSoma;
    Button btnSub;
    Button btnDiv;
    Button btnMult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.valor1);
        ed2 = findViewById(R.id.valor2);
        tvA = findViewById(R.id.textViewAviso);
        btnSoma = findViewById(R.id.btnSoma);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMult = findViewById(R.id.btnMult);

        //inicio da ação de soma
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed1.getText().toString().isEmpty() || ed2.getText().toString().isEmpty()){

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
        }); //fim da ação de soma

        //inicio da ação de subtrair
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed1.getText().toString().isEmpty() || ed2.getText().toString().isEmpty()){

                    tvA.setText("Digite um valor");
                    return;
                }

                Double v1;
                Double v2;
                Double res;

                v1 = Double.parseDouble( ed1.getText().toString());
                v2 = Double.parseDouble( ed2.getText().toString());

                res = v1 - v2;


                Intent ResultadoActivity = new Intent(MainActivity.this, ResultadoActivity.class);

                Bundle parametros = new Bundle();

                parametros.putString("resultado", res.toString() );

                ResultadoActivity.putExtras(parametros);

                startActivity(ResultadoActivity);


            }
        });//fim da ação de subtrair

        //inicio da ação de Divisão
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed1.getText().toString().isEmpty() || ed2.getText().toString().isEmpty()) {

                    tvA.setText("Digite um valor");
                    return;
                }


                Double v1;
                Double v2;
                Double res;

                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());

                if (v1 == 0 || v2 == 0) {
                    tvA.setText("Não e possivel divisão por zero");
                    return;
                } else {


                    res = v1 * v2;


                    Intent ResultadoActivity = new Intent(MainActivity.this, ResultadoActivity.class);

                    Bundle parametros = new Bundle();

                    parametros.putString("resultado", res.toString());

                    ResultadoActivity.putExtras(parametros);

                    startActivity(ResultadoActivity);


                }
            }

        });//fim da ação de Divisão

        //inicio da ação de Multiplicação
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed1.getText().toString().isEmpty() || ed2.getText().toString().isEmpty()){

                    tvA.setText("Digite um valor");
                    return;
                }

                Double v1;
                Double v2;
                Double res;

                v1 = Double.parseDouble( ed1.getText().toString());
                v2 = Double.parseDouble( ed2.getText().toString());

                res = v1 * v2;


                Intent ResultadoActivity = new Intent(MainActivity.this, ResultadoActivity.class);

                Bundle parametros = new Bundle();

                parametros.putString("resultado", res.toString() );

                ResultadoActivity.putExtras(parametros);

                startActivity(ResultadoActivity);


            }
        });//fim da ação de multiplicação



    }
}
