package java;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import javaModel.Main;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class MaciekK {


    @Parameterized.Parameters
    public static Collection createData() {
        Object[][] data = new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 0, 7, 1, 0},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 0, 7, 5, 4},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 0, 7, 8, 7},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 0, 7, 1, 0},
                {new int[]{-2, -1, 0, 2, 4, 5, 6}, 0, 6, -2, 0},
                {new int[]{10, 20, 30, 40, 50, 60}, 0, 5, 60, 5},
                {new int[]{-1, 2, 31}, 0, 3, 2, 1},
                {new int[]{1}, 0, 0, 1, 0},
                {new int[]{-10, 0, 10}, 0, 2, -10, 0},
                {new int[]{77, 78, 102, 500}, 0, 3, 77, 0},
                {new int[]{-8, -4, -2, 0}, 0, 3, -2, 2}
        };

        return Arrays.asList(data);
    }

    int[] tablica;
    Integer first;
    Integer last;
    Integer key;
    Integer expected;



    public MaciekK(int[] tablica, Integer first, Integer last, Integer key, Integer expected) {

        this.tablica = tablica;
        this.first = first;
        this.last = last;
        this.key = key;
        this.expected = expected;
    }

    @Test
    public void test() {
        Assert.assertTrue(Main.binarySearch(tablica, first, last, key) == expected);
    }

}
