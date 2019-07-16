package com.example.realsources;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Wishlist extends AppCompatActivity {
    private ImageView imageViewback;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        imageViewback= findViewById(R.id.imageViewback);
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
        button1= findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCart();
            }
        });


        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_shop:
                        Intent a = new Intent( Wishlist.this,Home.class);
                        startActivity(a);
                        break;
                    case R.id.navigation_gifts:
                        break;
                    case R.id.navigation_cart:
                        Intent b = new Intent( Wishlist.this,Cart.class);
                        startActivity(b);
                        break;
                    case R.id.navigation_profile:
                        Intent c= new Intent( Wishlist.this,Profile.class);
                        startActivity(c);
                        break; }
                return true; }
        });

    }
    public void openHome(){
        Intent intent =new Intent(this,Home.class);
        startActivity(intent);
    }
    public void openCart(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }

}
