package AdvanceJava.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        // String str="a";

    //     Pattern pattern=Pattern.compile("a");
    //    Matcher matcher= pattern.matcher("a");

    //    boolean matches=matcher.matches();  // true
    //    System.out.println(matches);


    //    Pattern pattern=Pattern.compile("a*b");
    //    Matcher matcher=pattern.matcher("b");
    //    boolean matches=matcher.matches();
    //    System.out.println(matches);

    // Pattern pattern=Pattern.compile("a+b");
    // Matcher matcher=pattern.matcher("aaaab");
    // boolean matches=matcher.matches();  
    // System.out.println(matches);

    

    // Pattern pattern=Pattern.compile("a,");
    // Matcher matcher=pattern.matcher("a,a,a,");
    // boolean matches=matcher.matches();  
    // System.out.println(matches);

    // Pattern pattern=Pattern.compile("java");
    // Matcher matcher=pattern.matcher("Java is java");
    // System.out.println(matcher.replaceAll("awesome"));

    Pattern pattern=Pattern.compile("Naveen Gaur");
    Matcher matcher=pattern.matcher("Naveen Gaur is a software developer");
    System.out.println(matcher.find());
    }
}
