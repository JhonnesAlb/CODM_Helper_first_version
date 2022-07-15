package com.example.codm_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectRifle(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void selectSMG(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void selectLMG(View view){
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    public void selectSniper(View view){
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

    public void selectEscopeta(View view){
        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }

    public void selectAtirador(View view){
        Intent intent = new Intent(this, SeventhActivity.class);
        startActivity(intent);
    }


}