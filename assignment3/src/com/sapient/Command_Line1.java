package com.sapient;

import java.util.Scanner;

public class Command_Line1 {

    int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    public void displayData(){
        System.out.println(data);
    }

    public void calAvgSumMaxMin(){
        int sum =data[0],max = data[0], min = data[0];
        for (int i =1;i<data.length;i++){
            sum+=data[i];
            max = max<data[i]?data[i]:max;
            min = min>data[i]?data[i]:min;
        }
        double avg = sum/data.length;
        System.out.println("Avg: "+ avg + " Sum: "+sum + " Max: "+ max+" Min: "+ min);
    }
}
