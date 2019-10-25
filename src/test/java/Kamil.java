package test.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Kamil {
    private int[] arr;
    private int key;
    private int expectedValue;
    private int first;
    private int last;

    @Parameterized.Parameters
    public static Collection createData (){



        Object [][] data = new Object[][]{
                {new int[]{1,2,3,4,5,6,7,8},0,7,3,2},
                {new int[]{1,2,3,4,5,6,7,8},0,7,5,4},
                {new int[]{-2,-1,0,4,7,9},0,5,9,5},
                {new int[]{-2,-1,0,4,7,9},0,5,-2,0},
                {new int[]{101,105,111},0, 2,105,1},
                {new int[]{0,0,0},0, 2,2,-1},
                {new int[]{1,2,31,41,55},0, 4,2,1},
                {new int[]{2},0,0,2,0},
                {new int[]{-11,-3,-1},0,2,-11,0},
                {new int[]{77,77,102,500},1,3,77,1}
        };
        return Arrays.asList(data);
    }

    public Kamil(int[] arr, Integer first , Integer last, Integer key, Integer expected ){

        this.arr = arr;

        this.first = first;
        this.last = last;
        this.key = key;
        this.expectedValue = expected;

    }

    @Test
    public void test(){
        assertEquals(Model.Main.binarySearch(arr,first,last,key),expectedValue);
    }

}