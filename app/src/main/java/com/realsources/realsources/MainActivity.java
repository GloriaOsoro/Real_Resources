package com.realsources.realsources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });

        //SharedPreferences settings = getSharedPreferences("prefs", 0);
      //  SharedPreferences.Editor editor = settings.edit();
      //  editor.putBoolean("firstRun", true);
       // editor.commit();

        //Intent intent = new Intent(this,Login.class);
       // startActivity(intent);
    }

    public void openLogin(){
        Intent intent =new Intent(this,Login.class);
        startActivity(intent);
    }
   // public void onResume() {
      // super.onResume();
      //  SharedPreferences settings = getSharedPreferences("prefs", 0);
      //  boolean firstRun = settings.getBoolean("firstRun", true);
       // if (!firstRun) {
           // Intent intent = new Intent(this, Login.class);
            //startActivity(intent);
           // Log.d("TAG1", "firstRun(false): " + Boolean.valueOf(firstRun).toString());
       // } else {
         //   Log.d("TAG1", "firstRun(true): " + Boolean.valueOf(firstRun).toString());
       // }
   // }

}
