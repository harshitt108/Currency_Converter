package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view){
        Log.i("Info","Button pressed");

        EditText editText =(EditText) findViewById(R.id.editText);

        String amountInDollars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInRupeesDouble = amountInDollarsDouble * 75.98;

        String amountInRupeesString = String.format("%2f",amountInRupeesDouble);

        Toast.makeText(this,"$  "+ amountInDollars+"  is Rs "+amountInRupeesString,Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
