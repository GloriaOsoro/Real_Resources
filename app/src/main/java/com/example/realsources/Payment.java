package com.example.realsources;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Payment extends AppCompatActivity {
private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        button1= findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSuccess();
            }
        });

        final CheckBox checkBox=(CheckBox)findViewById(R.id.checkbox);
        if(checkBox.isChecked()){
            checkBox.setChecked(false);
        }
    }
    public void openSuccess(){
        Intent intent =new Intent(this,Success.class);
        startActivity(intent);
    }
}
