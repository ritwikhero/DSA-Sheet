package BinarySearch;

public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int row = 0, col = n-1;

        while(row < m && col >= 0){
            int value = matrix[row][col];

            if(value == target){
                return true;
            }
            else if(value < target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}
