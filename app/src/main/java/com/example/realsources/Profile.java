package com.example.realsources;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_shop:
                        Intent a = new Intent( Profile.this,Home.class);
                        startActivity(a);
                        break;
                    case R.id.navigation_gifts:
                        Intent b = new Intent( Profile.this,Wishlist.class);
                        startActivity(b);
                        break;
                    case R.id.navigation_cart:
                        Intent c= new Intent( Profile.this,Cart.class);
                        startActivity(c);
                        break;
                    case R.id.navigation_profile:
                        break; }
                return true; }
        });
    }
}
