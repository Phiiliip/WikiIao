package com.example.felipe.wikiiao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.felipe.WikiIao.R;

public class clases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clases);
    }

    public void irA(View view,String clase){
        switch(clase){
            case "bardo":
                Intent bardo = new Intent(this, bardo.class);
                startActivity(bardo);

            /*case "guerrero":
                Intent guerre = new Intent(this, guerrero.class);
                startActivity(guerre);*/
        }
    }
}
