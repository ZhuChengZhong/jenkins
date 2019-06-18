package com.zhu.jenkinsz;

import java.util.Random;

/**
 * random number!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	Random random=new Random();
    	int number=random.nextInt(20);
    	System.out.println("number is "+number);
    }
}
