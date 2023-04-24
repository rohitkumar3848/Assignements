package Assignment;

public class A03PeakElement {
    public static int peakElement(int arr[]){
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(arr[0]>=arr[1]){
            return 0;
        }
        if(arr[n-1]>=arr[n-2]){
            return n-1;
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                return i;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,4,7,3,2,6,5};
        System.out.println("Index of Peak element is : "+peakElement(arr));
    }
}
