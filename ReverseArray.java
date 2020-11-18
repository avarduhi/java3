package com.company;
//Առաջադրանք 3: իմպլանտացնել reverse(int a[], int n) մեթոդը։(n-ը զանգվածի երկարությունն է)
//Փոփոխած տարբերակ
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {2, 3, 4, 5, 6, 7};
        int[] arr1 = reverse(arr, arr.length);
        for(int value: arr1){
            System.out.print(value + " ");
        }

    }

    static int[] reverse(int a[], int n) {
        int[] newA= new int[n];
        for (int i=0; i<n; i++) {
            newA[i] = a[n-i-1];
        }
        return newA;
    }
}





/*
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
*/
