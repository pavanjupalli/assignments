package assignment4;

import assignment5.Console;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = Console.scanner;

        //adding operation
        NumProcess addProcess = (int a, int b)->{
          return a+b;
        };

        NumProcess subProcess = (int a, int b)->{
            return a-b;
        };

        NumProcess mulProcess = (int a,int b)->{
          return a*b;
        };

        NumProcess divideProcess = (int a, int b)->{
            return a/b;
        };

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(addProcess.cal(a,b));
        System.out.println(subProcess.cal(a,b));
        System.out.println(mulProcess.cal(a,b));
        System.out.println(divideProcess.cal(a,b));

    }
}
