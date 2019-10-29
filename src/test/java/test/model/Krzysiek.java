package test.model;

import java.util.Arrays;
import java.util.Collection;

        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.junit.runners.Parameterized;

        import java.util.Arrays;
        import java.util.Collection;

@RunWith(Parameterized.class)
public class Krzysiek {

    @Parameterized.Parameters
    public static Collection createTest() {
        Object[][] data = new Object[][]{
                {new int[]{4,2,3,6,5,6},5, 5, 6},
                {new int[]{4,2,3,2,9,8},1, 0, 1},
                {new int[]{6,7,8,9,8,4},0, 3, 1},
                {new int[]{4,2,3,2,9,8},1, 0, 2}
        };
        return Arrays.asList(data);
    }
    int arr[];
    Integer first;
    Integer last;
    Integer key;

    public Krzysiek(int arr[], Integer first, Integer last, Integer key) {
        this.arr = arr;
        this.first = first;
        this.last = last;
        this.key = key;
    }

    @Test
    public void test(){
        Assert.assertTrue(com.TestMavena.Kartkowka.binarySearch(arr, first, last, key) == (first+last)/2);
    }
}