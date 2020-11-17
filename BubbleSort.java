package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {11, 4, 7, 5, 9, 2};
        int arr1[] = bubbleSort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
    static int[] bubbleSort(int arr[]){
        int temp = 0;
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            flag = 0;
            for (int j =0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }



        }
        //System.out.println();

        return arr;
    }
}
