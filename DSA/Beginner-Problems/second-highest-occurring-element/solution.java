class Solution {
    public int secondMostFrequentElement(int[] nums) {
     int n=nums.length;
     int maxFreq=0,secMax=0;
     int maxEle=-1,secEle=-1;
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     }
     for(Map.Entry<Integer,Integer>it:map.entrySet()){
        int ele=it.getKey();
        int freq=it.getValue();
        if(freq>maxFreq){
            secMax=maxFreq;
            maxFreq=freq;
            secEle=maxEle;
            maxEle=ele;
        }
        else if(freq==maxFreq){
            maxEle=Math.min(maxEle,ele);
        }
        else if(freq>secMax){
            secMax=freq;
            secEle=ele;
        }
        else if(freq==secMax){
            secEle=Math.min(secEle,ele);
        }
     }
     return secEle;
    }
}

