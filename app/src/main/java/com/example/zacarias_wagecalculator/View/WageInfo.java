package com.example.zacarias_wagecalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zacarias_wagecalculator.R;

public class WageInfo extends AppCompatActivity implements View.OnClickListener{
    EditText employee,hours;
    Button regular,partime,probitionary,next;
    TextView typeofemployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wage_info);

        employee =findViewById(R.id.Employeeinfo);
        hours=findViewById(R.id.hourinfo);
        regular=findViewById(R.id.Worker);
        partime=findViewById(R.id.Parttime);
        probitionary=findViewById(R.id.Employee);
        next=findViewById(R.id.Calculate);
        typeofemployee=findViewById(R.id.Choose);

        regular.setOnClickListener(this);
        partime.setOnClickListener(this);
        probitionary.setOnClickListener(this);
        next.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

        }
    }
}