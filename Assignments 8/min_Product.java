public class min_Product{
    public static int min_Pro(int a[],int b[],int n,int k){
        int temp=0;
        int pro=0;
        int final_Sum=0;
        int diff=0;
        int d=0;
        for(int i=0;i<n;i++ ){
            pro=a[i]*b[i];
            final_Sum+=pro;
            if(pro<0 && b[i]<0){
                temp=((a[i]+(2*k))*b[i]);
            }
            else if(pro<0 && a[i]<0){
                temp=((a[i]-(2*k))*b[i]);
            }
            if(pro>0 && a[i]<0){
                temp=((a[i]+(2*k))*b[i]);
            }
            if(pro>0 && a[i]>0){
                temp=((a[i]-(2*k))*b[i]);
            }
            d=Math.abs(pro-temp);
            if(d>diff){
                diff=d;
            }
        }
        return final_Sum-diff;
    }
    public static void main(String[] args) {
        int a[] = { 2, 3, 4 , 5, 4 };
		int b[] = { 3,4,2,3,2 };
		int n = 5, k = 3;
        int sum=min_Pro(a,b,n,k);
        System.out.println(sum);
    }
}