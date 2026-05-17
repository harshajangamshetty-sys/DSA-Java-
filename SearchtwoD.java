public class SearchtwoD {
    static void main(String[] args) {
        int [][] matrix = {
                {1 , 2 ,3 ,4},
                {3 , 4 , 5 ,7},
                {5 , 7 ,8 , 9},
                {8 , 8 , 9 , 10}
        };
        System.out.println(searchMatrix(matrix , 4));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            if (rows == 0 || matrix[0].length == 0) return false;

            int cols = matrix[0].length;
            if (rows == 1) return search(matrix, 0, 0, cols - 1, target);

            int rStart = 0;
            int rEnd = rows - 1;
            int cMid = cols / 2;

            while (rStart < rEnd - 1) {
                int mid = rStart + (rEnd - rStart) / 2;
                if (matrix[mid][cMid] == target) return true;
                else if (matrix[mid][cMid] < target) rStart = mid;
                else rEnd = mid;
            }

            if (matrix[rStart][cMid] == target || matrix[rEnd][cMid] == target) return true;

            // left search: rows where matrix[r][cMid] > target
            if (cMid > 0) {
                for (int r = 0; r < rows; r++) {
                    if (matrix[r][cMid] > target) {
                        if (search(matrix, r, 0, cMid - 1, target)) return true;
                    }
                }
            }

            // right search: rows where matrix[r][cMid] < target
            if (cMid < cols - 1) {
                for (int r = 0; r < rows; r++) {
                    if (matrix[r][cMid] < target) {
                        if (search(matrix, r, cMid + 1, cols - 1, target)) return true;
                    }
                }
            }

            return false;
        }

        static boolean search(int[][] matrix, int row, int cStart, int cEnd, int target) {
            while (cStart <= cEnd) {
                int mid = cStart + (cEnd - cStart) / 2;
                if (matrix[row][mid] == target) return true;
                else if (matrix[row][mid] > target) cEnd = mid - 1;
                else cStart = mid + 1;
            }
            return false;
        }
    }

