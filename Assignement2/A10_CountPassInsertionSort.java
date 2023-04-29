package Assignement2;

public class A10_CountPassInsertionSort {
    public static int insertionSort(int arr[]){
        int j;
        int pass=0,count=0;
        for(int i=0;i<arr.length;i++){
            j=i;
            while(j>0 && arr[j]>arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
                count=1;
            }
            if(count==1){
                pass++;
            }
        }
        return pass;
    }
    public static void main(String[] args) {
        int arr[]={10,40,30,20,50};
        int x=insertionSort(arr);
        // for (int i : arr) {
        //     System.out.println(i);
        // }
        System.out.print("The number pass required to sort elements is:"+x);
    }
}
