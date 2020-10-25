import java.util.Arrays;

public class Tester {
  public static void main(String[] args) {
    int[][] A = { 
      { 1, 0, 12, -1 }, 
      { 7, -2, 2, 1 }, 
      { -5, -2, 2, -9 } 
    };
    int[] B = { 1, 3, 5 };
    int[][] C = { 
      { 1, 2, 3, 4 }, 
      { 2, 3, 4, 1 }, 
      { 3, 4, 1, 2 } 
    };

    int[][] E = { 
      { 2, 4, 2 }, 
      { 2, 2, 2 } 
    };

    System.out.println(Arrays.toString(ArrayOps.sumRows(A))); // [12, 8, -14]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A))); // [12, 7, 2]
    System.out.println(ArrayOps.sum(B)); // 9
    System.out.println(Arrays.toString(ArrayOps.sumCols(A))); // [3, -4, 16, -9]
    System.out.println(ArrayOps.isRowMagic(C)); // true
    System.out.println(ArrayOps.isColMagic(C)); // false
    System.out.println(ArrayOps.isLocationMagic(E, 0, 1)); // false
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1)); // true
  }
}
