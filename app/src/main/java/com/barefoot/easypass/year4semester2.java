package com.barefoot.easypass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class year4semester2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year4semester2);
        ActionBar actionBar= getSupportActionBar();
        if (actionBar != null) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0C84E6")));
        }

    }

    public void csc4205(View view) {
        Intent intent = new Intent(this, CSC4205.class);
        startActivity(intent);
    }

    public void csc4204(View view) {
        Intent intent = new Intent(this, CSC4204.class);
        startActivity(intent);
    }

    public void csc4203(View view) {
        Intent intent = new Intent(this, CSC4203.class);
        startActivity(intent);
    }

    public void csc4202(View view) {
        Intent intent = new Intent(this, CSC4202.class);
        startActivity(intent);
    }

    public void csc4201(View view) {
        Intent intent = new Intent(this, CSC4201.class);
        startActivity(intent);
    }
}
