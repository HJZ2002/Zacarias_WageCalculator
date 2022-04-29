package com.example.zacarias_wagecalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.zacarias_wagecalculator.Controller.Methods;
import com.example.zacarias_wagecalculator.Model.Variables;
import com.example.zacarias_wagecalculator.R;

public class Report extends AppCompatActivity {
    TextView employee,hours,overtimeinfo,regularpay,overtimepay,overall;


    Variables numbers=new Variables();
    Methods methods=new Methods();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_report);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        numbers.setName(intent.getStringExtra("Name"));
        numbers.setEmployeeType(intent.getStringExtra("Type"));
        numbers.setPart(intent.getDoubleExtra("Hours", numbers.getPart()));



        employee = findViewById(R.id.employee);
        hours = findViewById(R.id.hoursrendered);
        overtimeinfo = findViewById(R.id.overtimehours);
        regularpay = findViewById(R.id.regularpay);
        overtimepay = findViewById(R.id.overtimepay);
        overall = findViewById(R.id.overallpay);

        double part = methods.solveEF(numbers.getPart());
        double regular = methods.solveRegular(numbers.getEmployeeType(), numbers.getPart(), part);
        double overtime = methods.solveTime(numbers.getEmployeeType(), part);
        double all = methods.solveTotal(part, overtime);


        employee.setText(numbers.getName() + " (" + numbers.getEmployeeType() + ")");
        hours.setText("Hours rendered: " + numbers.getPart());
        overtimeinfo.setText("Overtime hours: " + part);
        regularpay.setText("Regular Wage: " + regular);
        overtimepay.setText("Overtime wage: " + all);
        overall.setText(String.valueOf(all));
    }
}
