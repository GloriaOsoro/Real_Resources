package com.example.realsources;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_shop:
                        Intent a = new Intent( Settings.this,Home.class);
                        startActivity(a);
                        break;
                   // case R.id.navigation_gifts:
                      //  Intent b = new Intent( Settings.this,Wishlist.class);
                      //  startActivity(b);
                      //  break;
                   // case R.id.navigation_cart:
                     //   Intent c= new Intent( Settings.this,Cart.class);
                      //  startActivity(c);
                      //  break;
                    case R.id.navigation_profile:
                        break; }
                return false; }
        });
    }
}
