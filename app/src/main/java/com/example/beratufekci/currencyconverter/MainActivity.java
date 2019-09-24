package com.example.beratufekci.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyConverter(View view){

        EditText currency = (EditText) findViewById(R.id.currencyField);


        double x = Double.parseDouble(currency.getText().toString());

        double poundAmmount = x*(0.88);



        Toast.makeText(MainActivity.this,"€" + String.format("%.2f", poundAmmount) , Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
