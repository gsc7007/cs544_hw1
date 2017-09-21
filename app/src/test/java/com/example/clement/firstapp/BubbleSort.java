package com.example.clement.firstapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




/**
 * Created by Clement on 9/7/2017.
 */



public class BubbleSort extends AppCompatActivity{

    private static final String TAG = "BubbleSort";
    private Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button) findViewById(R.id.button3);

        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "onClick: welcome!");

            }
        });


    }




    void bubblesort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+i] = temp;
            }
    }



}
