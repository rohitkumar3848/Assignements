package Assignement2;

//Time Complexity:O(n*n)
//Space Complexity:O(1)
public class A06_BuubleSortDesc {
    public static void bubbleSort(int arr[]){
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
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,2,5,2,6,1};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
