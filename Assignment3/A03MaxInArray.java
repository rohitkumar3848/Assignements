package Assignment3;
public class A03MaxInArray {
    public static void maxElement(int arr[],int idx,int max){
        if(idx==arr.length-1){
            System.out.println("The maximum element in array is :"+max);
            return ;
        }
        if(max<arr[idx]){
            max=arr[idx];
        }
        maxElement(arr,idx+1,max);
    }
    public static void main(String[] args) {
        int arr[]={1,61,31,41,2,3};
        int max=arr[0];
        int idx=0;
        maxElement(arr,idx,max);
    }
}
