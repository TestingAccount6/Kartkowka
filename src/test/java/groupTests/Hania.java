import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
    public class Hania{

    @Parameterized.Parameters
    public static Collection createDataTest(){

        Object[][] data = new Object[][]{
                {new int[]{0,1,2,3,4,5,6}, 0, 6, 4, 3},
                {new int[]{2,4,6,8,10,12,14,16}, 2, 16, 4, 1},
                {new int[]{3,6,9,12,15,18,21}, 3, 21, 12, 3},
                {new int[]{1,3,5,7,9,11,13,15}, 1, 15, 13, 6},
                {new int[]{2,5,8,33,55,77,99}, 2, 99, 8, 2},
                {new int[]{3,5,6,7,9,12,15,17}, 3, 17, 7, 3},
                {new int[]{7,8,9,10,11,12,13,14}, 7, 14, 10, 3},
                {new int[]{2,4,7,9,12,14,15,23,25,47}, 2, 47, 2, 0},
                {new int[]{2,3,4,6,8,9,10,12}, 2, 12, 12, 7},
                {new int[]{0,1,2,3,4,5,6}, 0, 6, 2, 2}};

        return Arrays.asList(data);
    }

    int[] valueTab;
    Integer value1, value2, value3, answer;

    public Hania(int[] valueTab, Integer value1, Integer value2, Integer value3, Integer answer){
        this.valueTab = valueTab;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.answer = answer;
    }

    @Test
    public void test(){
        Assert.assertTrue(Model.Main.binarySearch(valueTab, value1, value2, value3) == answer);
    }

}
