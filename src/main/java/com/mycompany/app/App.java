package com.mycompany.app;

import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

/*
 * Used https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file 
 * code for reading in String easily
 *
 * https://stackoverflow.com/questions/26268132/all-inclusive-charset-to-avoid-java-nio-charset-malformedinputexception-input
 * for error checking
 *
 * And a lot of Javadocs and one quick search on array length
*/

public class App 
{
    public static void main( String[] args )
    {
	try
	{
		String csvLetters = Files.readString(Paths.get(args[0]), StandardCharsets.UTF_8);
		String[] items = csvLetters.split(",");

		for (int i = 0; i < items.length; ++i)
		{
			System.out.println(items[i]);
		}
	}
	catch (IOException e)
	{
		System.out.println("Please specify file path in args: e.g., java App.java \"nameOfFile.txt\".");
		System.out.println(e);
	}
    }
}
