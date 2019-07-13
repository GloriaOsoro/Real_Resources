package com.example.realsources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.AlteredCharSequence;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;




public class Login extends AppCompatActivity {
    private ImageView imageView3;
    private Button button2;
    private TextView textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        imageView3=(ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
        textView7=(TextView)findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegister();
            }
        });
    }


    public void openMainActivity(){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void openHome(){
        Intent intent =new Intent(this,Home.class);
        startActivity(intent);
    }
    public void openRegister(){
        Intent intent =new Intent(this,Register.class);
        startActivity(intent);
    }

}
