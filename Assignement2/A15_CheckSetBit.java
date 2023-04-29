package Assignement2;

import java.util.Scanner;

public class A15_CheckSetBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=0;
        while(num!=0){
            // if((num%2)!=0){
            //     res++;
            // }
            // num/=2;
            //OR
            res+=(num&1);
            num=num>>1;
        }
        System.out.println("The number of set bits in the number is :: "+res);
    }
}
