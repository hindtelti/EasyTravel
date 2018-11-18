package com.example.usr.easytravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InscriptionActivity extends AppCompatActivity {

    EditText edt;
    EditText edt3;
    EditText edt4;
    EditText edt5;
    Button btn5;
    Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        edt = (EditText) findViewById(R.id.editText);
        edt3 = (EditText) findViewById(R.id.editText3);
        edt4 =(EditText)  findViewById(R.id.editText4);
        edt5 =(EditText) findViewById(R.id.editText5);
        btn5 =(Button)findViewById(R.id.button5);
        btn6 =(Button) findViewById(R.id.button6);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (edt.getText().toString().equals("admin") && (edt3.getText().toString().equals("teltihind@gmail.com")) && (edt4.getText().toString().equals("admin")) && (edt5.getText().toString().equals("admin"))) {
                    Intent i = new Intent(InscriptionActivity.this, Main2Activity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(InscriptionActivity.this, "champ vide/remplir tous les champs!!", Toast.LENGTH_LONG).show();
                }





            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(InscriptionActivity.this,Authentification.class);
                startActivity(i6);
            }
        });


    }
}
