package Assignments;
import java.util.*;

class A03PrintPermutationDuplicateElements {
    public static void backtrack(List<List<Integer>> result,List<Integer> temp,int []nums,boolean[]visited){
        if(temp.size()==nums.length){
            if(result.contains(temp)){
                return ;
            }
            result.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            // if(temp.contains(nums[i])){
            //     continue;
            // }
            if(visited[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !visited[i-1]){
                continue;
            }
            visited[i]=true;
            temp.add(nums[i]);
            backtrack(result,temp,nums,visited);
            visited[i]=false;
            temp.remove(temp.size()-1);
        }
    } 
    public static List<List<Integer>> permute(int[] nums,boolean []visited) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,visited);
        return result;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        boolean visited[]=new boolean[nums.length];
        System.out.println(permute(nums,visited));
    }
}