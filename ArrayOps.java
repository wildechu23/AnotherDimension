public class ArrayOps {
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int l = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > l) {
        l = arr[i];
      }
    }
    return l;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] arr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      arr[i] = sum(matrix[i]);
    }
    return arr;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] arr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      arr[i] = largest(matrix[i]);
    }
    return arr;
  }

  public static int sum(int[][] matrix) {
    return sum(sumRows(matrix));
  }

  public static int[] sumCols(int[][] matrix) {
    int[] arr = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
      for(int j = 0; j < matrix.length; j++) {
        arr[i] += matrix[j][i];
      }
    }
    return arr;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int sum = sumRows(matrix)[0];
    for(int i = 0; i < matrix.length; i++) {
      if(sumRows(matrix)[i] != sum) {
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    int sum = sumCols(matrix)[0];
    for (int i = 0; i < matrix[0].length; i++) {
      if (sumCols(matrix)[i] != sum) {
        return false;
      }
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return sumRows(matrix)[row] == sumCols(matrix)[col];
  }
}
