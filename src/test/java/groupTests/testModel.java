package test.model;

import java.util.Collection;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import Model.Main;

@RunWith(Parameterized.class)
public class testModel {
	
	@Parameterized.Parameters
	public static Collection createTest() {
	
			Object[][] data = new Object[][] {
				{new int[] {1,4,6,8,11,12}, 0, 5, 6, 2},
				{new int[] {23,56,67,88,99,100}, 0, 5, 100,5},
				{new int[] {1,2,3,4,5,6}, 0, 5, 2,1},
				{new int[] {45,55,66,77,88,99}, 0, 5, 55,1},
				{new int[] {12,13,14,15,16,17},0, 5,16,4},
				{new int[] {12,14,67,88,100,134},0, 5,134,5},
				{new int[] {10,20,30,40,50,60},0, 5,60,5},
				{new int[] {55,69,210,230,350,500},0, 5,350,4},
				{new int[] {80,100,120,140,160,180},0, 5,100,1},
				{new int[] {87,98,928,988,2382,12321},0, 5,98,1}
				
			};
		
		return Arrays.asList(data);
		}
	int arr[];
	int first;
	int last;
	int key;
	int answer;
	
	

	public testModel(int[] arr, int first, int last, int key, int answer) {
		super();
		this.arr = arr;
		this.first = first;
		this.last = last;
		this.key = key;
		this.answer = answer;
	}



	@Test
	public void test1() {
		Assert.assertTrue(Model.Main.binarySearch(arr, first, last, key) == answer);
	}
}
