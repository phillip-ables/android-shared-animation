package com.example.techtron.cabcaller;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewFirstName, textViewPlateNum;

    ImageView imageViewDriver;

    Button buttonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewFirstName = (TextView) findViewById(R.id.textViewFirstName);
        textViewPlateNum = (TextView) findViewById(R.id.textViewPlateNum);

        imageViewDriver = (ImageView) findViewById(R.id.imageViewDriver);

        buttonInfo = (Button) findViewById(R.id.buttonInfo);

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);

                Pair<View,String> pairDriver = Pair.create(findViewById(R.id.imageViewDriver), "driver");
                Pair<View,String> pairName = Pair.create(findViewById(R.id.textViewFirstName), "firstName");
                Pair<View,String> pairNum = Pair.create(findViewById(R.id.textVIewPlateNum), "plateNum")

                ActivityOptions acitivityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                startActivity(intent);
            }
        });

    }
}
