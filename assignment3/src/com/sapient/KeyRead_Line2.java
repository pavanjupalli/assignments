package com.sapient;

import java.util.Scanner;

public class KeyRead_Line2 {
    private int[] data;

    public void readData(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for(int i =0;i<size;i++){
            data[i]=scanner.nextInt();
        }
    }

    public void displayData(){
        System.out.println(data);
    }

    public void sort(){
        for(int i=1;i<data.length;i++){
            int max = data[0],index=0;
            for(int j =1;j<data.length;j++){
                if(max<data[i]){
                    index = i;
                    max= data[i];
                }
            }
            data[index] = data[data.length-i];
            data[data.length-i]=max;
        }
        System.out.println(data);
    }

    public void search(int n){

        for (int i=0;i<data.length;i++){
            if(data[i]==n){
                System.out.println("found the element");
                return;
            }
        }
        System.out.println("element is not found");
    }





}
