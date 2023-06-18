public class flower_Bed {
    public static boolean canPlace(int a[],int n){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                int prev=(i==0 || a[i-1]==0)?0:1;
                int next=(i==a.length-1 || a[i+1]==0)?0:1;
                if(prev==0 && next==0){
                    a[i]=1;
                    count++;
                }
            }
        }
        return (count>=n);
    }
    public static void main(String[] args) {
        int flowerbed[] = {1, 0, 0, 0, 1};
		int n = 3;
		System.out.println("The desired output is :  " + canPlace(flowerbed , n));
    }
}
