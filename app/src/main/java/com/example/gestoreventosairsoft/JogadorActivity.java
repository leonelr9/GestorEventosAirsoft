package com.example.gestoreventosairsoft;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class JogadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogador);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void criarJogador(View view) {
        Intent intent = new Intent(this, CriarJogadorActivity.class);
        startActivity(intent);
    }
    public void verJogadores(View view) {
        Toast.makeText(this, getString(R.string.ver_jogadores), Toast.LENGTH_LONG).show();
    }

    public void editaJogador(View view) {
        Intent intent = new Intent(this, EditarJogador.class);
        startActivity(intent);
    }
}
