class Solution {
    public int[] setDifference(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>(),s2=new HashSet<>();
        TreeSet<Integer> res=new TreeSet<>();
        for(int x:nums1){
            s1.add(x);
            res.add(x);
        }
        for(int y:nums2){
            s2.add(y);
            res.add(y);
        }
        res.removeIf(x->s1.contains(x)&&s2.contains(x));
        return res.stream().mapToInt(i->i).toArray();
    }
}