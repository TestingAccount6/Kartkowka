package Model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Vitos {

/*    int[] sample = new int[]{-2,-1,-1,0,1,1,2,4};
    int answer=3;
    int question=0;

    @Test
    public void binarySearch(){
        int result = Model.Main.binarySearch(sample, 0, sample.length, question);
        Assert.assertEquals(answer, result);
    }*/     //  test jednostkowy

    private static int[] sample0 = new int[]{-24, -12, -10, -5, -3, -2, -2, -1, 0, 0, 2, 2, 3,};
    private static int length0 = sample0.length - 1;
    private static int[] sample1 = new int[]{1, 2, 5, 7, 23, 65, 345};
    private static int length1 = sample1.length - 1;
    private static int[] sample2 = new int[]{0, 1, 2, 4, 6, 8, 12, 34, 56, 71};
    private static int length2 = sample2.length - 1;
    private static int[] sample3 = new int[]{-1, -1, -1, -0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 6, 7};
    private static int length3 = sample3.length - 1;
    private static int[] sample4 = new int[]{-1235, -345, -167, -64, -8, 2, 65, 126, 8533, 38614};
    private static int length4 = sample4.length - 1;
    private static int[] sample5 = new int[]{-1, 0, 12, 785, 2386, 893471};
    private static int length5 = sample5.length - 1;
    private static int[] sample6 = new int[]{21, 125, 361, 643, 1235, 1356, 1467, 2347, 2378};
    private static int length6 = sample6.length - 1;
    private static int[] sample7 = new int[]{0};
    private static int length7 = sample7.length - 1;
    private static int[] sample8 = new int[]{0, 1, 2, 3, 4, 5, 56, 67, 87, 89};
    private static int length8 = sample8.length - 1;

    @Parameterized.Parameters
    public static Collection createDataTest() {
        Object[][] data = new Object[][]{
                {sample0, 0, length0, -5, 3},
                {sample1, 0, length1, 2, 1},
                {sample2, 0, length2, 12, 6},
                {sample3, 0, length3, 0, 3},
                {sample4, 0, length4, -64, 3},
                {sample5, 0, length5, 0, 1},
                {sample6, 0, length6, 1467, 6},
                {sample7, 0, length7, 0, 0},
                {sample8, 0, length8, 87, 8},
                {new int[]{0}, 0, 1, 0, 0}
        };
        return Arrays.asList(data);
    }

    private int[] sample;
    private int first;
    private int last;
    private int key;
    private int result;

    public Vitos(int[] arr, int first, int last, int key, int result) {
        this.sample = arr;
        this.first = first;
        this.last = last;
        this.key = key;
        this.result = result;
    }

    @Test
    public void Test1() {
        Assert.assertEquals(Main.binarySearch(sample, first, last, key), result);
    }
}

/*
 *
 *   Last but not least.
 *
 */