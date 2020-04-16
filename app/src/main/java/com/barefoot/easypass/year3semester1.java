package com.barefoot.easypass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class year3semester1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year3semester1);
        ActionBar actionBar= getSupportActionBar();
        if (actionBar != null) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0C84E6")));
        }

    }

    public void csc3107(View view) {
        Intent intent = new Intent(this, CSC3107.class);
        startActivity(intent);
    }

    public void csc3106(View view) {
        Intent intent = new Intent(this, CSC3106.class);
        startActivity(intent);
    }

    public void csc3105(View view) {
        Intent intent = new Intent(this, CSC3105.class);
        startActivity(intent);
    }

    public void csc3104(View view) {
        Intent intent = new Intent(this, CSC3104.class);
        startActivity(intent);
    }

    public void csc3103(View view) {
        Intent intent = new Intent(this, CSC3103.class);
        startActivity(intent);
    }

    public void csc3102(View view) {
        Intent intent = new Intent(this, CSC3102.class);
        startActivity(intent);
    }

    public void csc3101(View view) {
        Intent intent = new Intent(this, CSC3101.class);
        startActivity(intent);
    }
}
