package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sortear(View view){
        EditText numero = findViewById(R.id.textNumeroDesejado);
        TextView textoResultado =  findViewById(R.id.textNumeroSorteado);

        int numeroSorteado = new Random().nextInt(Integer.parseInt(numero.getText().toString())+1);
        textoResultado.setText("Numero sorteado = " + numeroSorteado);
        textoResultado.setVisibility(View.VISIBLE);

    }
}
