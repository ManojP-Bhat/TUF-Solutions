class Solution {
    public void rotateMatrix(int[][] matrix) {
        int n=matrix.length;
        int[][]rotate=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotate[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            System.arraycopy(rotate[i],0,matrix[i],0,n);
        }
    }
}