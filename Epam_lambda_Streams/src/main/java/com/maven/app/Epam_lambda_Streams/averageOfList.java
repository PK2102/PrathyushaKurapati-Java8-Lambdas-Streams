package com.maven.app.Epam_lambda_Streams;
import java.util.*;
import java.util.stream.IntStream;
public class averageOfList {
	public void average() {
		
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements and the elements");
		n = scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = scan.nextInt();
		}
		IntStream streamOfNumbers = Arrays.stream(arr);
 
        OptionalDouble averageOfNumbers = streamOfNumbers.average();
 
        System.out.println("\nAverage of Numbers: " + averageOfNumbers.getAsDouble());
 
	}
}
