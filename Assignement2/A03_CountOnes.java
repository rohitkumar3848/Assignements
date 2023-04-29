package Assignement2;

//Time Complexity:O(log(n))
//Space Complexity:O(1)
import java.util.Scanner;
public class A03_CountOnes {
    public static int countOnes(int arr[]){
        int low=0;
        int high=arr.length-1;
        int res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==1){
                res=mid;
                high=mid-1;
            }
            else if(arr[mid]<1){
                high=mid-1;
            }
            // else{
            //     high=mid-1;
            // }
        }
        int ans=arr.length-res;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the elements in an array :");
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=countOnes(arr);
        System.out.println("The number of One's in an array are:"+res);
    }
}

