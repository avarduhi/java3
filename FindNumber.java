package com.company;

/*Գրել մեթոդ, որը ստանում է զանգված և նրա երկարությունը որպես input արժեքներ։ Գտնել զանգվածի այն էլեմենտը,
որի վրա բաժանվում են մնացած բոլոր էլեմենտները։ Եթե այդպիսին չկա, վերադարձնել -1:*/

public class Main {
    public static void main(String[] args) {
    	int[] arr = {15, 33, 3, 12, 48};
    	int num1 = findNumber(arr, arr.length);
    	System.out.println(num1);
		int[] arr1 = {4, 32, 30, 7, 8};
		int num2 = findNumber(arr1, arr.length);
		System.out.println(num2);
	}
	static int findNumber(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] % arr[i] == 0) {
					count += 1;
					if (count == n) {
						return arr[i];
					}
				} else {
					count = 0;
				}
			}
		}
		return -1;}
}

