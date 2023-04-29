package Assignement2;

public class A07_InsertionSortDesc {
    public static void insertionSort(int arr[]){
        int j;
        for(int i=0;i<arr.length;i++){
            j=i;
            while(j>0 && arr[j]>arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,2,5,2,6,1};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
