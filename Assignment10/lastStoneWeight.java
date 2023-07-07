import java.util.*;
class lastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int f1=pq.remove();
            int f2=pq.remove();
            if(f1==f2){
                continue;
            }
            else if(f2<=f1){
                pq.add(f1-f2);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        else{
            return pq.remove();
        }
    }
    public static void main(String[] args) {
        int stones[] = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
