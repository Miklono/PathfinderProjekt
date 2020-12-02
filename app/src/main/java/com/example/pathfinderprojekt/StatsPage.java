package com.example.pathfinderprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StatsPage extends AppCompatActivity {

    TextView forText, dexText, conText, intText, sabText, carText;
    static TextView puntsText;
    EditText editFue, editDes, editCon, editInt, editSab, editCar;
    Button atrButton;
    static int punts = 25;
    static int lastOp = 0;

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

        editFue = (EditText) findViewById(R.id.editFue);
        editDes = (EditText) findViewById(R.id.editDex);
        editCon = (EditText) findViewById(R.id.editCon);
        editInt = (EditText) findViewById(R.id.editInt);
        editSab = (EditText) findViewById(R.id.editSab);
        editCar = (EditText) findViewById(R.id.editCar);

        atrButton = (Button)findViewById(R.id.atrButton);

        editFue.setText("10");
        editDes.setText("10");
        editCon.setText("10");
        editInt.setText("10");
        editSab.setText("10");
        editCar.setText("10");

        puntsText.setText("Punts: " + punts);

        atrButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                punts += lastOp;
                lastOp = 0;
                puntsText.setText("Punts: " + punts);
            }
        });

        editFue.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() >0) {
                    forText.setText(calcularModificador(s.toString()));
                } else{
                    forText.setText("-5");
                }
            }
        });
        editDes.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() >0) {
                    dexText.setText(calcularModificador(s.toString()));
                } else{
                    dexText.setText("-5");
                }
            }
        });
        editCon.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() >0) {
                    conText.setText(calcularModificador(s.toString()));
                } else{
                    conText.setText("-5");
                }
            }
        });
        editInt.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() >0) {
                    intText.setText(calcularModificador(s.toString()));
                } else{
                    intText.setText("-5");
                }
            }
        });
        editSab.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() >0) {
                    sabText.setText(calcularModificador(s.toString()));
                } else{
                    sabText.setText("-5");
                }
            }
        });
        editCar.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() >0) {
                    carText.setText(calcularModificador(s.toString()));
                } else{
                    carText.setText("-5");
                }
            }
        });
    }

    static String calcularModificador(String puntosStr){
            int puntos = Integer.parseInt(puntosStr);
            if(puntos == 7){
                punts += 4;
                lastOp = -4;
            } else if(puntos == 8){
                punts += 2;
                lastOp = -2;
            } else if(puntos == 9){
                punts += 1;
                lastOp = -1;
            }else if(puntos == 10){
                punts += 0;
                lastOp = 0;
            }else if(puntos == 11){
                punts -= 1;
                lastOp = 1;
            }else if(puntos == 12){
                punts -= 2;
                lastOp = 2;
            }else if(puntos == 13){
                punts -= 3;
                lastOp = 3;
            }else if(puntos == 14){
                punts -= 5;
                lastOp = 5;
            }else if(puntos == 15){
                punts -= 7;
                lastOp = 7;
            }else if(puntos == 16){
                punts -= 10;
                lastOp = 10;
            }else if(puntos == 17){
                punts -= 13;
                lastOp = 13;
            }else if(puntos == 18){
                punts -= 17;
                lastOp = 17;
            } else if(puntos < 7){

            }else{
                return "-5";
            }
            puntsText.setText("Punts: " + punts);
            int modificador = (int) ((puntos - 10) / 2);
            if(modificador<0){
                modificador--;
            }
            return modificador + "";
    }

    }
