
import Model.Main;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

@RunWith(Parameterized.class)
public class BisectionTestMarcinBartosiak {

    static int nbOfTests = 10;

    @Parameterized.Parameters
    public static Collection createRandomArrays(){
        LinkedList<int[]> randomArrays = new LinkedList<>();
        for (int i = 0; i<nbOfTests ;i++){
            int size = ThreadLocalRandom.current().nextInt(1,100);
            int[] arr = new int[size];
            for( int ind = 0; ind <size; ind++)
                arr[ind] = ThreadLocalRandom.current().nextInt(0,Integer.MAX_VALUE);
            Arrays.sort(arr);
            randomArrays.add(arr);
        }
        return randomArrays;
    }

    int[] arr ;
    int pos ;
    String outStr;

    public BisectionTestMarcinBartosiak(int[] arr){

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        this.arr = arr;
        this.pos = ThreadLocalRandom.current().nextInt(0,arr.length);
        Main.binarySearch(this.arr,0,arr.length-1,arr[pos]);
        this.outStr = outContent.toString();
    }

    @Test
    public void out() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.out.println("Element is found at index: " + this.pos);
        String output = outContent.toString();
        Assert.assertEquals(output,this.outStr);
    }

}
