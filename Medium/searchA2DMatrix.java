public class searchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        //since this is a 2D array, we need to have 2 separate binary search functions

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0, bottom = rows - 1;
        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2;

            if (target >= matrix[midRow][0] && target <= matrix[midRow][cols - 1]) {
                return binarySearch(matrix[midRow], 0, cols - 1, target);
            } else if (target < matrix[midRow][0]) {
                bottom = midRow - 1;
            } else {
                top = midRow + 1;
            }
        }

        return false;
    }

        public static boolean binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return false;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target); 
        } else {
            return binarySearch(arr, left, mid - 1, target); 
        }
    }
}
