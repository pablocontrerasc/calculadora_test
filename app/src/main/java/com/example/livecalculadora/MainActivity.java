package com.example.livecalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText cifra_01;
    private EditText cifra_02;

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cifra_01 = findViewById(R.id.cifra_01);
        cifra_02 = findViewById(R.id.cifra_02);

        resultado = findViewById(R.id.resultado);
    }

    public void sumar(View view) {
        int resultadoNumero = Integer.parseInt(cifra_01.getText().toString()) + Integer.parseInt(cifra_02.getText().toString());
        resultado.setText(resultadoNumero + "");
        Log.d("operacionSuma","Presionaste el boton suma ");
    }

    public void restar(View view) {
        int resultadoNumero = Integer.parseInt(cifra_01.getText().toString()) - Integer.parseInt(cifra_02.getText().toString());
        resultado.setText(resultadoNumero + "");
        Log.d("operacionResta","Presionaste el boton resta");
    }
    public void multiplicar(View view) {
        int resultadoNumero = Integer.parseInt(cifra_01.getText().toString()) * Integer.parseInt(cifra_02.getText().toString());
        resultado.setText(resultadoNumero + "");
        Log.d("operacionMult","Presionaste el boton multiplicacion");
    }
    public void dividir(View view) {
        int resultadoNumero = Integer.parseInt(cifra_01.getText().toString()) / Integer.parseInt(cifra_02.getText().toString());
        resultado.setText(resultadoNumero + "");
        Log.d("operacionDiv","Presionaste el boton division ");
    }

}
