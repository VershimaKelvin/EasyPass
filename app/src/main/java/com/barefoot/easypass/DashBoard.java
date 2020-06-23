package com.barefoot.easypass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class DashBoard extends AppCompatActivity {

    LinearLayout pastquestionsView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        ActionBar actionbar=getSupportActionBar();
        actionbar.hide();

        pastquestionsView=findViewById(R.id.pastquestionsView);

        pastquestionsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this, login.class);
                startActivity(intent);
            }
        });
    }
}
