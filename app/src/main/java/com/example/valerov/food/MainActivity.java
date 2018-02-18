package com.example.valerov.food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public RadioGroup collect;
    public RadioButton dine;
    public RadioButton take;
    public Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        collect = (RadioGroup) findViewById(R.id.rg_collect);
        dine = (RadioButton) findViewById(R.id.rb_dine);
        take = (RadioButton) findViewById(R.id.rb_take);
        order = (Button) findViewById(R.id.b_order);
    }

    public void order(View view) {
        Intent intent = new Intent(this, dineActivity.class);
        Intent intens = new Intent(this, takeActivity.class);
        int id = collect.getCheckedRadioButtonId();

        if (id == dine.getId()) {
            Toast.makeText(getApplicationContext(), "Jenis Pesanan Anda adalah Dine In", Toast.LENGTH_LONG).show();
            startActivity(intent);
        } else if (id == take.getId()) {
            Toast.makeText(getApplicationContext(), "Jenis Pesanan Anda adalah 'Take Away' ", Toast.LENGTH_LONG).show();
            startActivity(intens);
        } else {
            Toast.makeText(getApplicationContext(), "Anda Belum Memiih Menu", Toast.LENGTH_LONG).show();
        }

    }
}