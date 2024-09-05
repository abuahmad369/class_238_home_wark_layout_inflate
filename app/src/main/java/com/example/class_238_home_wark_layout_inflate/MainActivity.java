package com.example.class_238_home_wark_layout_inflate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout mainlayout;
    Button btnBd, btnBongo;
    LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainlayout = findViewById(R.id.mainlayout);
        btnBd = findViewById(R.id.btnBd);
        btnBongo = findViewById(R.id.btnBongo);

        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        btnBd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainlayout.removeAllViews();
                layoutInflater.inflate(R.layout.about_bangladesh, mainlayout);
            }
        });

        btnBongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainlayout.removeAllViews();
                layoutInflater.inflate(R.layout.about_bongoacademy, mainlayout);
            }
        });
    }

}