package com.example.pathfinderprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;

public class StatsPage extends AppCompatActivity {

    TextView forText, dexText, conText, intText, sabText, carText;
    static TextView puntsText;
    EditText editFue, editDes, editCon, editInt, editSab, editCar;
    Button atrButton;
    static int punts = 25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_page);
        forText = (TextView)findViewById(R.id.forText);
        dexText = (TextView)findViewById(R.id.dexText);
        conText = (TextView)findViewById(R.id.conText);
        intText = (TextView)findViewById(R.id.intText);
        sabText = (TextView)findViewById(R.id.wisText);
        carText = (TextView)findViewById(R.id.carText);
        puntsText = (TextView)findViewById(R.id.puntsText);

        Spinner fueSpin = (Spinner)findViewById(R.id.fueSpin);
        ArrayAdapter<CharSequence> fueAdapter = ArrayAdapter.createFromResource(this, R.array.punts, android.R.layout.simple_spinner_item);
        fueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fueSpin.setAdapter(fueAdapter);
        Spinner desSpin = (Spinner)findViewById(R.id.desSpin);
        ArrayAdapter<CharSequence> desAdapter = ArrayAdapter.createFromResource(this, R.array.punts, android.R.layout.simple_spinner_item);
        desAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        desSpin.setAdapter(desAdapter);
        Spinner conSpin = (Spinner)findViewById(R.id.conSpin);
        ArrayAdapter<CharSequence> conAdapter = ArrayAdapter.createFromResource(this, R.array.punts, android.R.layout.simple_spinner_item);
        conAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        conSpin.setAdapter(conAdapter);
        Spinner intSpin = (Spinner)findViewById(R.id.intSpin);
        ArrayAdapter<CharSequence> intAdapter = ArrayAdapter.createFromResource(this, R.array.punts, android.R.layout.simple_spinner_item);
        intAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        intSpin.setAdapter(intAdapter);
        Spinner sabSpin = (Spinner)findViewById(R.id.sabSpin);
        ArrayAdapter<CharSequence> sabAdapter = ArrayAdapter.createFromResource(this, R.array.punts, android.R.layout.simple_spinner_item);
        sabAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sabSpin.setAdapter(sabAdapter);
        Spinner carSpin = (Spinner)findViewById(R.id.carSpin);
        ArrayAdapter<CharSequence> carAdapter = ArrayAdapter.createFromResource(this, R.array.punts, android.R.layout.simple_spinner_item);
        carAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        carSpin.setAdapter(carAdapter);

        fueSpin.setSelection(3);
        desSpin.setSelection(3);
        conSpin.setSelection(3);
        intSpin.setSelection(3);
        sabSpin.setSelection(3);
        carSpin.setSelection(3);

        puntsText.setText("Puntos: " + punts);

        fueSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            int lastPunts = 0;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int modificador = 0;

                punts += lastPunts;

                switch (position){
                    case 0:
                        lastPunts = -4;
                        modificador = -2;
                        punts += 4;
                        break;
                    case 1:
                        lastPunts = -2;
                        modificador = -1;
                        punts +=2;
                        break;
                    case 2:
                        lastPunts = -1;
                        modificador = -1;
                        punts += 1;
                        break;
                    case 3:
                        lastPunts = 0;
                        modificador = 0;
                        lastPunts -= 0;
                        break;
                    case 4:
                        lastPunts = 1;
                        modificador = 0;
                        punts -= 1;
                        break;
                    case 5:
                        lastPunts = 2;
                        modificador = 1;
                        punts -= 2;
                        break;
                    case 6:
                        lastPunts = 3;
                        modificador = 1;
                        punts -= 3;
                        break;
                    case 7:
                        lastPunts = 5;
                        modificador = 2;
                        punts -= 5;
                        break;
                    case 8:
                        lastPunts = 7;
                        modificador = 2;
                        punts -= 7;
                        break;
                    case 9:
                        lastPunts = 10;
                        modificador = 3;
                        punts -= 10;
                        break;
                    case 10:
                        lastPunts = 13;
                        modificador = 3;
                        punts -=13;
                        break;
                    case 11:
                        lastPunts = 17;
                        modificador = 4;
                        punts -=17;
                        break;
                }
                puntsText.setText("Puntos: " + punts);
                forText.setText(modificador + "");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        desSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            int lastPunts = 0;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int modificador = 0;

                punts += lastPunts;

                switch (position){
                    case 0:
                        lastPunts = -4;
                        modificador = -2;
                        punts += 4;
                        break;
                    case 1:
                        lastPunts = -2;
                        modificador = -1;
                        punts +=2;
                        break;
                    case 2:
                        lastPunts = -1;
                        modificador = -1;
                        punts += 1;
                        break;
                    case 3:
                        lastPunts = 0;
                        modificador = 0;
                        lastPunts -= 0;
                        break;
                    case 4:
                        lastPunts = 1;
                        modificador = 0;
                        punts -= 1;
                        break;
                    case 5:
                        lastPunts = 2;
                        modificador = 1;
                        punts -= 2;
                        break;
                    case 6:
                        lastPunts = 3;
                        modificador = 1;
                        punts -= 3;
                        break;
                    case 7:
                        lastPunts = 5;
                        modificador = 2;
                        punts -= 5;
                        break;
                    case 8:
                        lastPunts = 7;
                        modificador = 2;
                        punts -= 7;
                        break;
                    case 9:
                        lastPunts = 10;
                        modificador = 3;
                        punts -= 10;
                        break;
                    case 10:
                        lastPunts = 13;
                        modificador = 3;
                        punts -=13;
                        break;
                    case 11:
                        lastPunts = 17;
                        modificador = 4;
                        punts -=17;
                        break;
                }
                puntsText.setText("Puntos: " + punts);
                dexText.setText(modificador + "");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        conSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            int lastPunts = 0;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int modificador = 0;

                punts += lastPunts;

                switch (position){
                    case 0:
                        lastPunts = -4;
                        modificador = -2;
                        punts += 4;
                        break;
                    case 1:
                        lastPunts = -2;
                        modificador = -1;
                        punts +=2;
                        break;
                    case 2:
                        lastPunts = -1;
                        modificador = -1;
                        punts += 1;
                        break;
                    case 3:
                        lastPunts = 0;
                        modificador = 0;
                        lastPunts -= 0;
                        break;
                    case 4:
                        lastPunts = 1;
                        modificador = 0;
                        punts -= 1;
                        break;
                    case 5:
                        lastPunts = 2;
                        modificador = 1;
                        punts -= 2;
                        break;
                    case 6:
                        lastPunts = 3;
                        modificador = 1;
                        punts -= 3;
                        break;
                    case 7:
                        lastPunts = 5;
                        modificador = 2;
                        punts -= 5;
                        break;
                    case 8:
                        lastPunts = 7;
                        modificador = 2;
                        punts -= 7;
                        break;
                    case 9:
                        lastPunts = 10;
                        modificador = 3;
                        punts -= 10;
                        break;
                    case 10:
                        lastPunts = 13;
                        modificador = 3;
                        punts -=13;
                        break;
                    case 11:
                        lastPunts = 17;
                        modificador = 4;
                        punts -=17;
                        break;
                }
                puntsText.setText("Puntos: " + punts);
                conText.setText(modificador + "");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        intSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            int lastPunts = 0;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int modificador = 0;

                punts += lastPunts;

                switch (position){
                    case 0:
                        lastPunts = -4;
                        modificador = -2;
                        punts += 4;
                        break;
                    case 1:
                        lastPunts = -2;
                        modificador = -1;
                        punts +=2;
                        break;
                    case 2:
                        lastPunts = -1;
                        modificador = -1;
                        punts += 1;
                        break;
                    case 3:
                        lastPunts = 0;
                        modificador = 0;
                        lastPunts -= 0;
                        break;
                    case 4:
                        lastPunts = 1;
                        modificador = 0;
                        punts -= 1;
                        break;
                    case 5:
                        lastPunts = 2;
                        modificador = 1;
                        punts -= 2;
                        break;
                    case 6:
                        lastPunts = 3;
                        modificador = 1;
                        punts -= 3;
                        break;
                    case 7:
                        lastPunts = 5;
                        modificador = 2;
                        punts -= 5;
                        break;
                    case 8:
                        lastPunts = 7;
                        modificador = 2;
                        punts -= 7;
                        break;
                    case 9:
                        lastPunts = 10;
                        modificador = 3;
                        punts -= 10;
                        break;
                    case 10:
                        lastPunts = 13;
                        modificador = 3;
                        punts -=13;
                        break;
                    case 11:
                        lastPunts = 17;
                        modificador = 4;
                        punts -=17;
                        break;
                }
                puntsText.setText("Puntos: " + punts);
                intText.setText(modificador + "");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sabSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            int lastPunts = 0;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int modificador = 0;

                punts += lastPunts;

                switch (position){
                    case 0:
                        lastPunts = -4;
                        modificador = -2;
                        punts += 4;
                        break;
                    case 1:
                        lastPunts = -2;
                        modificador = -1;
                        punts +=2;
                        break;
                    case 2:
                        lastPunts = -1;
                        modificador = -1;
                        punts += 1;
                        break;
                    case 3:
                        lastPunts = 0;
                        modificador = 0;
                        lastPunts -= 0;
                        break;
                    case 4:
                        lastPunts = 1;
                        modificador = 0;
                        punts -= 1;
                        break;
                    case 5:
                        lastPunts = 2;
                        modificador = 1;
                        punts -= 2;
                        break;
                    case 6:
                        lastPunts = 3;
                        modificador = 1;
                        punts -= 3;
                        break;
                    case 7:
                        lastPunts = 5;
                        modificador = 2;
                        punts -= 5;
                        break;
                    case 8:
                        lastPunts = 7;
                        modificador = 2;
                        punts -= 7;
                        break;
                    case 9:
                        lastPunts = 10;
                        modificador = 3;
                        punts -= 10;
                        break;
                    case 10:
                        lastPunts = 13;
                        modificador = 3;
                        punts -=13;
                        break;
                    case 11:
                        lastPunts = 17;
                        modificador = 4;
                        punts -=17;
                        break;
                }
                puntsText.setText("Punts: " + punts);
                sabText.setText(modificador + "");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        carSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            int lastPunts = 0;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int modificador = 0;

                punts += lastPunts;

                switch (position){
                    case 0:
                        lastPunts = -4;
                        modificador = -2;
                        punts += 4;
                        break;
                    case 1:
                        lastPunts = -2;
                        modificador = -1;
                        punts +=2;
                        break;
                    case 2:
                        lastPunts = -1;
                        modificador = -1;
                        punts += 1;
                        break;
                    case 3:
                        lastPunts = 0;
                        modificador = 0;
                        lastPunts -= 0;
                        break;
                    case 4:
                        lastPunts = 1;
                        modificador = 0;
                        punts -= 1;
                        break;
                    case 5:
                        lastPunts = 2;
                        modificador = 1;
                        punts -= 2;
                        break;
                    case 6:
                        lastPunts = 3;
                        modificador = 1;
                        punts -= 3;
                        break;
                    case 7:
                        lastPunts = 5;
                        modificador = 2;
                        punts -= 5;
                        break;
                    case 8:
                        lastPunts = 7;
                        modificador = 2;
                        punts -= 7;
                        break;
                    case 9:
                        lastPunts = 10;
                        modificador = 3;
                        punts -= 10;
                        break;
                    case 10:
                        lastPunts = 13;
                        modificador = 3;
                        punts -=13;
                        break;
                    case 11:
                        lastPunts = 17;
                        modificador = 4;
                        punts -=17;
                        break;
                }
                puntsText.setText("Puntos: " + punts);
                carText.setText(modificador + "");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    }
