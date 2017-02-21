package com.adp.exercise;

/*
	A function in java that takes a positive integer value, and 
	returns true if the bits of that value is the same if reversed.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
	
	public static void main(String[] args){
		//for true values example are 9 , 153 ,2457 (Palindrome Numbers)
		BufferedReader br = null;
		Integer inputNumber = 0;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Number :");
			String input = br.readLine();
			inputNumber = Integer.parseInt(input);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		Boolean value = getReverseBitValueforInteger(inputNumber);
		
		System.out.println("Is Number deriverd from the Reverse Bit of Given number equals to the Given Number ? "  + value);
	}

	
	public static Boolean getReverseBitValueforInteger(Integer number){
		StringBuilder strBuilder = new StringBuilder();
		String bitsVal = Integer.toBinaryString(number);
		System.out.println(bitsVal);
		
		char[] charVal = bitsVal.toCharArray();
		
		for( int i= charVal.length-1 ; i>=0 ; i--){
			strBuilder.append(charVal[i]);
		}
		String revBitsVal = strBuilder.toString();
		System.out.println( "Reverse Bit Value is " + revBitsVal);
		
		Integer reverseNumber = Integer.parseInt(revBitsVal , 2);
		System.out.println(" Reverse value is " + reverseNumber);
		
		if (reverseNumber.equals(number))
			return true;
		else 
			return false;
		
	}
	
	
}
