package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun proximaTela(nomeUsuario : String) {
            val novaTela : Intent = Intent(this, Home::class.java)
            novaTela.putExtra("Novo usuário",nomeUsuario)
            startActivity(novaTela);
    }
    fun proximaTela(view: View) {
        val editTextUsername : EditText = findViewById(R.id.nome)
        val editTextPassword : EditText = findViewById(R.id.senha)
        val userName = editTextUsername.text.toString();
        val userPassword = editTextPassword.text.toString();
        if(userName.equals("admin")){
            if(editTextPassword.text.toString().equals("123")){
                proximaTela(userName)
                finish()
            }else {
                Toast.makeText(this,"Senha Inválido!",Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(this,"Usuário Inválido!",Toast.LENGTH_LONG).show()
        }
    }
}