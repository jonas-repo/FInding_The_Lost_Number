package com.findlostnumber.app;

import java.util.stream.IntStream;

public class FindLostNumber {
	
	public static void main(String args[])
	{
		//try to locate the number that is missing from the count of 1 to 10
		 int[] intArray = new int[]{ 8,2,0,9,5,3,7,1,4,10 };
		 
		 int count = 0;
		 
		 //first we have to count the sum from 1 to 10
		 for (int i = 0; i <= intArray.length; i++) {
			count += i;
		 }
		 
		 //get the sum from the array
		 int arraySum = IntStream.of(intArray).sum();
		 
		 //the difference between both sums is the lost number
		 count = count - arraySum;
		 
		 System.out.println("The number missing is: "+ count);
		 
		 
	}
}
