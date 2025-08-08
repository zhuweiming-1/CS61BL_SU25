/**
 * Array Operations Class. Optional Exercise
 **/
public class ArrayOperations {
    /**
     * Delete the value at the given position in the argument array, shifting
     * all the subsequent elements down, and storing a 0 as the last element of
     * the array.
     */
    public static void delete(int[] values, int pos) {
        int size = values.length;
        if (pos < 0 || pos >= size) {
            return;
        }
        for (int i = pos; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[size - 1] = 0;
    }

    /**
     * Insert newInt at the given position in the argument array, shifting all
     * the subsequent elements up to make room for it. The last element in the
     * argument array is lost.
     */
    public static void insert(int[] values, int pos, int newInt) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        for (int j = values.length - 2; j >= pos; j--) {
            values[j + 1] = values[j];
        }
        values[pos] = newInt;
    }

    /**
     * Returns a new array consisting of the elements of A followed by the
     * the elements of B.
     */
    public static int[] catenate(int[] A, int[] B) {
        int newSize = A.length + B.length;
        int[] newArray = new int[newSize];
        System.arraycopy(A, 0, newArray, 0, A.length);
        System.arraycopy(B, 0, newArray, A.length, B.length);
        return newArray;
    }

}