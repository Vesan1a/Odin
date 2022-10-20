package com.samsung;

public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[5][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);

            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i] + " ");

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j){
                    System.out.println(arr[i][j] + " ");
                    break;
                }


    }
}
