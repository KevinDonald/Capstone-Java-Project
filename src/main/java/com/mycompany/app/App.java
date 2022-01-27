package com.mycompany.app;

import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

/*
 * Used https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file 
 * code for reading in String easily (copied and modified)
 *
 * https://stackoverflow.com/questions/26268132/all-inclusive-charset-to-avoid-java-nio-charset-malformedinputexception-input
 * for error checking
 *
 * https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
 * for pom file
 *
 * And a lot of Javadocs and one quick search on array length syntax (length versus length())
*/

public class App 
{
    public static void main( String[] args )
    {
	String[] letters = splitByComma(readInLetters(args[0]));

	for (int i = 0; i < letters.length; ++i)
	{
		System.out.println(letters[i]);
	}
    }

    public static String readInLetters(String fileName)
    {
	try
	{
		// The below line is from StackOverflow, copied and modified
		return Files.readString(Paths.get(fileName), StandardCharsets.UTF_8).trim();
	}
	catch (IOException e)
	{
		System.out.println("Please specify file path in args: e.g., java App.java \"nameOfFile.txt\".");
		System.out.println(e);
	}
	return null;
    }

    public static String[] splitByComma(String input)
    {
	return input.split(",");
    }
}
