package com.example.gameduoihinhbatchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gameduoihinhbatchu.api.GetCauHoi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new GetCauHoi().execute();
    }

    public void choiGame(View view) {
        if (DATA.getData().arrCauDo.size()>0){
            startActivity(new Intent(this,ChoiGameActivity.class));
        }
    }
}