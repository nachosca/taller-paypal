import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        final List<Integer[]> result = fourNumberSum(array, 1);

        for (Integer[] integers : result) {
            System.out.println(integers[0] + ", " + integers[1] + ", " + integers[2] + ", " + integers[3] + ", ");
        }

    }

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();

        for (int i = 0; i < array.length - 3; i++) {
            for (int j = i + 1; j < array.length - 2; j++) {
                for (int k = j + 1; k < array.length - 1; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        if (array[i] + array[j] + array[k] + array[l] == targetSum) {
                            Integer[] targetArray = new Integer[4];
                            targetArray[0] = array[i];
                            targetArray[1] = array[j];
                            targetArray[2] = array[k];
                            targetArray[3] = array[l];

                            result.add(targetArray);
                        }
                    }
                }
            }
        }

        return result;
    }


}

