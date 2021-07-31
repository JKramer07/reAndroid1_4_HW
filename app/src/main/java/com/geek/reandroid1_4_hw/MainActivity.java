package com.geek.reandroid1_4_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.first_cont, new FirstFragment(), null).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.second_cont, new SecondFragment(), null).commit();
    }
}