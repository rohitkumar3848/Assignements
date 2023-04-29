package Assignement2;

public class A16_ElemnetsOddTimesInArray {
    public static void elementOdd(int arr[]){
            boolean visited[]=new boolean[arr.length];
            int count;
            System.out.println("The number of array elments is repeated odd times are :: ");
            for(int i=0;i<arr.length;i++){
            count=0;
            visited[i]=false;
            if(visited[i]==true){
                continue;
            }
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            if(count%2!=0 &&count>1){
                System.out.println(arr[i]+" is repeted = "+count+"times.");
            }
        }


    }
    public static void main(String[] args) {
        int arr[]={1,1,1,3,2,2,4,4,5};
        elementOdd(arr);
    }
}
