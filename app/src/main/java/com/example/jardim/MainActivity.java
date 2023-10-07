package com.example.jardim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuario;
    EditText senha;
    Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.editTextUsuario);
        senha = (EditText) findViewById(R.id.editTextSenha);
        entrar = (Button) findViewById(R.id.buttonEntrar);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("admin".equals(usuario.getText().toString()) && "1234".equals(senha.getText().toString())){
                    startActivity(new Intent());
            }else{
                    Toast erroAutenticacao = Toast.makeText(MainActivity.this, "Usuario e Senha invalido", Toast.LENGTH_SHORT);
                    erroAutenticacao.show();
                }
                }
        });
    }
}