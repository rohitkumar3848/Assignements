package Assignement2;

public class A11_countPassSelection {
    public static int selectionSort(int arr[]){
        int curr_idx;
        int pass=0,count=0;
        for(int i=0;i<arr.length;i++){
            curr_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[curr_idx]<arr[j]){
                    curr_idx=j;
                }
                count=1;
            }
            if(curr_idx!=i){
                int temp=arr[curr_idx];
                arr[curr_idx]=arr[i];
                arr[i]=temp;
            }
            if(count==1){
                pass++;
            }
        }
        return pass-1;
    }
    public static void main(String[] args) {
        int arr[]={17,10,7,29,2};
        int x=selectionSort(arr);
        // for (int i : arr) {
        //     System.out.println(i);
        // }
        System.out.println("The no pass required to sort elments is ::"+x);

    }
}
