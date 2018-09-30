package com.example.felipe.wikiiao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bardo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bardo);
    }

    public void onClick(View view){
        Intent prueba = new Intent(this,clases.class);
        startActivity(prueba);
    }
}
