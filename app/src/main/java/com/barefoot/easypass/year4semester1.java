package com.barefoot.easypass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class year4semester1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year4semester1);
        ActionBar actionBar= getSupportActionBar();
        if (actionBar != null) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0C84E6")));
        }

    }

    public void csc4107(View view) {
        Intent intent = new Intent(this, CSC4107.class);
        startActivity(intent);
    }

    public void csc4105(View view) {
        Intent intent = new Intent(this, CSC4105.class);
        startActivity(intent);
    }

    public void csc4104(View view) {
        Intent intent = new Intent(this, CSC4104.class);
        startActivity(intent);
    }

    public void csc4103(View view) {
        Intent intent = new Intent(this, CSC4103.class);
        startActivity(intent);
    }

    public void csc4102(View view) {
        Intent intent = new Intent(this, CSC4102.class);
        startActivity(intent);
    }

    public void csc4101(View view) {
        Intent intent = new Intent(this, CSC4101.class);
        startActivity(intent);
    }
}
