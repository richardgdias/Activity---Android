package com.curso.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        //evento de click                     // criando uma classe anonima
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //passar os dados de uma tela pra outra abrindo outra activity
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //instanciar um objeto
                Usuario usuario = new Usuario("Richard", "richard@gmail.com");

                //passar dados
                intent.putExtra("nome", "Richard");
                intent.putExtra("idade", 22);
                intent.putExtra("objeto", usuario); //Serializable transmitir um objeto para outra activity

                startActivity(intent);
            }
        });
    }
}
