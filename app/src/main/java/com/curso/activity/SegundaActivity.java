package com.curso.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textIdade = findViewById(R.id.textIdade);
        textNome = findViewById(R.id.textNome);

        //recuperar os dados enviados da outra activity
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");
        Usuario usuario = (Usuario) dados.getSerializable("objeto"); // casting de Serializable para Usuario

        //configurar valores recuperados
        textNome.setText(usuario.getEmail());
        textIdade.setText(String.valueOf(idade)); //convertendo para string
    }
}
