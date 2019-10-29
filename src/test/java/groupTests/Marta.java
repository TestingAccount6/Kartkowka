import Model.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Marta {

    @Parameterized.Parameters
    public static Collection createTestData(){
        Object[][] data = new Object[][]{
                {new int[]{0,1,2,3,4,5,6,7,8},0,8,6,6},
                {new int[]{-3,-2,0,2,3,6,8,11,12},0,8,0,2 },
                {new int[]{-5,-3,-1,1,3,4,5},0,6,4,5},
                {new int[]{-7,-6,-2,-1,0,13,18,44},0,7,0,4},
                {new int[]{-12,-7,-3,-2,2,3,4,5,6,7,8,111},0,11,111,11},
                {new int[]{-2,0,2,3,5},0,4,3,3},
                {new int[]{-22,-11,-4,-2,8,77,122},0,6,-11,1},
                {new int[]{-1,0,1,2,3},0,4,0,1},
                {new int[]{-2,-1,0,1,2,3,4,5,6,7,9999},0,10,7,9},
                {new int[]{-4,-2,-1,5,6,88},0,5,-2,1}
        };
        return Arrays.asList(data);
    }

    private int[] arr;
    int limitLeft;
    int limitRight;
    int numToFind;
    int indexOfNumTofind;


    public Marta(int[] arr,int limitLeft,int limitRight,int numToFind,int indexOfNumTofind){
        this.arr = arr;
        this.limitLeft = limitLeft;
        this.limitRight = limitRight;
        this.numToFind = numToFind;
        this.indexOfNumTofind = indexOfNumTofind;
    }

    @Test
    public void testParam() {
        Assert.assertTrue(Main.binarySearch(arr, limitLeft, limitRight, numToFind) == indexOfNumTofind);
    }
}
