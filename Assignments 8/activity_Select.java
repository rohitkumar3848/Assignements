public class activity_Select {
    public static void act_Sel(int s[],int f[],int n){
        int i=0;
        int j=0;
        System.out.println("Activity selected :");
        System.out.print(i+" ");
        for(j=1;j<n;j++){
            if(s[j]>=f[i]){
                System.out.print(j+" ");
                i=j;
            }
        }
    }
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
		int finish[] = { 3, 5, 6, 8, 9, 9 };
		int n = start.length;
        act_Sel(start,finish,n);
    }
}
