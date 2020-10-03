package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contT=0, cont1=0, cont2=0, cont3=0, cont4=0;

    TextView contadorTotal, contador1, contador2, contador3, contador4;
    Button resetTotal, reset1, reset2, reset3, reset4, clic1, clic2, clic3, clic4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //id TextViews
        contadorTotal = findViewById(R.id.contadorTotal);
        contador1 = findViewById(R.id.contador1);
        contador2 = findViewById(R.id.contador2);
        contador3 = findViewById(R.id.contador3);
        contador4 = findViewById(R.id.contador4);

        //id Buttons
        resetTotal = findViewById(R.id.resetTotal);
        reset1 = findViewById(R.id.reset1);
        reset2 = findViewById(R.id.reset2);
        reset3 = findViewById(R.id.reset3);
        reset4 = findViewById(R.id.reset4);
        clic1 = findViewById(R.id.clic1);
        clic2 = findViewById(R.id.clic2);
        clic3 = findViewById(R.id.clic3);
        clic4 = findViewById(R.id.clic4);

        //RESET TOTAL
        resetTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contT=0;
                cont1=0;
                cont2=0;
                cont3=0;
                cont4=0;
                contadorTotal.setText(String.valueOf(contT));
                contador1.setText(String.valueOf(cont1));
                contador2.setText(String.valueOf(cont2));
                contador3.setText(String.valueOf(cont3));
                contador4.setText(String.valueOf(cont4));
            }
        });

        //BOTONES 1
        clic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont1++;
                contT++;
                contador1.setText(String.valueOf(cont1));
                contadorTotal.setText(String.valueOf(contT));
            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contT = contT - cont1;
                cont1=0;
                contador1.setText(String.valueOf(cont1));
                contadorTotal.setText(String.valueOf(contT));
            }
        });

        //BOTONES 2
        clic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont2++;
                contT++;
                contador2.setText(String.valueOf(cont2));
                contadorTotal.setText(String.valueOf(contT));
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contT = contT - cont2;
                cont2=0;
                contador2.setText(String.valueOf(cont2));
                contadorTotal.setText(String.valueOf(contT));
            }
        });

        //BOTONES 3
        clic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont3++;
                contT++;
                contador3.setText(String.valueOf(cont3));
                contadorTotal.setText(String.valueOf(contT));
            }
        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contT = contT - cont3;
                cont3=0;
                contador3.setText(String.valueOf(cont3));
                contadorTotal.setText(String.valueOf(contT));
            }
        });

        //BOTONES 4
        clic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont4++;
                contT++;
                contador4.setText(String.valueOf(cont4));
                contadorTotal.setText(String.valueOf(contT));
            }
        });

        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contT = contT - cont4;
                cont4=0;
                contador4.setText(String.valueOf(cont4));
                contadorTotal.setText(String.valueOf(contT));
            }
        });

    }
}