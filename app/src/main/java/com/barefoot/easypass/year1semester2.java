package com.barefoot.easypass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class year1semester2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year1semester2);
        ActionBar actionBar= getSupportActionBar();
        if (actionBar != null) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0C84E6")));
        }

    }

    public void gss1203(View view) {
        Intent intent = new Intent(this, GSS1203.class);
        startActivity(intent);
    }

    public void gss1202(View view) {
        Intent intent = new Intent(this, GSS1202.class);
        startActivity(intent);
    }

    public void gss1201(View view) {
        Intent intent = new Intent(this,GSS1201.class);
        startActivity(intent);
    }

    public void sta1201(View view) {
        Intent intent = new Intent(this, STA1201.class);
        startActivity(intent);
    }

    public void phy1201(View view) {
        Intent intent = new Intent(this, PHY1201.class);
        startActivity(intent);
    }

    public void mth1202(View view) {
        Intent intent = new Intent(this, MTH1202.class);
        startActivity(intent);
    }

    public void mth1201(View view) {
        Intent intent = new Intent(this, MTH1201.class);
        startActivity(intent);
    }

    public void csc1203(View view) {
        Intent intent = new Intent(this, CSC1203.class);
        startActivity(intent);
    }

    public void csc1202(View view) {
        Intent intent = new Intent(this, CSC1202.class);
        startActivity(intent);
    }

    public void css1201(View view) {
        Intent intent = new Intent(this, CSC1201.class);
        startActivity(intent);
    }
}
