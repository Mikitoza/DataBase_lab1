package com.example.database_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isShow = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView helloWorld = findViewById(R.id.helloWorld);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (isShow) {
                    helloWorld.setVisibility(View.INVISIBLE);
                    isShow = false;
                } else {
                    helloWorld.setVisibility(View.VISIBLE);
                    isShow = true;
                }
            }
        });
    }

}