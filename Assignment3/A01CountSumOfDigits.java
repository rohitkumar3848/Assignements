package Assignment3;
import java.util.*;

public class A01CountSumOfDigits {
    public static int SumOfDigit(int num){
        if(num==0){
            return 0;
        }
        else{
            return num%10+SumOfDigit(num/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("The sum of digits of number "+num+" is:"+SumOfDigit(num));
    }
}
