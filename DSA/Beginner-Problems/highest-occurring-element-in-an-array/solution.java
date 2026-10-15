import java.util.*;
class Solution {
    public int mostFrequentElement(int[] nums) {
     int n=nums.length;
     int max=0;
     int maxEle=0;
     Map<Integer,Integer> m=new HashMap<>();
     for(int i=0;i<n;i++){
        m.put(nums[i],m.getOrDefault(nums[i],0)+1);
     }
     for(Map.Entry<Integer,Integer> entry:m.entrySet()){
        int ele=entry.getKey();
        int freq=entry.getValue();
        if(freq>max){
            max=freq;
            maxEle=ele;
        }else if(max==freq){
            maxEle=Math.min(maxEle,ele);
        }
     }
     return maxEle;
    }
}


