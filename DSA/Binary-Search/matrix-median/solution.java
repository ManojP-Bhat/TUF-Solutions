class Solution {
    public int findMedian(int[][] matrix) {
      List<Integer>flat=new ArrayList<>();
      for(int[]row:matrix){
        for(int val:row){
            flat.add(val);
        }
      }
      Collections.sort(flat);
      int n=flat.size();
      return flat.get(n/2);
    }
}