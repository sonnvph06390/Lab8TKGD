package com.example.son.lab8tkgd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Bai1(View view) {
        Intent intent=new Intent(MainActivity.this, Bai1.class);
        startActivity(intent);
    }

    public void Bai2(View view) {
        Intent intent=new Intent(MainActivity.this, Bai2.class);
        startActivity(intent);
    }
}
