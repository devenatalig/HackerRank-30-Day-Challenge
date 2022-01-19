import java.util.*;
import java.io.*;
/**
 * Solution to Day 6: Classes vs. Instances.
 * See <a href="https://www.hackerrank.com/challenges/30-review-loop/problem">link</a>
 * @author devendiaz
 * @version 1.0
 */
public class Solution {
	
	public static void splice(String s) {
		String odds = "";
		//Iterate through chars in string
		for (int i = 0; i < s.length(); i++) {
			//If even index
			if (i % 2 == 0) {
				//print even indexed char
				System.out.print(s.charAt(i));
			//If odd index
			} else {
				//Collect odd for printing later
				odds += s.charAt(i);
			}
		}
		//Print space and odd characters
		System.out.print(" " + odds +"\n");
	}
	
	
	public static void main(String[] args) {
		try {
			char[] m = new char[10];
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//Read number of tests
			String line = br.readLine();
			int N = Integer.parseInt(line);
			
			for (int i = 0; i < N; i++) {
				//Read string
				line = br.readLine();
				//Split and print 
				splice(line);
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}