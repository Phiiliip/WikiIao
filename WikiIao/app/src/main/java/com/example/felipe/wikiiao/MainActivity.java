package com.example.felipe.wikiiao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irAClases(View view){
        Intent clases = new Intent(this, com.example.felipe.wikiiao.clases.clases.class);
        startActivity(clases);
    }
}
