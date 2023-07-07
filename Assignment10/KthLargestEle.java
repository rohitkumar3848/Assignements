import java.util.*;
class kthLargestEle {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:nums){
            pq.add(ele);
            if(pq.size()>nums.length-k+1){
                pq.remove();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args){
        int nums[] = {1,7,8,5,2,6,9};
        int k = 6;
        System.out.println(findKthLargest(nums, k));
    }
}