package com.example.bmicalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // public static final String extra_number="com.example.bmicalci.example.extra_number";
    public void calci(View view){
        EditText a=findViewById(R.id.editText);
      String a1=  a.getText().toString();
        EditText b= findViewById(R.id.editText2);
      String b1=  b.getText().toString();
        int weight=Integer.parseInt(a1);
        double height=Double.parseDouble(b1)*0.305;
        double heightSquare=height*height;
        double bmi=weight/heightSquare;
        //Toast.makeText(getApplicationContext(),"bmi is!!"+bmi,Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,BmiIS.class);
        intent.putExtra("bmi",bmi);
        startActivity(intent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
