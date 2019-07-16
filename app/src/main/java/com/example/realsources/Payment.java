package com.example.realsources;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Payment extends AppCompatActivity {
private Button button1;
    private RadioGroup radio;
    private CheckBox checkBox;
    private ImageView imageViewback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        
        button1= findViewById(R.id.button1);


        CheckBox checkBox=(CheckBox)findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    button1.setEnabled(true);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            openSuccess();
                        }
                    });


                }else{
                    button1.setEnabled(false);
                            ShowToast();

                }

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
        imageViewback= findViewById(R.id.imageViewback);
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShipping();
            }
        });
    }

    public void openSuccess(){
        Intent intent =new Intent(this,Success.class);
        startActivity(intent);
    }

    public void ShowToast()
    {
        Toast.makeText(Payment.this, "You have to accept the terms and conditions to continue" , Toast.LENGTH_SHORT ).show();
    }
    public void openShipping(){
        Intent intent =new Intent(this,Shipping.class);
        startActivity(intent);
    }
}
