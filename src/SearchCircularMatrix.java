/**
     *
     * Circular Matrix
     *
     * This algorithm searches for a given number (num) inside a circular matrix,
     * and returns true if it was found.
     *
     * Time Complexity:
     * This algorithm has a logarithmic time complexity.
     * On each iteration the algorithm selects 1 Sub square to search in,
     * focusing on 1/4 of the input.
     * Time complexity: O(log n).
     *
     * Space Complexity:
     * A constant number of variables is declared and used,
     * regardless of the input size.
     *
     * The space complexity of the algorithm is constant: O(1).
     *
     * @param mat The Circular Matrix to search num in.
     * @param num The number to search in the given matrix.
     *
     * @return    True if num was found in the matrix.
     *
     */

public class SearchCircularMatrix {

    public static boolean search(int[][] mat, int num) {

        /* If there is only one value return whether it equals to num. */
        if (mat.length == 1) 
            return mat[0][0] == num;
        
        /* Check the case where the smallest value in the matrix is bigger than num,
        and the case where the largest value in the matrix is smaller than num. */
        if (mat[0][0] > num || mat[mat.length - 1][0] < num) 
            return false;
        
        /**
        * squareNumber - The currently selected Sub-Square.
        * The Square number is based on the location of a square inside a bigger square.
        *
        * Top Left Square     = 1
        * Top Right Square    = 2
        * Bottom Right Square = 3
        * Bottom Left Square  = 4
        */

        int squareNumber;
        int currRow = 0;
        int currCol = 0;
        int squareLength = mat.length / 2;

        while (squareLength >= 1) {

            /**
             *
             * Each iteration starts at Sub-Square 1 of the
             * previously selected square at position: mat[currRow][currCol].
             *
             * In each iteration a new square is selected inside the current square,
             * so 3/4 of the input is eliminated on each iteration.
             *
             * CurrRow & CurrCol - The positions in the initial given matrix.
             * Both being updated according to the relative position we're currently in,
             * along with squareLength, which limits the movement inside the bigger array
             * in order to fit to the scale of the Square we're searching in.
             *
             * Relative positions from mat[currRow][currCol]:
             *
             * Square 1:
             *
             *  - SubSquare 1: mat[currRow][currCol]
             *  - SubSquare 4: mat[currRow + squareLength - 1][currCol]
             *
             * Square 2:
             *
             *  - SubSquare 1: mat[currRow][currCol + squareLength]
             *  - SubSquare 4: mat[currRow + squareLength - 1][currCol + squareLength]
             *
             * Square 3:
             *
             *  - SubSquare 1: mat[currRow + squareLength][currCol + squareLength]
             *  - SubSquare 4: mat[currRow + (squareLength * 2) - 1][currCol + squareLength]
             *
             * Square 4:
             *
             *  - SubSquare 1: mat[currRow + squareLength][currCol]
             *  - SubSquare 4: mat[currRow + (squareLength * 2) - 1][currCol]
             *
             */

            if (mat[currRow + squareLength - 1][currCol + squareLength] < num) {

                squareNumber = (mat[currRow + (squareLength * 2) - 1][currCol + squareLength] < num) ? 4 : 3;

            } else {

                squareNumber = (mat[currRow + squareLength - 1][currCol] < num) ? 2 : 1;

            }

            switch (squareNumber) {

                case 1:

                    /* Exit if num is smaller than the smallest value of Square 1.*/
                    if (num < mat[currRow][currCol]) 
                        return false;
                    
                    break;

                case 2:

                    /* Navigate from Square 1 to Square 2. */
                    currCol += squareLength;
                    break;

                case 3:

                    /* Navigate from Square 1 to Square 3 */
                    currCol += squareLength;
                    currRow += squareLength;
                    break;

                case 4:

                    /* Exit if num is bigger than the biggest value of Square 4. */
                    if (num > mat[currRow + (squareLength * 2) - 1][currCol]) 
                        return false;
                    
                    /* Navigate from Square 1 to Square 4. */
                    currRow += squareLength;
                    break;

                default:
                    break;
            }

            /* If we happen to get to a position where num is */
            if (mat[currRow][currCol] == num) {
                return true;
            }

            /* "Enter" the sub-square by limiting the movement can be made inside the array,
            The new square length is the size of the side length of the new subsquare. */
            squareLength /= 2;
        }

        return false;
    }
}