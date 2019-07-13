package com.example.realsources;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class Settings extends AppCompatActivity {
    Boolean
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        toolbar=findViewById(R.id.mToolbar);
        setSupportActionBar(toolbar);


        if(findViewById(R.id.FragmentContainer)!=null)
        {
            if(savedInstanceState)!=null{


                Intent intent = new Intent(this, FragmentActivity.class);
                startActivity(intent);
                return;


            getFragmentManager().beginTransaction().add(R.id.FragmentContainer new SettingsFragment()).commit();
        }

           }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
