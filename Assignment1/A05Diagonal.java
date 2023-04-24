package Assignment;

public class A05Diagonal {
    public static void main(String[] args) {
        int arr[][]={ {1,2,-3},
                      {3,-6,8},
                      {4,6,0}};
                      int i=0,j=0;
        //upper Diagonal-->
        /*for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++){
                if(i+j<arr.length-1){
                    System.out.println(arr[i][j]+" ");
                }
            }
        }*/
        //Diagonals-->
        /* 
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++){
                if(i==j || i+j==arr.length-1){
                    System.out.println(arr[i][j]+" ");
                }
                
            }
        }*/
        //Maximum Elememnt-->
        /* 
        int max=arr[0][0];
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("The maximum element is :"+max);
        */
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++){
                if(i==arr.length/2 ||j==arr.length/2){
                    System.out.println(arr[i][j]+" ");
                }
            }
        }
                
    }
}
