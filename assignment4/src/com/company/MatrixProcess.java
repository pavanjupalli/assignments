package assignment4;

public class MatrixProcess {

    private int[][] matrixArray;

    public MatrixProcess() {
        matrixArray = new int[3][3];
    }

    public MatrixProcess(int a, int b) {
        matrixArray = new int[a][b];
    }

    public MatrixProcess(int[][] matrixArray) {
        this.matrixArray = matrixArray;
    }

    public MatrixProcess(MatrixProcess matrixProcess) {
        matrixArray = matrixProcess.matrixArray;
    }

    public void displayMatrix() {
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                System.out.print(matrixArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void addMatrices(int[][] matrixArray1)  {
        if (matrixArray1.length != matrixArray.length) {
            System.out.println("addition operation can not be performed");
        } else {
            int k = 0;
            for (int i = 0; i < matrixArray.length; i++) {
                if (matrixArray1[i].length != matrixArray[i].length) {
                    System.out.println("addition operation can not be performed");
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                int[][] resultArray = new int[matrixArray.length][];
                for (int i = 0; i < matrixArray.length; i++) {
                    resultArray[i] = new int[matrixArray[i].length];
                    for (int j = 0; j < matrixArray[i].length; j++) {
                        resultArray[i][j] = matrixArray1[i][j] + matrixArray[i][j];
                    }
                }
                System.out.println(resultArray);
            }
        }
        System.out.println("operation can not be performed.");
    }

    public void findScalar()  {
        for (int i = 0; i < matrixArray.length; i++) {
            if (matrixArray.length != matrixArray[i].length)
                System.out.println("operation can not be performed");
        }

        int diagValue = matrixArray[0][0];
        boolean scalar = true;
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if (i == j) {
                    if (matrixArray[i][j] != diagValue) {
                        scalar = false;
                        break;
                    }
                } else {
                    if (matrixArray[i][j] != 0) {
                        scalar = false;
                        break;
                    }
                }
            }
            if (!scalar)
                break;
        }
        System.out.println("scalar matrix: " + scalar);

    }


    public void multiplyMatrix(int[][] matrixArray1) {
        //checking condition for multiplication.
        if (matrixArray[0].length != matrixArray1.length) {
            System.out.println("multiplication can't be performed");
            return;
        }
        int[][] multipliedMatrix = new int[matrixArray.length][matrixArray1[0].length];
        for (int i = 0; i < matrixArray.length; i++)
            for (int k = 0; k < matrixArray1[0].length; k++)
                for (int j = 0; j < matrixArray[i].length; j++)
                    multipliedMatrix[i][k] += matrixArray[i][j] * matrixArray1[j][k];
        System.out.println(multipliedMatrix);

    }


}
