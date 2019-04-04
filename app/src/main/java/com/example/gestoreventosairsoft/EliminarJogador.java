package com.example.gestoreventosairsoft;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
        String contacto = intent.getStringExtra(DefinicoesApp.CONTACTO);
        String datanascimento = intent.getStringExtra(DefinicoesApp.DATANASCIMENTO);
        String gruposanguineo = intent.getStringExtra(DefinicoesApp.GRUPOSANGUINEO);
        String numsocio = intent.getStringExtra(DefinicoesApp.NUMSOCIO);

        TextView textViewNome = (TextView) findViewById(R.id.textViewNome);
        textViewNome.setText(nome);

        TextView textViewContacto = (TextView) findViewById(R.id.textViewContacto);
        textViewContacto.setText(contacto);

        TextView textViewDataNascimento = (TextView) findViewById(R.id.textViewDataNascimento);
        textViewDataNascimento.setText(datanascimento);

        TextView textViewGrupoSanguineo = (TextView) findViewById(R.id.textViewGrupoSanguineo);
        textViewGrupoSanguineo.setText(gruposanguineo);

        TextView textViewNumSocio = (TextView) findViewById(R.id.textViewNumSocio);
        textViewNumSocio.setText(numsocio);
    }

    public void CancelarJogador(View view) {
        finish();
    }


    public void Apagar(View view){
        Toast.makeText(this, getString(R.string.dados_guardados), Toast.LENGTH_LONG).show();
        finish();
    }
}
