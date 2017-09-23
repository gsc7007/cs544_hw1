package com.example.clement.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

import static android.R.attr.button;

public class DisplayMessageActivity extends AppCompatActivity {

    private TextView text1;
    private TextView text3;
    MainActivity newActivity = new MainActivity();
    List<String> list = new ArrayList<>();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


        StringBuilder builder = new StringBuilder();



        int counter = 1;
        List<Integer>myList = newActivity.list;
        int listAmt = newActivity.list.size();
        for (int i = 0; i <= listAmt; i++) {

            for (int j = 0; j < listAmt - i - 1; j++) {

                if(i==0 && j ==0){
                    builder.append("Unsorted ");
                    for (int k = 0; k < listAmt; k++) {
                        builder.append(myList.get(k));
                        builder.append("  ");
                    }
                    list.add(builder.toString());
                    builder.setLength(0);
                }


                builder.append("Step ");
                builder.append(counter);
                builder.append("      ");
                counter++;




                if (myList.get(j) > myList.get(j + 1)) {
                    int temp = myList.get(j);
                    myList.set(j, myList.get(j + 1)); //swaps position of j with j+1
                    myList.set(j + 1, temp);


                }

                for (int k = 0; k < listAmt; k++) {
                    builder.append(myList.get(k));
                    builder.append("  ");

                }
                list.add(builder.toString());
                builder.setLength(0);



            }


        }

        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);



    }



    @Override
    public void onBackPressed()
    {
        System.exit(0);
    }

    }


