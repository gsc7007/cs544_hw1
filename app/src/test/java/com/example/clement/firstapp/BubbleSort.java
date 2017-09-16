package com.example.clement.firstapp;

/**
 * Created by Clement on 9/7/2017.
 */

public class BubbleSort {

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
