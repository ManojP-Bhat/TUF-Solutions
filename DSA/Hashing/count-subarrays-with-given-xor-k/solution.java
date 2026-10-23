class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
      int n=nums.length;
      int xor=0;
      int count=0;
      Map<Integer,Integer>map=new HashMap<>();
      map.put(0,1);
      for(int i=0;i<n;i++){
        xor^=nums[i];
        int x=xor^k;
        count+=map.getOrDefault(x,0);
        map.put(xor,map.getOrDefault(xor,0)+1);
      }
      return count;
    }
}