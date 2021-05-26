package com.example.complejas;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Hiperbolicas operacion1;
    public ASqrtComplejas operacion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtView = (TextView) findViewById(R.id.banner);
        txtView.setText("Tras ingresar los números, dar click en ejecutar.");
        Button ejecutar = (Button) findViewById(R.id.executeProgram);
        ejecutar.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View v) {
        TextView complejo = (TextView) findViewById(R.id.complejo);
        TextView cosHi = (TextView) findViewById(R.id.cosHi);
        TextView senHi = (TextView) findViewById(R.id.senHi);
        TextView textoSqrt = (TextView) findViewById(R.id.textoSqrt);
        TextView magnitud = (TextView) findViewById(R.id.magnitud);
        TextView moduloSuma = (TextView) findViewById(R.id.moduloSuma);
        TextView fraccion = (TextView) findViewById(R.id.fraccion);
        TextView resultad = (TextView) findViewById(R.id.resultado);
        TextInputLayout textInputLayout = findViewById(R.id.inputComplejoA);
        String text = textInputLayout.getEditText().getText().toString();
        TextInputLayout textInputLayout2 = findViewById(R.id.textInputLayout);
        String text2 = textInputLayout2.getEditText().getText().toString();
        double textToDouble = 0;
        double textToDouble2 = 0;
        boolean isText = false;


        if (text != null && text2 != null) {

            try {
                textToDouble = Double.parseDouble(text);
                textToDouble2 = Double.parseDouble(text2);
            }
            catch (NumberFormatException nfe) {
                textToDouble = 0;
                textToDouble2 = 0;
                isText = true;
            }

        } else {
            textToDouble = 0;
            textToDouble2 = 0;
        }

        operacion1 = new Hiperbolicas(textToDouble, textToDouble2);
        operacion2 = new ASqrtComplejas(textToDouble, textToDouble2);
        String getCosHi = operacion1.getMyLocalComplexCoshi();
        String getSenHi = operacion1.getMyLocalComplexSenhi();
        String getComplejo = operacion1.getComplejoT();
        String getMagnitud = Double.toString(operacion2.getMagnitud());
        String getModuloSuma = Double.toString(operacion2.getModulo_suma());
        String getFraccion = operacion2.getFraccionString();
        String getResultado = operacion2.getResultadoString();


        if (isText == true) {
            complejo.setText("Número complejo: " + "error");
            cosHi.setText("Coseno Hiperbólico:\n" + "error");
            senHi.setText("Seno Hiperbólico:\n" + "error");
            textoSqrt.setText("Raíz Compleja");
            magnitud.setText("Magnitud del número complejo:\n" + "error");
            moduloSuma.setText("Módulo de suma de número complejo con su magnitud:\n" + "error");
            fraccion.setText("Fracción resultante resultante de la (nComplejo + magnitud) / modulo de suma:\n" + "error");
            resultad.setText("Al realizar (Fracción * Raíz cuadrada de magnitud), el resultado es:\n" + "error");
        } else {
            complejo.setText("Número complejo: " + getComplejo);
            cosHi.setText("Coseno Hiperbólico:\n" + getCosHi);
            senHi.setText("Seno Hiperbólico:\n" + getSenHi);
            textoSqrt.setText("Raíz Compleja");
            magnitud.setText("Magnitud del número complejo:\n" + getMagnitud);
            moduloSuma.setText("Módulo de suma de número complejo con su magnitud:\n" + getModuloSuma);
            fraccion.setText("Fracción resultante resultante de la (nComplejo + magnitud) / modulo de suma:\n" + getFraccion);
            resultad.setText("Al realizar (Fracción * Raíz cuadrada de magnitud), el resultado es:\n" + getResultado);
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}