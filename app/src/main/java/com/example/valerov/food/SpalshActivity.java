package com.example.valerov.food;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SpalshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
    //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

    final Handler handler = new Handler();
    handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }
    }, 3000L);
    }
}
