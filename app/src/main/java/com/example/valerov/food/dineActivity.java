package com.example.valerov.food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class dineActivity extends AppCompatActivity {
public Button pmenu;
public Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine);
        Intent intent = getIntent();
    //set spinner
        spin = (Spinner)findViewById(R.id.spinner);
        pmenu = (Button)findViewById(R.id.button_pmenu);

    }

    public void pilihmenu(View view) {
        Intent intents= new Intent(this, MenuActivity.class);
            Toast.makeText(getApplicationContext(), spin.getSelectedItem().toString() + "Terpilih", Toast.LENGTH_LONG).show();
        startActivity(intents);
        }
    }

