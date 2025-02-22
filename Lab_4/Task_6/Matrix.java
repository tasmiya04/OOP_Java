class Matrix {
    int rows, cols;
    int[][] matrix;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void getMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setElement(int row, int col, int value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            matrix[row][col] = value;
        } else {
            System.out.println("Invalid row or column!");
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(4, 3);
        Matrix matrix2 = new Matrix(3, 3);

        matrix1.setElement(1, 2, 3);
        System.out.println("Matrix 1:");
        matrix1.getMatrix();

        System.out.println("Matrix 2:");
        matrix2.getMatrix();
    }
}
