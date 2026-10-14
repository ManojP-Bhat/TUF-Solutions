class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer>set=new TreeSet<>();
        int i=0;
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            set.add(num);
        }
        int []union=new int[set.size()];
        for(int nums:set){
            union[i++]=nums;
        }
        return union;
    }
}