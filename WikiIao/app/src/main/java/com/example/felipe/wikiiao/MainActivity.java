package com.example.felipe.wikiiao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.felipe.WikiIao.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irAClases(View view){
        Intent clases = new Intent(this, clases.class);
        startActivity(clases);
    }

    public void irABardo(View view) {
        Intent bardo = new Intent(this, bardo.class);
        startActivity(bardo);
    }
}
