package Assignement2;

//Time Complexity:O(log(n))
//Space Complexity:O(1)
import java.util.Scanner;
public class A04_CountDuplicates {
    public static int lastOcuurence(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                res=mid;
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public static int firstOcuurence(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                res=mid;
                high=mid-1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
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
        System.out.println("Enter the element you want to find how many times it is comes : ");
        int s=sc.nextInt();
        int res1=firstOcuurence(arr,s);
        int res2=lastOcuurence(arr,s);
        int result=res2-res1+1;
        System.out.println("The element "+s+" present in array "+result);
    }
}

