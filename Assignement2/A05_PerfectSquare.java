package Assignement2;

public class A05_PerfectSquare {
    public static boolean SquareRoot(int num){
        int low=0;
        int high=num;
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=mid*mid;
            if(val==num){
                return true;
            }
            else if(val<=num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        if(SquareRoot(36)){
            System.out.println("The number is perfect square ");
        }
        else{
            System.out.println("The number is not perefect square");
        }
    }
}
