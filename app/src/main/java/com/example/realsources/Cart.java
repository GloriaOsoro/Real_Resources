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

public class Cart extends AppCompatActivity {
    private ImageView imageViewback;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        button1= findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShipping();
            }
        });
        BottomNavigationView navigation = findViewById(R.id.navigation);
        imageViewback= findViewById(R.id.imageViewback);
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWishlist();
            }
        });

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_shop:
                        Intent a = new Intent( Cart.this,Home.class);
                        startActivity(a);
                        break;
                    case R.id.navigation_gifts:
                        Intent b = new Intent( Cart.this,Wishlist.class);
                        startActivity(b);
                        break;
                    case R.id.navigation_cart:
                        break;
                    case R.id.navigation_profile:
                        Intent c= new Intent( Cart.this,Profile.class);
                        startActivity(c);
                        break;
                }
                return true; }
        });
    }
    public void openWishlist(){
        Intent intent =new Intent(this,Wishlist.class);
        startActivity(intent);
    }
    public void openShipping(){
        Intent intent =new Intent(this,Shipping.class);
        startActivity(intent);
    }
}
