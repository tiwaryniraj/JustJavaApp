package com.example.niraj.justjavaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    Button button_inc, button_dec, button_order;
    CheckBox topping1, topping2;
    EditText name;
    TextView value,coffees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_inc = findViewById(R.id.inc);
        button_dec = findViewById(R.id.dec);
        button_order = findViewById(R.id.order);
        topping1 = findViewById(R.id.topping1);
        topping2 = findViewById(R.id.topping2);
        name = findViewById(R.id.name);
        value = findViewById(R.id.value);
        coffees = findViewById(R.id.coffees);
    }
    static int numberOfCoffees = 1;

    public void incrementOrder (View view){

        numberOfCoffees++;

        display(numberOfCoffees);
    }

    public void decrementOrder (View view){

        if(numberOfCoffees <= 1){
            Toast.makeText(getApplicationContext(),"Sorry can't order less!",Toast.LENGTH_SHORT).show();
        }
        else {
            numberOfCoffees--;
            display(numberOfCoffees);
        }
    }

    public void submitOrder (View view){

        displayPrice(numberOfCoffees * 5);
    }

    private void displayPrice ( int val){
        coffees.setText(NumberFormat.getCurrencyInstance().format(val));
    }

    private void display (int val){
        value.setText("" + val);
    }


}
