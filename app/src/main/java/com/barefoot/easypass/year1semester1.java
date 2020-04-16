package com.barefoot.easypass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class year1semester1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year1semester1);

        ActionBar actionBar= getSupportActionBar();
        if (actionBar != null) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0C84E6")));
        }

    }

    public void css1101(View view) {
        Intent intent = new Intent(this, CSC1101.class);
        startActivity(intent);
    }

    public void mth1101(View view) {
        Intent intent = new Intent(this, MTH1101.class);
        startActivity(intent);
    }

    public void gss1102(View view) {
        Intent intent = new Intent(this, GSS1102.class);
        startActivity(intent);
    }

    public void gss1101(View view) {
        Intent intent = new Intent(this, GSS1101.class);
        startActivity(intent);
    }

    public void gss1103(View view) {
        Intent intent = new Intent(this, GSS1103.class);
        startActivity(intent);
    }

    public void bio1101(View view) {
        Intent intent = new Intent(this, BIO1101.class);
        startActivity(intent);
    }

    public void chm1101(View view) {
        Intent intent = new Intent(this, CHM1101.class);
        startActivity(intent);
    }

    public void phy1104(View view) {
        Intent intent = new Intent(this, PHY1104.class);
        startActivity(intent);
    }

    public void phy1101(View view) {
        Intent intent = new Intent(this, PHY1101.class);
        startActivity(intent);
    }
}
