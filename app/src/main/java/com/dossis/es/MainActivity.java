package com.dossis.es;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ibBarcelonaClick(View view) {
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lat", 41.380896);
        i.putExtra("lon", 2.1228198);
        i.putExtra("nombre","Camp Nou - Barcelona");
        i.putExtra("icon",R.drawable.bar);
        startActivity(i);
    }

    public void ibCastellonClick(View view) {
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lat", 39.9961111);
        i.putExtra("lon", -0.0407998);
        i.putExtra("nombre","Castalia - CD Castellón");
        i.putExtra("icon",R.drawable.cas);
        startActivity(i);
    }
    public void ibAtleticoClick(View view) {
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lat", 40.4361939);
        i.putExtra("lon", -3.6016561);
        i.putExtra("nombre","Wanda metropolitano - Atlético de Madrid");
        i.putExtra("icon",R.drawable.atm);
        startActivity(i);
    }
    public void ibTrampasClick(View view) {
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lat", 40.4530387);
        i.putExtra("lon", -3.6905224);
        i.putExtra("nombre","Santiago Bernabeu - Real Trampas de Madrid");
        i.putExtra("icon",R.drawable.rma);
        startActivity(i);
    }

}