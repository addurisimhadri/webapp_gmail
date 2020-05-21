package com.sim.datastructure;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Anagrams {
	// Create a Logger 
   static Logger logger 
        = Logger.getLogger( 
        		Anagrams.class.getName()); 
	public static void main(String[] args) {
		
		String s1="ACT";
		String s2="CAT";
		logger.log(Level.INFO,"Hello {0}",checkAnagrams(s1,s2));
			
	}

	private static boolean checkAnagrams(String s1, String s2) {
		String sortedWord = sortChars(s1);
		String sortedAnagram = sortChars(s2);		
		return sortedWord.equals(sortedAnagram);		
	}
	public static String sortChars(String word) {
		char[] wordArr = word.toLowerCase().toCharArray();
		Arrays.sort(wordArr);
		return String.valueOf(wordArr);
	}
}
