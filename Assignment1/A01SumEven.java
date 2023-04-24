package Assignment;

public class A01SumEven {
    public static int Sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    sum+=arr[i];
                }
        }
        return sum;
    }   
    public static int  Maximum(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        //Even Number Sum-->
        int res=Sum(arr);
        System.out.println(res);
        //Print Even Number using for each loop-->
        int i=0;
        for(int number:arr){
            if(i%2==0){
                System.out.print(number+" ");
            }
            i++;
        }
        //Maximum-->
        int max=Maximum(arr);
        System.out.println(max);
    }
}
