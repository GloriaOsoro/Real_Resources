package com.example.realsources;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;

public class Quote extends AppCompatActivity {
    private ImageView imageView900;
    private ImageView imageView09;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);
        final Button btnOpenPopup = (Button)findViewById(R.id.buttonquote);
        btnOpenPopup.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        openHome();
                    }});

                popupWindow.showAsDropDown(btnOpenPopup, -50, 10);

            }});

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

