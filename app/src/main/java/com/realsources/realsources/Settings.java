package com.realsources.realsources;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static java.util.ResourceBundle.clearCache;

public class Settings extends AppCompatActivity {
    Switch push,other,darkmode;
    TextView logout,cache,rate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.darktheme);
        }
        else setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_settings);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        logout = (TextView) findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
        rate = (TextView) findViewById(R.id.rate);
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("market://details?id=" + getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // To count with Play market backstack, After pressing back button,
                // to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=com.realsources.realsources" + getPackageName())));
                }
            }


        });
        cache  = (TextView) findViewById(R.id.cache);
        cache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCache();
            }
        });



        push = (Switch) findViewById(R.id.push );
       push.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (push.isChecked()) {
                   Toast.makeText(getApplicationContext(), "You have enabled push notifications", Toast.LENGTH_SHORT).show();
               } else {
                   Toast.makeText(getApplicationContext(), "You have disabled push notifications", Toast.LENGTH_SHORT).show();
               }

           }
       });



        other = (Switch) findViewById(R.id.other);
        other .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (other .isChecked()) {
                    Toast.makeText(getApplicationContext(), "Sound in app enabled", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Sound in app disabled", Toast.LENGTH_SHORT).show();
                }

            }
        });

        darkmode  = (Switch) findViewById(R.id.darkmode);
        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            darkmode.setChecked(true);
        }

        darkmode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (darkmode.isChecked()) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    Toast.makeText(getApplicationContext(), "Dark mode enabled", Toast.LENGTH_SHORT).show();
                    restartApp();
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    Toast.makeText(getApplicationContext(), "Dark mode disabled", Toast.LENGTH_SHORT).show();
                    restartApp();
                }

            }

            private void restartApp() {
                Intent intent = new Intent(getApplicationContext(),Settings.class);
                startActivity(intent);
                finish();

            }

        });







        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_shop:
                        Intent a = new Intent(Settings.this, Home.class);
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
                        break;
                }
                return false;
            }
        });
    }



    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void openCache() {
        Intent intent = new Intent(getApplicationContext(),Cache.class);
        startActivity(intent);
        finish();

    }
}
