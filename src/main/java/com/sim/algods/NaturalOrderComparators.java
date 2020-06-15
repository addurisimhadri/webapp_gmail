package com.sim.algods;

import java.util.Comparator;

public final class NaturalOrderComparators {

    private static final String DIGIT_AND_DECIMAL_REGEX = "[^\\d.]";

    private NaturalOrderComparators() {
        throw new AssertionError("Let's keep this static");
    }

    public static Comparator<String> createNaturalOrderRegexComparator() {
    	System.out.println("===========");
        return Comparator.comparingDouble(NaturalOrderComparators::parseStringToNumber);
    }

    private static double parseStringToNumber(String input){

        final String digitsOnly = input.replaceAll(DIGIT_AND_DECIMAL_REGEX, "");
        System.out.println("==============="+digitsOnly);
        if("".equals(digitsOnly)) return 0;

        try{
            return Double.parseDouble(digitsOnly);
        }catch (NumberFormatException nfe){
            return 0;
        }
    }

}