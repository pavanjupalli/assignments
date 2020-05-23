package com.sapient;

import java.util.Scanner;

public class Execute {

    public static void main(String[] args) {

        int[] data = new int[args.length];
        for(int i=0;i<args.length;i++){
            data[i] = Integer.valueOf(args[i]);
        }

        Command_Line1 command_line1 = new Command_Line1();
        command_line1.setData(data);
        command_line1.displayData();
        command_line1.calAvgSumMaxMin();




        KeyRead_Line2 keyRead_line2 = new KeyRead_Line2();
        keyRead_line2.readData();
        keyRead_line2.displayData();
        keyRead_line2.sort();

        Scanner scanner = new Scanner(System.in);
        keyRead_line2.search(scanner.nextInt());


        String words="";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };


        long num;
        num = scanner.nextLong();

        if ((num / 10000000) > 0) {
            words += num / 10000000 + " crore ";
            num %= 10000000;
        }
        if ((num / 100000) > 0) {
            words += num / 100000 + " lakh ";
            num %= 100000;
        }

        if ((num / 1000) > 0) {
            words += num / 1000 + " thousand ";
            num %= 1000;
        }

        if ((num / 100) > 0) {
            words += num / 100 + " hundred ";
            num %= 100;
        }

        if ((num / 10) > 2) {
            words += tensArray[(int) num/10];
            num %= 10;
        }
        words+=unitsArray[(int)num];

        System.out.println(words);
    }
}
