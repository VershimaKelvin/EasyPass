package com.barefoot.easypass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class year2semester2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year2semester2);
        ActionBar actionBar= getSupportActionBar();
        if (actionBar != null) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0C84E6")));
        }

    }

    public void ent3201(View view) {
        Intent intent = new Intent(this, ENT3201.class);
        startActivity(intent);
    }

    public void mth2201(View view) {
        Intent intent = new Intent(this, MTH2201.class);
        startActivity(intent);
    }

    public void csc2205(View view) {
        Intent intent = new Intent(this, CSC2205.class);
        startActivity(intent);
    }

    public void csc2204(View view) {
        Intent intent = new Intent(this, CSC2204.class);
        startActivity(intent);
    }

    public void csc2203(View view) {
        Intent intent = new Intent(this, CSC2203.class);
        startActivity(intent);
    }

    public void csc2202(View view) {
        Intent intent = new Intent(this, CSC2202.class);
        startActivity(intent);
    }

    public void csc2201(View view) {
        Intent intent = new Intent(this, CSC2201.class);
        startActivity(intent);
    }
}
