package Assignment3;
import java.util.*;
public class A02SumOfAlternateSeries {
    public static int alternateSeries(int num){
        //base case condition--->
        if(num==0){
            return 0;
        }
        //If number is even we subtract from previous sum-->
        else if(num%2==0){
            return alternateSeries(num-1)-num;
        }
        //If number is odd we add with previous sum-->
        else{
            return alternateSeries(num-1)+num;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The sum of alternate series of number "+num+" is:"+alternateSeries(num));
    }
}
