package com.example.realsources;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class Home extends AppCompatActivity {
    private ImageView imageViewS;
    private Button request;


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
            break;
            case R.id.navigation_gifts:
                Intent a = new Intent(Home.this,Wishlist.class);
                startActivity(a);
                break;
                case R.id.navigation_cart:
                    Intent b = new Intent(Home.this,Cart.class);
                    startActivity(b);
                    break;
                  case R.id.navigation_profile:
                      Intent c= new Intent(Home.this,Profile.class);
                      startActivity(c);
                      break; }
                      return true; }
});


        request= findViewById(R.id.request);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuote();
            }
        });
        imageViewS= findViewById(R.id.imageViewS);
        imageViewS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettings();
            }
        });

    }
    public void openQuote(){
        Intent intent =new Intent(this,Quote.class);
        startActivity(intent);
    }

    public void openSettings(){
        Intent intent =new Intent(this,Settings.class);
        startActivity(intent);
    }
}
