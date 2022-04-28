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

import java.text.DateFormat;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class Report extends AppCompatActivity {
    TextView employee,hours,overtimeinfo,regularpay,overtimepay,overall;

    Variables numbers=new Variables();
    Methods payoff=new Methods();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_report);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        numbers.setName(intent.getStringExtra("keyName"));
        numbers.setEmployeeType(intent.getStringExtra("keyType"));
        numbers.setPart(intent.getDoubleExtra("keyHours", numbers.getPart()));


        employee = findViewById(R.id.Employee);
        hours = findViewById(R.id.HoursRendered);
        overtimeinfo = findViewById(R.id.Overtimehours);
        regularpay = findViewById(R.id.Regularpay);
        overtimepay = findViewById(R.id.Overtimepay);
        overall = findViewById(R.id.overallpay);

        double overtime = payoff.Effort(numbers.getPart());
        double Reg = payoff.Time(numbers.getEmployeeType(), numbers.getPart(), overtime);
        double otWage = payoff.Overwork(numbers.getEmployeeType(), overtime);
        double total = payoff.Total(Reg, otWage);


        employee.setText(numbers.getName() + " (" + numbers.getEmployeeType() + ")");
        hours.setText("Hours rendered: " + numbers.getPart());
        overtimeinfo.setText("Overtime hours: " + overtime);
        regularpay.setText("Regular Wage: " + Reg);
        overtimepay.setText("Overtime wage: " + otWage);
        overall.setText(String.valueOf(total));
    }
}
