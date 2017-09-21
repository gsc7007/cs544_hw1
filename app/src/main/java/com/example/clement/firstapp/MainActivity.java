package com.example.clement.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends Activity implements View.OnClickListener {

    static List<Integer> list = new ArrayList<Integer>();
    private Button myButton;
    private int one;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button) findViewById(R.id.button3);
        myButton.setOnClickListener(this); //this refers to onclick method
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onClick(View view) {




        Button button = (Button) findViewById(R.id.button3);


        button.setText("x");

        TextView Text1 = (TextView) findViewById(R.id.Text1);
        TextView Text2 = (TextView) findViewById(R.id.Text2);
        TextView Text3 = (TextView) findViewById(R.id.Text3);
        TextView Text4 = (TextView) findViewById(R.id.Text4);
        TextView Text5 = (TextView) findViewById(R.id.Text5);
        TextView Text6 = (TextView) findViewById(R.id.Text6);
        TextView Text7 = (TextView) findViewById(R.id.Text7);
        TextView Text8 = (TextView) findViewById(R.id.Text8);

        int number1 = 0;
        String num1 = "";
        int number2 = 0;
        String num2 = "";
        int number3 = 0;
        String num3 = "";
        int number4 = 0;
        String num4 = "";
        int number5 = 0;
        String num5 = "";
        int number6 = 0;
        String num6 = "";
        int number7 = 0;
        String num7 = "";
        int number8 = 0;
        String num8 = "";


        try {
            number1 = Integer.valueOf(Text1.getText().toString());
        }
        catch (NumberFormatException e){
            num1 = null;
        } try {
            number2 = Integer.valueOf(Text2.getText().toString());
        }
        catch (NumberFormatException e){
            num2 = null;
        } try {
            number3 = Integer.valueOf(Text3.getText().toString());
        }
        catch (NumberFormatException e){
            num3 = null;
        } try {
            number4 = Integer.valueOf(Text4.getText().toString());
        }
        catch (NumberFormatException e){
            num4 = null;
        } try {
            number5 = Integer.valueOf(Text5.getText().toString());
        }
        catch (NumberFormatException e){
            num5 = null;
        } try {
            number6 = Integer.valueOf(Text6.getText().toString());
        }
        catch (NumberFormatException e){
            num6 = null;
        } try {
            number7 = Integer.valueOf(Text7.getText().toString());
        }
        catch (NumberFormatException e){
            num7 = null;
        } try {
            number8 = Integer.valueOf(Text8.getText().toString());
        }
        catch (NumberFormatException e){
            num8 = null;
        }




        if(num1 == ""){
            list.add(number1);
        };
        if(num2 == ""){
            list.add(number2);
        };
        if(num3 == ""){
            list.add(number3);
        };
        if(num4 == ""){
            list.add(number4);
        };
        if(num5 == ""){
            list.add(number5);
        };
        if(num6 == ""){
            list.add(number6);
        };
        if(num7 == ""){
            list.add(number7);
        };
        if(num8 == ""){
        list.add(number8);
        };



        String t1 = Text1.toString();
        String tt = String.format("%s %s %s %s %s %s %s %s",number1,number2,number3,number4,number5,number6,
                number7, number8);


        int x = list.size();
        button.setText(tt);

        TextView error = (TextView)findViewById(R.id.textView);

        if(list.size()<2){
            error.setText("Error, please enter 2 or more input");
        }else if(number1<1||number1>9||number2<1||number2>9||number3<1||number3>9||number4<1||
                number4>9||number5<1||number5>9||number6<1||number6>9||number7<1||number7>9||number8<1||number8>9
        ){
            error.setText("Error, input values must be between 1 and 9");
        }
        else{
            Intent startActivity = new Intent(this, DisplayMessageActivity.class);
            startActivity(startActivity);
        }












        }

    }




