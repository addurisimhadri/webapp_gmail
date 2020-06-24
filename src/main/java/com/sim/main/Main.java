package com.sim.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {		
		String str="Vodafone-IN";
		if(str.contains(" ")) str=str.substring(0, str.indexOf(" "));
		if(str.contains("-")) str=str.substring(0, str.indexOf("-"));
		System.out.print(str);
		
		List<StringBuffer> list = new ArrayList<>();
	      list.add(new StringBuffer("alpha"));
	      list.add(new StringBuffer("beta"));
	      list.add(new StringBuffer("charlie"));
	      System.out.println(list);   //[alpha, beta, charlie]	         
	 
	      for (StringBuffer str1 : list) {
	         str1.append("change!");   // cannot modify "immutable" objects
	      }
	      System.out.println(list);   //[alpha, beta, charlie]
		 
		 
		List<String> lst = new ArrayList<>();
	      lst.add("alpha");
	      lst.add("beta");
	      lst.add("charlie");
	      System.out.println(lst);   //[alpha, beta, charlie]
	      Collections.sort(lst);
	      // cannot modify "immutable" objects
	      for (String str1 : lst) {
	         str1 += "change!";   
	      }
	      System.out.println(lst);   //[alpha, beta, charlie]
	}

}
