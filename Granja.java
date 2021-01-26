package com.example.granja;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Granja extends AppCompatActivity {

    private Button caballo;
    private Button gallina;
    private Button gallo;
    private Button oveja;
    private Button pato;
    private Button vaca;
    private Button salir;
    private MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_granja);

        caballo = (Button) findViewById(R.id.caballo);
        gallina = (Button) findViewById(R.id.gallina);
        gallo = (Button) findViewById(R.id.gallo);
        oveja = (Button) findViewById(R.id.oveja);
        pato = (Button) findViewById(R.id.pato);
        vaca = (Button) findViewById(R.id.vaca);

        caballo.setOnClickListener((View.OnClickListener) this);
        gallina.setOnClickListener((View.OnClickListener) this);
        gallo.setOnClickListener((View.OnClickListener) this);
        oveja.setOnClickListener((View.OnClickListener) this);
        pato.setOnClickListener((View.OnClickListener) this);
        vaca.setOnClickListener((View.OnClickListener) this);

        salir = (Button) findViewById(R.id.salir);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent principal = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(principal, 0);
            }
        });
    }
    public void onClick (View v) {
        if (caballo == v) {
            try {
                mp = MediaPlayer.create(this, R.raw.caballo);
                mp.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(gallina == v) {
            try {
                mp = MediaPlayer.create(this, R.raw.gallina);
                mp.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(gallo == v) {
            try {
                mp = MediaPlayer.create(this, R.raw.gallo);
                mp.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(oveja == v) {
            try {
                mp = MediaPlayer.create(this, R.raw.oveja);
                mp.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(pato == v) {
            try {
                mp = MediaPlayer.create(this, R.raw.pato);
                mp.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(vaca == v) {
            try {
                mp = MediaPlayer.create(this, R.raw.vaca);
                mp.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
