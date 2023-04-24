package Assignment;
public class A042Dmatrix {
    public static void main(String[] args) {
        int arr[][]={ {1,2,-3},
                      {3,-6,8},
                      {4,6,0}};
        int a=0,b=0,c=0,d=0,e=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]>0){
                    a++;
                }
                else if(arr[i][j]<0){
                    b++;
                }
                else{
                    e++;
                }
                if(arr[i][j]%2==0){
                    c++;
                }
                else{
                    d++;
                }
            }
        }
        System.out.println("Number of positive numbers"+a);
        System.out.println("Number of negative numbers"+b);
        System.out.println("Number of even numbers"+c);
        System.out.println("Number of odd numbers"+d);
        System.out.println("Number of Zero "+e);
    }
}
