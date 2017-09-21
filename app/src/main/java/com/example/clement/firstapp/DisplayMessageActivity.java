package com.example.clement.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.button;

public class DisplayMessageActivity extends AppCompatActivity {

    private TextView text1;
    private TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        List<String> list = new ArrayList<>();



        MainActivity newActivity = new MainActivity();



        StringBuilder builder = new StringBuilder();
        for(int i=0; i <= newActivity.list.size()-1; ++i)
        {
            builder.append(newActivity.list.get(i));
            builder.append("  ");

        }

        list.add(builder.toString());










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





/*
List<String> sList = new ArrayList<String>(newActivity.list.size());
        for(Integer myInt : newActivity.list){
                sList.add(Integer.toString(myInt));
                }


                StringBuilder builder = new StringBuilder();
                for (String details : sList)
                {
                builder.append(details);
                }

                List<Integer> lists = new ArrayList<>();

        for (int i = 0; i <= 8; i++)
        {
        lists.add(1);
        }


        StringBuilder builders = new StringBuilder();
        for (int i = 0 ; i <= 3; i++){
        builders.append(" ");
        }




        int l[] = {1,2,3};
        text3.setText((l[0]));
*/