package com.example.bmicalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BmiIS extends AppCompatActivity {
    public static double data;

    public void pre(View view){

        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
     public void healthStatus(View view){
           Intent intent=new Intent(this,HealthStatus.class);
           intent.putExtra("data",data);
           startActivity(intent);
     }



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_is);
        Intent intent=getIntent();
         data=intent.getDoubleExtra("bmi",0);
        TextView textView=(TextView) findViewById(R.id.textView2);
        textView.animate().rotation(360).setDuration(5500).start();
        textView.setText("bmi is!!" +data);

    }
}
