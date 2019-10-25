package test.java;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class KatarzynaKorolTest {

    @Parameterized.Parameters
public class KatarzynaKorolTest {

    }
    @Parameterized.Parameters
    public static Collection createDataTest() {
        int [] tablica = new int[] {1,2,5,6,7,9,10,19,89,111};
        int [] tablica2 = new int[] {7,8,9,12,33,45,67,87};
        int [] tablica3 = new int[] {100,123,133,134,145,156,178,199,200};
        int [] tablica4 = new int[] {-1,0,2,4,5,6};
        int [] tablica5 = new int[] {-5,-4,-3};


        Object[][] data = new Object[][] {
                {tablica, 0,9,5,2},
                {tablica, 0,9,6,3},
                {tablica2, 0,7,33,4},
                {tablica2, 0,7,67,6},
                {tablica3, 0,8,133,2},
                {tablica3, 0,8,100,0},
                {tablica4, 0,5,-1,0},
                {tablica4, 0,5,6,5},
                {tablica5, 0,2,-4,1},
                {tablica5, 0,2,-3,2},
        };
        return Arrays.asList(data);
    }

    int [] tablicaO;
    Integer min;
    Integer max;
    Integer key;
    Integer doSprawdzenia;

    public KatarzynaKorolTest(int[]tablicaO, Integer min, Integer max,Integer key, Integer doSprawdzenia){
        this.tablicaO = tablicaO;
        this.min = min;
        this.max = max;
        this.key = key;
        this.doSprawdzenia = doSprawdzenia;
    }

    @Test
    public void test1(){
        Assert.assertTrue(Model.Main.binarySearch(tablicaO,min,max,key)==doSprawdzenia);
    }

}
