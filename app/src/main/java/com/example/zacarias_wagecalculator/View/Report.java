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
    Methods payoff=new Methods();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_report);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        numbers.setName(intent.getStringExtra("Name"));
        numbers.setEmployeeType(intent.getStringExtra("type"));
        numbers.setPart(intent.getDoubleExtra("hours", numbers.getPart()));


        employee = findViewById(R.id.employee);
        hours = findViewById(R.id.hoursrendered);
        overtimeinfo = findViewById(R.id.overtimehours);
        regularpay = findViewById(R.id.regularpay);
        overtimepay = findViewById(R.id.overtimepay);
        overall = findViewById(R.id.overallpay);

        double salary = payoff.effort(numbers.getPart());
        double input = payoff.time(numbers.getEmployeeType(), numbers.getPart(), salary);
        double display = payoff.overwork(numbers.getEmployeeType(), salary);
        double total = payoff.total(input, display);


        employee.setText(numbers.getName() + " (" + numbers.getEmployeeType() + ")");
        hours.setText("total Hours rendered: " + numbers.getPart());
        overtimeinfo.setText("total Overtime hours: " + display);
        regularpay.setText("total Regular Wage: " + input);
        overtimepay.setText("total Overtime wage: " + display);
        overall.setText(String.valueOf(total));
    }
}
