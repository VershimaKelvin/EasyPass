package com.barefoot.easypass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MTH1202 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mth1202);

        ActionBar actionBar =getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("MTH1202.pdf").load();
    }
}
