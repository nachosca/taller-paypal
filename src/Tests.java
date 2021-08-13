import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {

    @Test
    public void myTest1() {

        int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10, 11, -12};
        final List<Integer[]> result = Main.fourNumberSum(array, -1);

        final List<Integer[]> expected = new ArrayList<>();
        Integer[] expected1 = {1, 3, 5, -10};
        Integer[] expected2 = {1, 3, 7, -12};
        Integer[] expected3 = {-2, -4, -6, 11};

        expected.add(expected1);
        expected.add(expected2);
        expected.add(expected3);


        Assert.assertEquals(result.size(), expected.size());

        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected1);
            return Arrays.equals(res, expected1);
        }));

        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected2);
            return Arrays.equals(res, expected2);
        }));

        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected3);
            return Arrays.equals(res, expected3);
        }));
    }

    @Test
    public void myTest2() {

        int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        final List<Integer[]> result = Main.fourNumberSum(array, 1);

        final List<Integer[]> expected = new ArrayList<>();
        Integer[] expected1 = {1, 3, 5, -8};
        Integer[] expected2 = {1, 3, 7, -10};

        expected.add(expected1);
        expected.add(expected2);


        Assert.assertEquals(result.size(), expected.size());

        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected1);
            return Arrays.equals(res, expected1);
        }));

        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected2);
            return Arrays.equals(res, expected2);
        }));

    }


    @Test
    public void test1() {

        int[] array = {7, 6, 4, -1, 1, 2};
        final List<Integer[]> result = Main.fourNumberSum(array, 16);

        final List<Integer[]> expected = new ArrayList<>();
        Integer[] expected1 = {7, 6, 4, -1};
        Integer[] expected2 = {7, 6, 1, 2};

        expected.add(expected1);
        expected.add(expected2);

        Assert.assertEquals(result.size(), expected.size());

        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected1);
            return Arrays.equals(res, expected1);
        }));

        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected2);
            return Arrays.equals(res, expected2);
        }));
    }


    @Test
    public void test2() {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        final List<Integer[]> result = Main.fourNumberSum(array, 10);

        final List<Integer[]> expected = new ArrayList<>();
        Integer[] expected1 = {1, 2, 3, 4};

        expected.add(expected1);

        Assert.assertEquals(result.size(), expected.size());

        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected1);
            return Arrays.equals(res, expected1);
        }));

    }

    @Test
    public void test3() {

        int[] array = {5, -5, -2, 2, 3, -3};
        final List<Integer[]> result = Main.fourNumberSum(array, 10);

        final List<Integer[]> expected = new ArrayList<>();

        Assert.assertEquals(result.size(), expected.size());
    }


    @Test
    public void test4() {

        int[] array = {-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final List<Integer[]> result = Main.fourNumberSum(array, 4);

        final List<Integer[]> expected = new ArrayList<>();
        Integer[] expected1 = {-2, -1, 1, 6};
        Integer[] expected2 = {-2, 1, 2, 3};
        Integer[] expected3 = {-2, -1, 2, 5};
        Integer[] expected4 = {-2, -1, 3, 4};

        expected.add(expected1);
        expected.add(expected2);
        expected.add(expected3);
        expected.add(expected4);

        Assert.assertEquals(result.size(), expected.size());

        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected1);
            return Arrays.equals(res, expected1);
        }));
        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected2);
            return Arrays.equals(res, expected2);
        }));
        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected3);
            return Arrays.equals(res, expected3);
        }));
        Assert.assertTrue(result.stream().anyMatch(res -> {
            Arrays.sort(res);
            Arrays.sort(expected4);
            return Arrays.equals(res, expected4);
        }));

    }

}
