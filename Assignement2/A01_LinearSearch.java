package Assignement2;
import java.util.Scanner;
//Time Complexity:O(n)
//Space Complexity:O(1)
public class A01_LinearSearch{ 
    public static int linearSearch(int arr[],int s){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==s){
                return i;
            }
        }
        return-1;
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
        System.out.println("Enter the element you want to search : ");
        int s=sc.nextInt();
        int ans=linearSearch(arr, s);
        if(ans>0){
            System.out.println("The element is present in array at position :"+ans);
        }
        else{
            System.out.println("Element in array is not found");
        }
        
    }
}
