package com.consultadd.fridaytask1;

import java.util.Scanner;

public class FridayTaskOne {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FridayTaskOne f1 = new FridayTaskOne();
        //f1.starPattern();
        f1.numberPattern();
    }

    public void starPattern(){
        System.out.println("Enter the number of rows");
        int num_rows = scanner.nextInt();

        for(int i=1;i<=num_rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void numberPattern(){
        System.out.println("Enter the number of rows");
        int num_rows = scanner.nextInt();
        for(int i=1;i<=num_rows;i++){
            for(int k=1; k<=num_rows-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
