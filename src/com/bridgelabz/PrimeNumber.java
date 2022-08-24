package com.bridgelabz;
import java.util.ArrayList;

public class PrimeNumber {
    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        final int INITIAL=0;
        final int FINAL=1000;
        primePrint(INITIAL, FINAL);
    }
    private static void primePrint(int i, int f){
        System.out.println("Prime Numbers are in between" + i +"and" + f + "are :");
        for (int range=i;range<=f;range++){
            if (isPrime(range)){
                arrayList.add(range);
            }
        }
        System.out.println(arrayList);
    }
    public static boolean isPrime(int num){
        int a=0;
        if (num==0 || num==1)
            return false;
        for (int i = 2;i<=num/2;++i){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
