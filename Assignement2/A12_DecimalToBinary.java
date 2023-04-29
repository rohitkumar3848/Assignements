package Assignement2;

import java.util.Scanner;
import java.lang.Math;

public class A12_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int d,i=0;
        double res=0;
        while(num>0){
            d=num%2;
            res=res+java.lang.Math.pow(10,i)*d;
            num/=2;
            i++;
        }
        int res1=(int)res;
        System.out.println(res1);


    }
}
