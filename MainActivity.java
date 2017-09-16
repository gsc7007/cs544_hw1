package com.example.clement.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements View.OnClickListener {

    List<Integer> List = new ArrayList<Integer>();
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
    int status = 2;
    @Override
    public void onClick(View view) {


        Button button = (Button) findViewById(R.id.button3);


        button.setText("x");

        TextView Text1 = (TextView) findViewById(R.id.Text1);
        int number1 = Integer.valueOf(Text1.getText().toString());
        String t1 = Text1.toString();
        String tt = String.format("%d",number1);
        List.add(number1);

        button.setText(tt);

        }

    }




