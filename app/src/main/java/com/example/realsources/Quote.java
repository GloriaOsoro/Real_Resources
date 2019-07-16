package com.example.realsources;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Quote extends AppCompatActivity {
    private ImageView imageView900;
    private ImageView imageView09;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);
        imageView900=(ImageView) findViewById(R.id.imageView900);
        imageView900.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
        imageView09=(ImageView) findViewById(R.id.imageView09);
        imageView09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettings();
            }
        });
    }

    public void openHome(){
        Intent intent =new Intent(this,Home.class);
        startActivity(intent);
    }
    public void openSettings(){
        Intent intent =new Intent(this,Settings.class);
        startActivity(intent);
    }
}

