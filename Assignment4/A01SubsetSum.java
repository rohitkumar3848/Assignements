package Assignments;
import java.io.*;

import java.util.*;

public class A01SubsetSum {
  public static void backtrack(int []nums,boolean[]visited,int cur_Sum,int target,int k){
    if(k==1){
      System.out.println("True");
    }
    if(cur_Sum>target){
      return ;
    }
    if(cur_Sum==target){
      System.out.println("True");
    }
    for(int i=0;i<nums.length;i++){
        // if(temp.contains(nums[i])){
        //     continue;
        // }
        // if(visited[i]){
        //     continue;
        // }
        // if(i>0 && nums[i]==nums[i-1] && !visited[i-1]){
        //     continue;
        // }
        // visited[i]=true;
        backtrack(nums,visited,cur_Sum+nums[i],target/k,k);
        // visited[i]=false;
    }
} 
public static void main(String[] args) {
  int nums[]={1,3,3,2};
  int target=0;
  int k=2;
  for(int i=0;i<nums.length;i++){
    target+=nums[i];
  }
  boolean visited[]=new boolean[nums.length];
  backtrack(nums,visited,0,target,k);
}
}