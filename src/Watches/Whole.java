package Watches;

import java.util.Scanner;

public class Whole extends Inventory {
	private static Scanner s;

	public static void option1() {
		System.out.println("1. View Inventory");
		System.out.println("2. Adjust Inventory");
		System.out.println("3. Add stock");
		System.out.println("4. Place Orders");
		System.out.println("Choose the options:");
		try
		{
		s = new Scanner(System.in);
		int x = s.nextInt();
		switch (x) {
		case 1:
			categories();
			break;
		case 2:
			Adjust.adjust();
			break;
		case 3:
			Add.add();
			break;
		case 4:
			Remove.remove();
			break;
		default:
			System.out.println("Enter valid options");
			break;

		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		option1();

	}

}
