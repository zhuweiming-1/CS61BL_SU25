import java.util.ArrayList;
import java.util.List;

public class ArrayExercises {

    /**
     * Returns an array [1, 2, 3, 4, 5, 6]
     */
    public static int[] makeDice() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    /**
     * Returns the positive difference between the maximum element and minimum element of the given array.
     * Assumes array is nonempty.
     */
    public static int findMinMax(int[] array) {
        int max = array[0];
        int min = array[0];
        int size = array.length;
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        return max - min;
    }

}
