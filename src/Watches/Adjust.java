package Watches;
import Watches.Whole;

import java.util.Scanner;

public class Adjust extends Add
{
	private static Scanner sc;

	public static void adjust()
	{
		System.out.println("What do you want to do");
		System.out.println("1.Add Items");
		System.out.println("2.Remove Items");
		try
		{
		sc = new Scanner(System.in);
		int x2=sc.nextInt();
		switch (x2)
		{
		case 1: 
			add();
			System.out.println("Your item is added sucessfully");
			break;
		case 2:
			Remove.remove();
			break;
		default:
			System.out.println("Enter valid options");
			adjust();
			break;
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Whole.option1();
	}
	
}
