package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Orderan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderan);
    }
    public void onClick(View view){
        Intent explicit = new Intent( Orderan.this, GoFood.class);
        startActivity(explicit);
    }
}
