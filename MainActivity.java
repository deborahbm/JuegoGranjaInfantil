package com.example.granja;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button animales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animales= (Button) findViewById(R.id.animales);

        animales.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent juego = new Intent(v.getContext(), Granja.class);
                startActivityForResult(juego, 0);
            }
        });
    }


}
