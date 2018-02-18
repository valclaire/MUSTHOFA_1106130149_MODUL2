package com.example.valerov.food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class takeActivity extends AppCompatActivity {
public Button tpmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take);
        Intent intens = getIntent();
    tpmenu = (Button)findViewById(R.id.button_tpmenu);
    }

    public void menus(View view) {
    Intent inmenu = new Intent(this, MenuActivity.class);
    startActivity(inmenu);
    }
}
