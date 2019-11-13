package com.example.realsources;

import android.content.Intent;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    private WebView wb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);


        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_shop:
                     //   break;
                   // case R.id.navigation_gifts:
                     //   Intent a = new Intent(Home.this,Wishlist.class);
                     //   startActivity(a);
                       // break;
                   // case R.id.navigation_cart:
                        //Intent b = new Intent(Home.this,Cart.class);
                      //  startActivity(b);
                        break;
                    case R.id.navigation_profile:
                        Intent c= new Intent(Home.this,Settings.class);
                        startActivity(c);
                        break; }
                return false; }
        });


        wb = (WebView) findViewById(R.id.wb);
        wb.loadUrl("https://www.realsources.africa/");
        wb.getSettings().setJavaScriptEnabled(true);

        wb.setWebViewClient(new WebViewClient());


    }
}
