package com.example.alejoaj.practica1_p1;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.view.View.*;
import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    private int flag = 1;
    private TextView tRadio,tLadi1,tLado2,tAltura,tBase,Resultado;
    private EditText eRadio,eLado1,eLado2,eAltura,eBase,eAltocubo,eBasecubo,eAncho;
    private LinearLayout lRadio,lLado1,lLado2,lAltura,lBase,lAltocubo,lBasecubo,lAncho;
    private RadioButton rCirculo,rCuadrado,rTriangulo,rCubo;
    private ImageView img;
    private float num1=0,num2=0,num3=0,perimetro=0,area=0,volumen=0;
    private String var= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lRadio = (LinearLayout) findViewById(R.id.lRadio);
        lLado1 = (LinearLayout) findViewById(R.id.lLado1);
        lLado2 = (LinearLayout) findViewById(R.id.lLado2);
        lAltura = (LinearLayout) findViewById(R.id.lAltura);
        lBase = (LinearLayout) findViewById(R.id.lBase);
        lAltocubo = (LinearLayout) findViewById(R.id.lAltocubo);
        lBasecubo = (LinearLayout) findViewById(R.id.lBasecubo);
        lAncho = (LinearLayout) findViewById(R.id.lAncho);

        rCirculo = (RadioButton) findViewById(R.id.rCirculo);
        rCuadrado = (RadioButton) findViewById(R.id.rCuadrado);
        rTriangulo = (RadioButton) findViewById(R.id.rTriangulo);
        rCubo = (RadioButton) findViewById(R.id.rCubo);

        img = (ImageView) findViewById(R.id.img);

        Resultado = (TextView) findViewById(R.id.Resultado);

        eRadio = (EditText) findViewById(R.id.eRadio);
        eLado1 = (EditText) findViewById(R.id.eLado1);
        eLado2 = (EditText) findViewById(R.id.eLado2);
        eAltura = (EditText) findViewById(R.id.eAltura);
        eBase = (EditText) findViewById(R.id.eBase);
        eAltocubo = (EditText) findViewById(R.id.eAltocubo);
        eBasecubo = (EditText) findViewById(R.id.eBasecubo);
        eAncho = (EditText) findViewById(R.id.eAncho);


    }

    public void visibilidad(int visible){
        if (visible ==1) {
            lRadio.setVisibility(VISIBLE);
            lLado1.setVisibility(GONE);
            lLado2.setVisibility(GONE);
            lAltura.setVisibility(GONE);
            lBase.setVisibility(GONE);
            lAltocubo.setVisibility(GONE);
            lBasecubo.setVisibility(GONE);
            lAncho.setVisibility(GONE);
            rCirculo.setChecked(true);
            rCuadrado.setChecked(false);
            rTriangulo.setChecked(false);
            rCubo.setChecked(false);
        }
        else if (visible ==2){
            lRadio.setVisibility(GONE);
            lLado1.setVisibility(VISIBLE);
            lLado2.setVisibility(VISIBLE);
            lAltura.setVisibility(GONE);
            lBase.setVisibility(GONE);
            lAltocubo.setVisibility(GONE);
            lBasecubo.setVisibility(GONE);
            lAncho.setVisibility(GONE);
            rCirculo.setChecked(false);
            rCuadrado.setChecked(true);
            rTriangulo.setChecked(false);
            rCubo.setChecked(false);
        }
        else if (visible ==3){
            lRadio.setVisibility(GONE);
            lLado1.setVisibility(GONE);
            lLado2.setVisibility(GONE);
            lAltura.setVisibility(VISIBLE);
            lBase.setVisibility(VISIBLE);
            lAltocubo.setVisibility(GONE);
            lBasecubo.setVisibility(GONE);
            lAncho.setVisibility(GONE);
            rCirculo.setChecked(false);
            rCuadrado.setChecked(false);
            rTriangulo.setChecked(true);
            rCubo.setChecked(false);
        }
        else if (visible ==4){
            lRadio.setVisibility(GONE);
            lLado1.setVisibility(GONE);
            lLado2.setVisibility(GONE);
            lAltura.setVisibility(GONE);
            lBase.setVisibility(GONE);
            lAltocubo.setVisibility(VISIBLE);
            lBasecubo.setVisibility(VISIBLE);
            lAncho.setVisibility(VISIBLE);
            rCirculo.setChecked(false);
            rCuadrado.setChecked(false);
            rTriangulo.setChecked(false);
            rCubo.setChecked(true);
        }
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();
        if(id == R.id.rCirculo){
            visibilidad(1);
            img.setImageResource(R.drawable.circulo);
            flag = 1;
            Resultado.setText("");
        }
        else if (id == R.id.rCuadrado){
            visibilidad(2);
            img.setImageResource(R.drawable.cuadrado);
            flag = 2;
            Resultado.setText("");
        }
        else if (id == R.id.rTriangulo){
            visibilidad(3);
            img.setImageResource(R.drawable.triangulo);
            flag = 3;
            Resultado.setText("");
        }
        else if (id == R.id.rCubo){
            visibilidad(4);
            img.setImageResource(R.drawable.triangulo);
            flag = 4;
            Resultado.setText("");
        }
    }

    public void CbCaclular(View view) {

        if (flag ==1 ){
            if(eRadio.equals("") || eRadio.equals("Inserte valor en centimetros")){
                Resultado.setText("Algun campo esta Vacio");
            }else {
                var = eRadio.getText().toString();
                num1 = Float.parseFloat(var);
                perimetro = (float) (2 * (Math.PI) * num1);
                area = (float) ((Math.PI) * (Math.pow(num1, 2)));
                Resultado.setText("El area es: " + area);
            }
        }
        else if (flag == 2){
            if (eLado1.equals("") || eLado2.equals("")){
                Resultado.setText("Algun campo esta Vacio");
            }else {
                var = eLado1.getText().toString();
                num1 = Float.parseFloat(var);
                var = eLado2.getText().toString();
                num2 = Float.parseFloat(var);
                perimetro = 2 * num1 + 2 * num2;
                area = num1 * num2;
                Resultado.setText("El area es: " + area);
            }
        }
        else if (flag == 3){
            if (eAltura.equals("") || eBase.equals("")){
                Resultado.setText("Algun campo esta Vacio");
            }else {
                var = eAltura.getText().toString();
                num1 = Float.parseFloat(var);
                var = eBase.getText().toString();
                num2 = Float.parseFloat(var);
                area = (num1 * num2) / 2;
                Resultado.setText("El area del triangulo es: " + area);
            }
        }
        else if (flag == 4){
            if (eAltocubo.equals("") || eBasecubo.equals("") || eAncho.equals("")){
                Resultado.setText("Algun campo esta Vacio");
            }else {
                var = eAltocubo.getText().toString();
                num1 = Float.parseFloat(var);
                var = eBasecubo.getText().toString();
                num2 = Float.parseFloat(var);
                var = eAncho.getText().toString();
                num3 = Float.parseFloat(var);
                volumen = num1 * num2 * num3;
                Resultado.setText("El volumen del cubo es: " + volumen);
            }
        }
    }




}