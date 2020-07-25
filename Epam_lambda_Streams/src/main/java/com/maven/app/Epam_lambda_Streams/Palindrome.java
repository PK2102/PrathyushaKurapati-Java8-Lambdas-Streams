package com.maven.app.Epam_lambda_Streams;
import java.util.stream.IntStream;
import java.util.Scanner;
import java.util.*;
public class Palindrome {
	public void palindrome() {
	int n;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of elements and the elements");
    n = scan.nextInt();
    String str[] = new String[n];
    
    ArrayList<String> result=new ArrayList<String>();
    for(int i=0;i<n;i++){
        str[i] = scan.next();
        if(isPalindrome(str[i]))
        result.add(str[i]);
    }
    System.out.println(result);
}
	public  boolean isPalindrome(String originalString) {

        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();

        return IntStream.range(0, tempString.length() / 2).noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));

    }
}
