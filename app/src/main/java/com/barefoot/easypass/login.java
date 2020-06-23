package com.barefoot.easypass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class login extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Spinner spinner;
    Spinner spinner2;
    TextView warn1;
    TextView warn2;
    String text;
    String text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar= getSupportActionBar();
        if (actionBar != null) {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0C84E6")));
        }

        warn1=findViewById(R.id.txt1);
        warn2=findViewById(R.id.txt2);
        spinner=findViewById(R.id.sp);
        spinner2=findViewById(R.id.sp2);
        Button button=findViewById(R.id.bt);
        button.setOnClickListener(this);

        //here i created an adapter to load the item into the first spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.level,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //here i attached the adapter i had created to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        //here i created an adapter to help load the item into the second spinner
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.semesters
                ,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //here i attached the adapter i had created to the spinner
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View view) {

        //real code below, delete the one above
        if(text.equals("100 LEVEL") && text2.equals("First Semester")){
            Intent intent = new Intent(this, year1semester1.class);
            startActivity(intent);
            Delete();

        }else if(text.equals("100 LEVEL")&& text2.equals("Second Semester")){
            Intent intent1 = new Intent(this, year1semester2.class);
            startActivity(intent1);
            Delete();
        }else if(text.equals("200 LEVEL")&& text2.equals("First Semester")){
            Intent intent1 = new Intent(this, year2semester1.class);
            startActivity(intent1);
            Delete();
        }else if(text.equals("200 LEVEL")&& text2.equals("Second Semester")){
            Intent intent1 = new Intent(this, year2semester2.class);
            startActivity(intent1);
            Delete();

        }else if(text.equals("300 LEVEL")&& text2.equals("First Semester")){
            Intent intent1 = new Intent(this, year3semester1.class);
            startActivity(intent1);
            Delete();

        }else if(text.equals("300 LEVEL")&& text2.equals("Second Semester")){
            Intent intent1 = new Intent(this, year3semester2.class);
            startActivity(intent1);
            Delete();
        }else if(text.equals("400 LEVEL")&& text2.equals("First Semester")){
            Intent intent1 = new Intent(this, year4semester1.class);
            startActivity(intent1);
            Delete();
        }else if(text.equals("400 LEVEL")&& text2.equals("Second Semester")){
            Intent intent1 = new Intent(this, year4semester2.class);
            startActivity(intent1);
            Delete();

        }else if(text.equals("SELECT LEVEL")&& text2.equals("SELECT SEMESTER")){
            warn1.setText(R.string.caution1);
            warn2.setText(R.string.caution2);
        }
        else if(text.equals("SELECT LEVEL")){
            warn1.setText(R.string.caution1);
        }else if(text2.equals("SELECT SEMESTER")){
            warn2.setText(R.string.caution2);
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        text2 = spinner2.getSelectedItem().toString();
        text = spinner.getSelectedItem().toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void Delete(){
        spinner.setSelection(0);
        spinner2.setSelection(0);
        warn1.setText("");
        warn2.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.m1:
                Intent intent = new Intent(this,about.class);
                startActivity(intent);
        }
        return true;
    }
}
