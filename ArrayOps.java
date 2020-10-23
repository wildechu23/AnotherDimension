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
}
