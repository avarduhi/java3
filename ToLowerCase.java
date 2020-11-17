package com.company;
//Իմպլեմենտացնել String toLowerCase(String str) մեթոդը, առանց օգտագործելու ջավայի տվյալ մեթոդը։
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Մուտքագրեք տեքստը - ");
        Scanner kboard = new Scanner(System.in);
        String str = kboard.next();
        toLowerCAse(str);
    }
    static void toLowerCAse(String str){
        for(char c: str.toCharArray()){
            if(c>='A' || c<='Z'){
                c += 32;
            }
            System.out.print(c); //էստեղ չհասկացա, թե ինչի է միայն այն տառերը, որոնք մեծատառից փոքրատառ է դարձնում։

        }
    }

}
