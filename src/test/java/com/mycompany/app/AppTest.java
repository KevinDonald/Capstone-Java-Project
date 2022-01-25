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
}
