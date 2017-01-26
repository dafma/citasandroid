package com.example.seader.myapplicationa;

import android.os.Build;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static  final String TAG= MainActivity.class.getSimpleName();

    private TextView citaTextView;
    private TextView autorTextView;
    private Button nuevaCitaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citaTextView = (TextView) findViewById(R.id.citaTextView);
        autorTextView = (TextView) findViewById(R.id.autorTextView);
        nuevaCitaButton = (Button) findViewById(R.id.nuevaCitaButton);


        nuevaCitaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "me tocaste");

            }
        });

    }
}
