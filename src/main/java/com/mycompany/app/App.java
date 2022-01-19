package com.mycompany.app;

public class App 
{
    public static void main( String[] args )
    {
        String test = "baby,toddler,child,teen,adult,elderly";
	String[] items = test.split(",");

	for (int i = 0; i < items.length; ++i)
	{
		System.out.println(items[i]);
	}
    }
}
