public class ARRAY {
    public static void main(String[] args) {
        int[][] matrix = {
        {1,2,3,},
        {6,7,2},
        {5,9,4}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}