package com.company;
/* իմպլանտացնել areSame(int a, int b) մեթոդը, որը տպում է "Same", եթե թվերը նույնն են և "not Same",
 եթե նույնը չեն։ Խնդիրը լուծել bitwise օպերատորներով   */
public class Main {

    public static void main(String[] args) {
        System.out.println(areSame(7, 8));
        System.out.println(areSame(10, 10));
        System.out.println(areSame(-7, -7));
    }
    static String areSame(int a, int b){
        if((a^b)==0){
            return "Same";
        }else{
            return "not Same";
        }
    }
}
