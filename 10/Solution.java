import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static ArrayList<Integer> decimalToBinary(int n) {
    ArrayList<Integer> binaryDigitsList = new ArrayList<Integer>();
    
    while(n > 0) {
        int remainder = n % 2;
        n = n/2;
        binaryDigitsList.add(remainder);
    }
    
    return binaryDigitsList;
}

public static int countConsecutiveOnes(int n) {
    ArrayList<Integer> binaryDigits = decimalToBinary(n);
    
    int maxConsecutiveOnes = 0;
    int count = 0;
    for (int i : binaryDigits) {
        if (i == 1) { 
            count++;
            if (count > maxConsecutiveOnes) { 
                maxConsecutiveOnes = count;
            }
        } else {
            count = 0;
        }
        
    }
    return maxConsecutiveOnes;
}
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
	System.out.println(countConsecutiveOnes(n));
        bufferedReader.close();
    }
}
