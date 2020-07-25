package com.maven.app.Epam_lambda_Streams;
import java.util.*;
import java.util.stream.Collectors;

public class String_Start_With_a {
	public void checkString() {
		
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements and the elements");
		n = scan.nextInt();
	
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=scan.next();
		}
	List<Object> strings = Arrays.asList(arr);
// strings.stream()
//       .map(s -> s.substring(0, 1))
//       .forEach(s -> System.out.println(s));
strings=strings.stream()
				  .filter(s -> ((String) s).startsWith("a"))
				  .filter(s -> ((String) s).length() == 3)
				  .collect(Collectors.toList());
	System.out.println(strings);
	}
}
