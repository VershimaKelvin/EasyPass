package com.barefoot.easypass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        int splashTimeout = 2000;
        new Handler().postDelayed(new Runnable(){
                                      @Override
                                      public void run() {
                                          Intent homeIntent = new Intent(MainActivity.this, login.class);
                                          startActivity(homeIntent);
                                          finish();
                                      }
                                  }
                , splashTimeout
        );

    }



}
