package com.example.zacarias_wagecalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zacarias_wagecalculator.Model.Variables;
import com.example.zacarias_wagecalculator.R;

public class WageInfo extends AppCompatActivity implements View.OnClickListener{
    EditText employee,hourinfo;
    Button btnregular,btnpartime,btnprobitionary,btnnext,goback;
    TextView typeofemployee;
    Variables numbers=new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wage_info);

        btnregular = findViewById(R.id.btnregular);
        btnprobitionary = findViewById(R.id.btnprobitionary);
        btnpartime = findViewById(R.id.btnpartime);
        btnnext = findViewById(R.id.btncalculate);
        employee = findViewById(R.id.employeeinfo);
        hourinfo = findViewById(R.id.hourinfo);
        typeofemployee = findViewById(R.id.choose);

        //set listeners here
        btnregular.setOnClickListener(this);
        btnprobitionary.setOnClickListener(this);
        btnpartime.setOnClickListener(this);
        btnnext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnregular:
                numbers.setEmployeeType("Regular");
                typeofemployee.setText("Employee type: Regular");
                break;
            case R.id.btnprobitionary:
                numbers.setEmployeeType("Probationary");
                typeofemployee.setText("Employee type: Probationary");
                break;
            case R.id.btnpartime:
                numbers.setEmployeeType("Part time");
                typeofemployee.setText("Employee type: Part-time");
                break;
            case R.id.btncalculate:
                if (numbers.getEmployeeType() == "") {
                    Toast.makeText(WageInfo.this, "Enter the fields that required", Toast.LENGTH_SHORT).show();
                } else {
                    numbers.setName(String.valueOf(typeofemployee.getText()));
                    numbers.setPart(Double.parseDouble(hourinfo.getText().toString()));


                    Intent intent = new Intent(this, Report.class);
                    intent.putExtra("Name", numbers.getName());
                    intent.putExtra("Type", numbers.getEmployeeType());
                    intent.putExtra("Hours", numbers.getPart());
                    startActivity(intent);
                }
                break;
        }
    }
}
