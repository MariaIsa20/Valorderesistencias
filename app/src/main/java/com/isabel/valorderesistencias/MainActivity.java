package com.isabel.valorderesistencias;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner s1, s2, s3, s4;
    Button bCalcular;
    TextView tValor;
    String color, color2, color3, color4, mult;
    ImageView I1, I2, I3, I4;
    String n1, n2; // valores de las 2 primeras franjas
    String tol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            // Relaciono el layout para usarlo aqui
        s1 = findViewById(R.id.sSpinner1);
        s2 = findViewById(R.id.sSpinner2);
        s3 = findViewById(R.id.sSpinner3);
        s4 = findViewById(R.id.sSpinner4);

        bCalcular = findViewById(R.id.bcalcular);

        tValor = findViewById(R.id.tvalor);

        I1 = findViewById(R.id.I1);
        I2 = findViewById(R.id.I2);
        I3 = findViewById(R.id.I3);
        I4 = findViewById(R.id.I4);


            // Spinners
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colores,
                android.R.layout.simple_spinner_item);

        s1.setAdapter(adapter);
        s2.setAdapter(adapter);
        s3.setAdapter(adapter);

            // Spinner para primera franja
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color = adapterView.getItemAtPosition(i).toString();

                switch (color){

                    case "Negro":
                        I1.setImageResource(R.drawable.negro);
                        n1 = "0";
                        break;
                    case  "Café":
                        I1.setImageResource(R.drawable.cafe);
                        n1 = "1";
                        break;
                    case "Rojo":
                        I1.setImageResource(R.drawable.rojo);
                        n1 = "2";
                        break;
                    case "Naranjado":
                        I1.setImageResource(R.drawable.naranja);
                        n1 = "3";
                        break;
                    case "Amarillo":
                        I1.setImageResource(R.drawable.amarillo);
                        n1 = "4";
                        break;
                    case "Verde":
                        I1.setImageResource(R.drawable.verde);
                        n1 = "5";
                        break;
                    case "Azul":
                        I1.setImageResource(R.drawable.azul);
                        n1 = "6";
                        break;
                    case "Morado":
                        I1.setImageResource(R.drawable.morado);
                        n1 = "7";
                        break;
                    case "Gris":
                        I1.setImageResource(R.drawable.gris);
                        n1 = "8";
                        break;
                    case "Blanco":
                        I1.setImageResource(R.drawable.blanco);
                        n1 = "9";
                        break;
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
            // Spinner de la franja 2
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color2 = adapterView.getItemAtPosition(i).toString();
                switch (color2){

                    case "Negro":
                        I2.setImageResource(R.drawable.negro);
                        n2 = "0";
                        break;
                    case  "Café":
                        I2.setImageResource(R.drawable.cafe);
                        n2 = "1";
                        break;
                    case "Rojo":
                        I2.setImageResource(R.drawable.rojo);
                        n2 = "2";
                        break;
                    case "Naranjado":
                        I2.setImageResource(R.drawable.naranja);
                        n2 = "3";
                        break;
                    case "Amarillo":
                        I2.setImageResource(R.drawable.amarillo);
                        n2 = "4";
                        break;
                    case "Verde":
                        I2.setImageResource(R.drawable.verde);
                        n2 = "5";
                        break;
                    case "Azul":
                        I2.setImageResource(R.drawable.azul);
                        n2 = "6";
                        break;
                    case "Morado":
                        I2.setImageResource(R.drawable.morado);
                        n2 = "7";
                        break;
                    case "Gris":
                        I2.setImageResource(R.drawable.gris);
                        n2 = "8";
                        break;
                    case "Blanco":
                        I2.setImageResource(R.drawable.blanco);
                        n2 = "9";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
                // Spinner de la franja 3, multiplicador
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color3 = adapterView.getItemAtPosition(i).toString();
                switch (color3){

                    case "Negro":
                        I3.setImageResource(R.drawable.negro);
                        // 1
                        if (n1 == "0"){
                            mult = n2 + "Ω";
                        }
                        else{
                            mult = n1 + n2 + "Ω";
                        }
                        break;
                    case  "Café":
                        I3.setImageResource(R.drawable.cafe);
                        // 10
                        if (n1 == "0"){
                            mult = n2 + "0 Ω";
                        }
                        else{
                            mult = n1 + n2 + "0 Ω";
                        }
                        break;
                    case "Rojo":
                        I3.setImageResource(R.drawable.rojo);
                        // 100
                        if (n1 == "0"){
                            mult = n2 + "00 Ω";
                        }
                        else{
                            mult = n1 + "." + n2 + "KΩ";
                        }

                        break;
                    case "Naranjado":
                        I3.setImageResource(R.drawable.naranja);
                        // 1000
                        if (n1 == "0"){
                            mult = n2 + "KΩ";
                        }
                        else{
                            mult = n1 + n2 + "KΩ";
                        }

                        break;
                    case "Amarillo":
                        I3.setImageResource(R.drawable.amarillo);
                        // 10000
                        if (n1 == "0"){
                            mult = n2 + "0 KΩ";
                        }
                        else{
                            mult = n1 + n2 + "0 KΩ";
                        }


                        break;
                    case "Verde":
                        I3.setImageResource(R.drawable.verde);
                        //100000
                        if (n1 == "0"){
                            mult = n2 + "00 KΩ";
                        }
                        else{
                            mult = n1 + "." + n2 + "MΩ";
                        }
                        break;
                    case "Azul":
                        I3.setImageResource(R.drawable.azul);
                        //1000000
                        if (n1 == "0"){
                            mult = n2 + "MΩ";
                        }
                        else{
                            mult = n1 + n2 + "MΩ";
                        }

                        break;
                    case "Morado":
                        I3.setImageResource(R.drawable.morado);
                        // 10000000
                        if (n1 == "0"){
                            mult = n2 + "0 MΩ";
                        }
                        else{
                            mult = n1 + n2 + "0 MΩ";
                        }

                        break;
                    case "Gris":
                        I3.setImageResource(R.drawable.gris);
                        //100000000
                        if (n1 == "0"){
                            mult = n2 + "00 MΩ";
                        }
                        else{
                            mult = n1 + "." + n2 + "GΩ";
                        }
                        break;
                    case "Blanco":
                        I3.setImageResource(R.drawable.blanco);
                        //1000000000
                        if (n1 == "0"){
                            mult = n2 + "GΩ";
                        }
                        else{
                            mult = n1 + n2 + "GΩ";
                        }

                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
            // Spinner de la tolerancia
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.colores_tolerancia,
                android.R.layout.simple_spinner_item);

        s4.setAdapter(adapter2);

        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color4 = adapterView.getItemAtPosition(i).toString();
                switch (color4){

                    case "Rojo":
                        I4.setImageResource(R.drawable.rojotol);
                        tol = "±2%";
                        break;
                    case  "Marron":
                        I4.setImageResource(R.drawable.marrontol);
                        tol = "±1%";
                        break;
                    case "Dorado":
                        I4.setImageResource(R.drawable.doradotol);
                        tol = "±5%";
                        break;
                    case "Plateado":
                        I4.setImageResource(R.drawable.gristol);
                        tol = "±10%";
                        break;

                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
            // Boton para mostrar valor
    public void Calcular(View view) {
        int id = view.getId();

        if(id == R.id.bcalcular){

            if(color.equals("Select...") || color2.equals("Select...") || color3.equals("Select...") || color4.equals("Select...") ){
                tValor.setText("Elija un color");

            }
            else {

             tValor.setText("Valor:" + mult + " " + tol);
            }

        }

    }
}
