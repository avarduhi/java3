package com.company;
//Առաջադրանք 3: իմպլանտացնել reverse(int a[], int n) մեթոդը։(n-ը զանգվածի երկարությունն է)
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {2, 3, 4, 5, 6, 7};
        reverse(arr, arr.length);

    }

    static void reverse(int a[], int n) {
        for (int i = n-1; i>=0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
