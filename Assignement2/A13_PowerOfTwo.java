package Assignement2;

import java.util.Scanner;

public class A13_PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        for(int i=0;i<=num/4;i++){
            double x=java.lang.Math.pow(2,i);
            if(num==x){
                System.out.println("The number is power of two");
                flag=1;
                break;
            } 
        }
        if(flag==0){
            System.out.println("The number is not power of two");
        }  
    }
    
}
