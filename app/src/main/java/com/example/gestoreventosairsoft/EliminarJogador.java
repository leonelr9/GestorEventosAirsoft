package com.example.gestoreventosairsoft;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class EliminarJogador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar_jogador);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mostraMensagem();
    }


    private void mostraMensagem() {
        Intent intent = getIntent();

        String nome = intent.getStringExtra(DefinicoesApp.NOME);
        TextView textViewNome = findViewById(R.id.textViewNome);
        textViewNome.setText(nome);

        String contato = intent.getStringExtra(DefinicoesApp.CONTACTO);
        TextView textViewContacto = findViewById(R.id.textViewNome);
        textViewContacto.setText(contato);

        String datanascimento = intent.getStringExtra(DefinicoesApp.DATANASCIMENTO);
        TextView textViewdatanascimento = findViewById(R.id.textViewNome);
        textViewdatanascimento.setText(datanascimento);

        String gruposanguineo = intent.getStringExtra(DefinicoesApp.GRUPOSANGUINEO);
        TextView textViewgruposanguineo = findViewById(R.id.textViewNome);
        textViewgruposanguineo.setText(gruposanguineo);

        String numsocio = intent.getStringExtra(DefinicoesApp.NUMSOCIO);
        TextView textViewnumsocio = findViewById(R.id.textViewNome);
        textViewnumsocio.setText(numsocio);
    }
}
