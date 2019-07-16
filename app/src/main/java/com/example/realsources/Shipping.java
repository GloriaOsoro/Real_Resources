package com.example.realsources;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Shipping extends AppCompatActivity {
    private RadioGroup radio;
    private RadioButton radioButton;
    private Button button1;
    private ImageView imageViewback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping);
        button1= findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPayment();
            }
        });
        imageViewback= findViewById(R.id.imageViewback);
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCart();
            }
        });


        addListenerOnButton();

    }

    public void addListenerOnButton() {

        radio = (RadioGroup) findViewById(R.id.radio);
        radio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radio.getCheckedRadioButtonId();





            }

        });
    }
    public void openPayment(){
        Intent intent =new Intent(this,Payment.class);
        startActivity(intent);
    }
    public void openCart(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
}
