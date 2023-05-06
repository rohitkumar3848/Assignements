package Assignment3;

import java.util.Scanner;

public class A05Armstrong {
    public static int checkArmstrong(int num,int digits){
        if(num==0){
            return 0;
        }
        return (int)Math.pow((num%10),digits)+checkArmstrong(num/10, digits);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digits=(int)Math.floor(Math.log10(num)+1);
        int arm=checkArmstrong(num, digits);
        if(arm==num)
        {
            System.out.println("Entered number is Armstrong");
        }
        else{
            System.out.println("Entered number is not Armstrong");
        }
    }
}
