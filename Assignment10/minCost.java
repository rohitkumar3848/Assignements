
import java.util.*;

class ConnectRopes {
	public static int minCost(int arr[], int n)
	{
        int res=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
        }
        while(pq.size()>1){
            int f1=pq.remove();
            int f2=pq.remove();
            res+=f1+f2;
            pq.add(f1+f2);
        }
        return res;
	}
	public static void main(String args[])
	{
		int len[] = { 4, 3, 2, 6 };
		int size = len.length;
		System.out.println(minCost(len, size));
	}
}