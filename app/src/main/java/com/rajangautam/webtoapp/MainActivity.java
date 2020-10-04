package com.example.webtoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button pdpu, loyal, photography, ecommerce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdpu = (Button) findViewById(R.id.pdpu);
        loyal = (Button) findViewById(R.id.loyalpartners);
        photography = (Button) findViewById(R.id.photography);
        ecommerce = (Button) findViewById(R.id.ecommerce);

        pdpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lunchActivityPDPU();
            }
        });
        ecommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lunchActivityEcommerce();
            }
        });
        photography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lunchActivityPhotography();
            }
        });
        loyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lunchActivityLoyal();
            }
        });
    }
    private void lunchActivityPDPU()
    {
        Intent intent = new Intent(this, pdpu.class);
        startActivity(intent);
    }
    private void lunchActivityPhotography()
    {
        Intent intent = new Intent(this, photography.class);
        startActivity(intent);
    }
    private void lunchActivityLoyal()
    {
        Intent intent = new Intent(this, loyal_partners.class);
        startActivity(intent);
    }
    private void lunchActivityEcommerce()
    {
        Intent intent = new Intent(this, ecommerce.class);
        startActivity(intent);
    }
}
