package com.example.bmicalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HealthStatus extends AppCompatActivity {
    public static int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_status);
        double data=getIntent().getDoubleExtra("data",0);
        TextView textView=findViewById(R.id.textView3);
           if(data<=18.5){
               textView.setText("underweight");
               a=1;

           }else if(data>18.5&&data<=24.9){
               textView.setText("normal");
               a=2;

           }else if(data>25&&data<=29.9){
               textView.setText("overWeeight");
               a=3;
           }else {
               textView.setText("obese");
               a=4;

           }

    }
    public void diet(View view){
        Intent intent=new Intent(getApplicationContext(),DietSuggestion.class);
        intent.putExtra("status",a);
        startActivity(intent);
    }
}
