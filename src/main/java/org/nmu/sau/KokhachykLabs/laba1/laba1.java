package org.nmu.sau.KokhachykLabs.laba1;


import java.util.Scanner;

public class laba1 {

    public static void main(String[] args) {

        System.out.println("\nHello my first java project\n");
        System.out.println("Please enter the elements:\n");
        int arr[][] = new int[3][3];
        //  Random rand = new Random();
        Scanner el=new Scanner (System.in);
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[1].length; j++){
                arr[i][j] = el.nextInt();
            }
        }

        System.out.println("Array:\n");
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        int maxElement = arr[0][0], minElement = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                sum += arr[i][j];
                if(arr[i][j] > maxElement){
                    maxElement = arr[i][j];
                }

                if(arr[i][j] < minElement){
                    minElement = arr[i][j];
                }
            }
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Max:" + maxElement);
        System.out.println("Min:" + minElement);
    }
}