package Assignement2;

public class A09_CountPassBubbleSort {
    public static int  bubbleSort(int arr[]){
        int pass=0;
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
                
            }
            pass++;
            if(!swapped){
                return pass;
            }
        }
        return pass;
    }
    public static void main(String[] args) {
        int arr[]={26,3,0,5};
        int x=bubbleSort(arr);
        // for (int i : arr) {
        //     System.out.println(i);
        // }
        System.out.println("The no pass required to sort an array::"+x);
    }
}
