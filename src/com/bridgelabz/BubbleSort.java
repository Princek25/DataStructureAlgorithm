package com.bridgelabz;

public class BubbleSort {
    public static void main(String[] args) {
        int [] num = {34, 65, 25, 39, 21, 67, 45};
        System.out.println("The Original Sequence is : -\n ");
        for (int i=0; i<num.length; i++){
            System.out.print(num[i]+ ", ");
        }
        System.out.println();
        Sort(num);
    }
    public static void Sort(int[] ar){
        int temp;
        for (int i=ar.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }

            }

        }
        System.out.print("The New Sequence : -\n ");
        for (int i=0; i<ar.length; i++){
            System.out.print(ar[i]+", ");
        }
        System.out.println();
    }
}
