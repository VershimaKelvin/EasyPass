package com.barefoot.easypass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class year2semester1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year2semester1);
        ActionBar actionBar= getSupportActionBar();
        if (actionBar != null) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0C84E6")));
        }
    }

    public void ent3101(View view) {
        Intent intent = new Intent(this, ENT3101.class);
        startActivity(intent);
    }

    public void gss2101(View view) {
        Intent intent = new Intent(this, GSS2101.class);
        startActivity(intent);
    }

    public void mth2104(View view) {
        Intent intent = new Intent(this, MTH2104.class);
        startActivity(intent);
    }

    public void mth2103(View view) {
        Intent intent = new Intent(this, MTH2103.class);
        startActivity(intent);
    }

    public void csc2103(View view) {
        Intent intent = new Intent(this, CSC2103.class);
        startActivity(intent);
    }

    public void csc2102(View view) {
        Intent intent = new Intent(this, CSC2102.class);
        startActivity(intent);
    }

    public void csc2101(View view) {
        Intent intent = new Intent(this, CSC2101.class);
        startActivity(intent);
    }
}
