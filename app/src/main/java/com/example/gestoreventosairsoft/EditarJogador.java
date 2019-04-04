package com.example.gestoreventosairsoft;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class EditarJogador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_jogador);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void Guardar(View view) {
        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        String nome = editTextNome.getText().toString();

        EditText editTextContacto = findViewById(R.id.editTextContacto);
        String contacto = editTextContacto.getText().toString();

        EditText editTextDataNascimento = findViewById(R.id.editTextDataNascimento);
        String datanascimento = editTextDataNascimento.getText().toString();

        EditText editTextGrupoSanguineo = findViewById(R.id.editTextGrupoSanguineo);
        String gruposanguineo = editTextGrupoSanguineo.getText().toString();

        EditText editTextNumSocio = findViewById(R.id.editTextNumSocio);
        String numsocio = editTextNumSocio.getText().toString();

        Intent intent = new Intent(this, EliminarJogador.class);
        intent.putExtra(DefinicoesApp.NOME, nome);
        intent.putExtra(DefinicoesApp.CONTACTO, contacto);
        intent.putExtra(DefinicoesApp.DATANASCIMENTO, datanascimento);
        intent.putExtra(DefinicoesApp.GRUPOSANGUINEO, gruposanguineo);
        intent.putExtra(DefinicoesApp.NUMSOCIO, numsocio);
        startActivity(intent);

        //para validar dados:
        if(nome.trim().length() == 0 ){
            editTextNome.setError(getString(R.string.nome_requerido));
            // requer que a atenção do utilizador seja na mensagem em vez de ser no botao para assim ver a mensagem de erro
            editTextNome.requestFocus();
            return;
        }else if(contacto.trim().length() == 0 ){
            editTextContacto.setError(getString(R.string.contacto_requerido));
            editTextContacto.requestFocus();
            return;
        }else if(datanascimento.trim().length() == 0 ){
            editTextDataNascimento.setError(getString(R.string.data_requerida));
            editTextDataNascimento.requestFocus();
            return;
        }else if(gruposanguineo.trim().length() == 0 ){
            editTextGrupoSanguineo.setError(getString(R.string.grupo_sanguineo_requerido));
            editTextGrupoSanguineo.requestFocus();
            return;
        }else if (numsocio.trim().length() == 0 ){
            editTextNumSocio.setError(getString(R.string.numsocio_requerido));
            editTextNumSocio.requestFocus();
            return;
        }

        Toast.makeText(this, getString(R.string.dados_guardados), Toast.LENGTH_LONG).show();
        finish();
    }

    public void Cancelar(View view) {
        finish();
    }


}
