package com.example.juan.resistancecalculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner,spinner1,spinner2;
    double primera, segunda,tercera,resultado;
    RadioGroup radiogroup;
    Button b1;
    TextView t1;
    RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        radiogroup=(RadioGroup)findViewById(R.id.rg1);
        b1=(Button)findViewById(R.id.calcular);
        t1=(TextView)findViewById(R.id.resultado);
        r1=(RadioButton)findViewById(R.id.plata);
        r2=(RadioButton)findViewById(R.id.oro);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.PrimeraBanda,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        primera = 0;
                        break;
                    case 1:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        primera = 10;
                        break;
                    case 2:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        primera = 20;
                        break;
                    case 3:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        primera = 30;
                        break;
                    case 4:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        primera = 40;
                        break;
                    case 5:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        primera = 50;
                        break;
                    case 6:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        primera = 60;
                        break;
                    case 7:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        primera = 70;
                        break;
                    case 8:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        primera = 80;
                        break;
                    case 9:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        primera = 90;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        segunda = 0;
                        break;
                    case 1:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        segunda = 1;
                        break;
                    case 2:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        segunda = 2;
                        break;
                    case 3:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        segunda = 3;
                        break;
                    case 4:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        segunda = 4;
                        break;
                    case 5:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        segunda = 5;
                        break;
                    case 6:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        segunda = 6;
                        break;
                    case 7:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        segunda = 7;
                        break;
                    case 8:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        segunda = 8;
                        break;
                    case 9:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        segunda = 9;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        tercera = 1;
                        break;
                    case 1:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        tercera = 10;
                        break;
                    case 2:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        tercera = 100;
                        break;
                    case 3:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        tercera = 1000;
                        break;
                    case 4:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        tercera = 10000;
                        break;
                    case 5:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        tercera = 100000;
                        break;
                    case 6:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        tercera = 1000000;
                        break;
                    case 7:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        tercera = 1000000;
                        break;
                    case 8:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        tercera = 100000000;
                        break;
                    case 9:
                        //Toast.makeText(MainActivity.this, "Mk funciona..11", Toast.LENGTH_SHORT).show();
                        tercera = 1000000000;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.oro:
                        Toast.makeText(MainActivity.this, "Su tolerancia es de 5%", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.plata:
                        Toast.makeText(MainActivity.this, "Su tolerancia es del 10%", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado=(primera+segunda)*tercera;
                t1.setText(Double.toString(resultado));
            }
        });




    }


}
