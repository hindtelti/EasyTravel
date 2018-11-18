package com.example.usr.easytravel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Authentification extends AppCompatActivity {


    EditText edt1;
    EditText edt2;
    Button btn;
    Button btn4;
    Button btn1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);

        edt1 = (EditText) findViewById(R.id.editText1);
        edt2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button);
        btn4 =(Button) findViewById(R.id.button4);
        btn1 =(Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1.getText().toString().equals("admin") && (edt2.getText().toString().equals("admin"))) {
                    Intent i = new Intent(Authentification.this, Main2Activity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(Authentification.this, "mot de passe ou email incorrect!!", Toast.LENGTH_LONG).show();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Authentification.this,InscriptionActivity.class);
                startActivity(i4);
            }
        });




    }
}