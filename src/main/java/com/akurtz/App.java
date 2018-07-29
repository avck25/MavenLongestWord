package com.akurtz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if( args.length > 0) {
            EvaluateLongestWord elw = new EvaluateLongestWord(args[0]);
            System.out.println("longest Word(s): " + elw.getLongestWord());
            System.out.println("length: " + elw.getLength());
        }
    }
}
