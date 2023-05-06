package Assignment3;
public class A04SumOfValuesOfArray {
    public static int sumOfElement(int arr[],int n){
        if(n<=0){
            return 0;
        }
        return arr[n-1]+sumOfElement(arr,n-1);
    }
    public static void main(String[] args) {
        int arr[]={1,61,31,41,2,3};
        int n=arr.length;
        int sum=sumOfElement(arr,n);
        System.out.println("The sum of elements present in array is : "+sum);
    }
}
