package com.example.techtron.cabcaller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewDriver, textViewPlateNum;

    ImageView imageViewDriver;

    Button buttonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewDriver = (TextView) findViewById(R.id.textViewDriver);
        textViewPlateNum = (TextView) findViewById(R.id.textViewPlateNum);

        imageViewDriver = (ImageView) findViewById(R.id.imageViewDriver);

        buttonInfo = (Button) findViewById(R.id.buttonInfo);

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);

                startActivity(intent);

                
            }
        });

    }
}
