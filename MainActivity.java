package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHandler handler=new DBHandler(this,"empdb",null,1);
      //  handler.addEmployee(new Employee(10,"harry",33.3));
        handler.getEmployee(3);
        handler.close();
    }
}