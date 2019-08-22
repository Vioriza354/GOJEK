package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.security.KeyChain.EXTRA_NAME;

public class Pesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
        TextView pesanan = (TextView) findViewById(R.id.pesanan);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString( "pesanan")
                   + (" Atas Nama ")
                   + bundle.getString("name")
                   + (" Telah Dikirm Ke ")
                   + bundle.getString("alamat");

        pesanan.setText(s);
    }
    public void onClick(View view){
        Intent explicit = new Intent( Pesanan.this, Orderan.class);
        startActivity(explicit);
    }
}
