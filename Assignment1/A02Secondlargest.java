package Assignment;
import java.util.*;

public class A02Secondlargest {
    /*public static void uniqueelements(int arr[]){
        int i=0,j=0;
        for(i=0;i<arr.length;i++){
            for(j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    break;
                }
            }
            if(i==j){
                System.out.println(arr[i]+" ");
            }
        }
    }*/
    //Approach1-->
    public static void  SecondLargest(int arr[]){
        int fl=0;
        int sl=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[fl]){
                sl=fl;
                fl=i;
            }
            else if(arr[fl]>arr[i]){
                if(sl==-1 || arr[sl]<arr[i]){
                    sl=i;
                }
            }
        }
        System.out.println("The second largest element is:"+arr[sl]);
    }
    //Approach 2-->
    public static void SecondLargest2(int arr[]){
        int fl=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>fl){
                fl=arr[i];
            }
        }
        int sl=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sl && arr[i]<fl){
                sl=i;
            }
        }
        System.out.println("");
        System.out.println("The second largest element is:"+arr[sl]);
    }
    //Approach3-->
    public static void SecondLargest3(int arr[]){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
    public static void main(String[] args) {
        int arr[]={1,3,3,2,2,5,4,4};
        //uniqueelements(arr);
        SecondLargest(arr);
        SecondLargest2(arr);
        SecondLargest3(arr);
    }
}
