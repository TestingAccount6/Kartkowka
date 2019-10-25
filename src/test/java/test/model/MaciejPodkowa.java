package test.model;

import Model.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Paralyzer on 25.10.2019.
 */
@RunWith(Parameterized.class)
public class MaciejPodkowa {


    static int[] tab = new int[]{-150,-87,-64,-63,-58,-56,-53,-51,-47,-38,-37,-34,-32,-30,-25,
            -18,-12,-11,-8,-7,-5,-1,0,1,6,7,8,13,14,15,16,17,18,19};

    @Parameterized.Parameters
    public static Collection createDataTest() {
        Object[][] data = new Object[][]{
                {tab, 0, tab.length-1, -150, 0},
                {tab, 0, tab.length-1,-87, 1},
                {tab, 0, tab.length-1,-89, -1},
                {tab, 0, tab.length-1,-68, -1},
                {tab, 0, tab.length-1,-64, 2},
                {tab, 0, tab.length-1,-34, 11},
                {tab, 0, tab.length-1,-9, -1},
                {tab, 0, tab.length-1,7, 25},
                {tab, 0, tab.length-1,13, 27},
                {tab, 0, tab.length-1,20, -1},

        };
        return Arrays.asList(data);
    }

    int[] tab1;
    Integer first, last, key, score;

    public MaciejPodkowa(int[] tab1, Integer first, Integer last, Integer key, Integer score) {
        this.tab1 = tab1;
        this.first = first;
        this.last = last;
        this.key = key;
        this.score = score;
    }

    @Test
    public void test1(){
        Assert.assertTrue( Main.binarySearch(tab, first, last, key) == score);

    }
}
