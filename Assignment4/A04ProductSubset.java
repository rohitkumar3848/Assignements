package Assignments;
import java.lang.annotation.Target;
import java.util.*;

import javax.sound.midi.SysexMessage;

class A04ProductSubset {
    public static void backtrack(int []candidates,int target,int product){
        if(target==product){
            System.out.println("Yes");
            System.exit(0);
        }
        for(int i=0;i<candidates.length;i++){
            backtrack(candidates,target,product*candidates[i]);
            backtrack(candidates, target,product);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,2,5,4};
        backtrack(arr,16,1);
    }
}