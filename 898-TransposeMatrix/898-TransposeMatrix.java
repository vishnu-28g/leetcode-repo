// Last updated: 13/08/2026, 09:14:33
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int [][] trans = new int[col][row];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<col ; j++){
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
}