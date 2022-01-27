package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

/*
 * Copied imports from https://stackoverflow.com/questions/531371/what-are-junit-before-and-test
 *
 * Referenced https://www.w3schools.com/java/java_arrays.asp
 */

public class AppTest 
{
	@Test
	public void testSplitByComma1()
	{
		String[] words = {"Bob", "Mary", "Sue", "Jim"};
		String wordsCSV = "Bob,Mary,Sue,Jim";
		assertEquals(words, App.splitByComma(wordsCSV));
	}

	@Test
	public void testReadInLettersEng() 
	{
		String contents = App.readInLetters("EnglishLetters.txt");
		String expected = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		assertEquals(contents, expected);
	}
	
	@Test
	public void testReadInLettersEsp()
	{
		String contents = App.readInLetters("SpanishLetters.txt");
		String expected = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,s,t,u,v,w,x,y,z";
		assertEquals(contents, expected);
	}
	
	@Test
	public void testReadAndSplitEng() 
	{
		String contents = App.readInLetters("EnglishLetters.txt");
		String[] lettersArr = App.splitByComma(contents);
		String[] expected = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		assertEquals(lettersArr, expected);
	}
	
	@Test
	public void testReadAndSplitEsp() 
	{
		String contents = App.readInLetters("SpanishLetters.txt");
		String[] lettersArr = App.splitByComma(contents);
		String[] expected = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		assertEquals(lettersArr, expected);
	}

}

