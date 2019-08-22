package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);

        final EditText name = (EditText) findViewById(R.id.nama);
        final EditText alamat = (EditText) findViewById(R.id.alamat);
        final EditText pesanan = (EditText) findViewById(R.id.pesanan);
        Button button = (Button) findViewById(R.id.button_pesan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent ( GoFood.this, Pesanan.class);
                i.putExtra("name", name.getText().toString());
                i.putExtra("alamat", alamat.getText().toString());
                i.putExtra("pesanan", pesanan.getText().toString());
                startActivity(i);
            }
        });
    }
}
