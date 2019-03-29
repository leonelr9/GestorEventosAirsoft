package com.example.gestoreventosairsoft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostraMensagemEventos(View view) {
        Toast.makeText(this, getString(R.string.mensagem_evento), Toast.LENGTH_LONG).show();
    }

    public void mostraMensagemJogador(View view) {
        Intent intent = new Intent(this, JogadorActivity.class);
        startActivity(intent);
    }
    public void mostraMensagemArmas(View view) {
        Toast.makeText(this, getString(R.string.mensagem_armas), Toast.LENGTH_LONG).show();
    }
}
