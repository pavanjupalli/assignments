package assignment4;

import assignment5.Console;

import java.util.Scanner;

public class IntegerArrProcess {

    private Integer[] integerArray;

    public IntegerArrProcess(){
        integerArray = new Integer[10];
    }

    public IntegerArrProcess(Integer size) {
        integerArray = new Integer[size];
    }

    public IntegerArrProcess(Integer[] integerArray) {
        this.integerArray = integerArray;
    }

    public IntegerArrProcess(IntegerArrProcess integerArrProcess){
        integerArray = integerArrProcess.integerArray;
    }

    public void readArray(){
        Scanner scanner = Console.scanner;
        for(int i=0;i<10;i++){
            integerArray[i] = scanner.nextInt();
        }
    }

    public void displayHorAndVert(){

        System.out.println("printing horizontally");
        for(int i=0;i<integerArray.length;i++){
            System.out.print(integerArray[i]+" ");
        }
        System.out.println("printing vertically:");
        for(int i=0;i<integerArray.length;i++){
            System.out.println(integerArray[i]+" ");
        }
    }

    public void findMaxAndMin(){
        int max = integerArray[0];
        int min = integerArray[0];
        for(int i =1;i<integerArray.length;i++){
            max = max<integerArray[i]?integerArray[i]:max;
            min = min>integerArray[i]?integerArray[i]:min;
        }
        System.out.println("max: "+ max +", min: "+ min);
    }

    public void findSum(){
        int sum =0;
        for(int i=0;i<integerArray.length;i++){
            sum = sum + integerArray[i];
        }
        System.out.println("finding sum: " + sum);
    }

    public void findSecondMax(){
        int max = integerArray[0]>integerArray[1]?integerArray[0]:integerArray[1];
        int max1 = integerArray[0]<integerArray[1]?integerArray[0]:integerArray[1];
        for(int i=2;i<integerArray.length;i++){
            if(max<=integerArray[i]){
                max1 = max;
                max = integerArray[i];
            }
        }
        if(max1==max)
            System.out.println("yes, there is a second biggest");

    }
}
