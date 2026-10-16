class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
      }
      int highest=Integer.MIN_VALUE;
      int lowest=Integer.MAX_VALUE;

      for(int freq:map.values()){
        highest=Math.max(highest,freq);
        lowest=Math.min(lowest,freq);
      }
      return highest+lowest;
    }
}
