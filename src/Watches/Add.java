package Watches;
import Watches.*;
import java.util.HashMap;
import java.util.Scanner;

public class Add {
	public static HashMap<Integer, New> hm = new HashMap<Integer, New>();
	private static Scanner scn;
	public static void  add() {
		try
		{
		System.out.println("Number of items u want to add:");
		scn = new Scanner(System.in);
		int no = scn.nextInt();
		System.out.println("Enter the item u want to add");
		for (int i = 0; i < no; i++) {
			System.out.println("Brand:");
			scn = new Scanner(System.in);
			String Brand = scn.nextLine();
			if(hm.containsValue(Brand))
			{
				System.out.println("Quantity:");
				scn = new Scanner(System.in);
				int Quantity = scn.nextInt();
			}
			else
			{
			System.out.println("Price:");
			scn = new Scanner(System.in);
			int Price = scn.nextInt();
			System.out.println("Quantity:");
			scn = new Scanner(System.in);
			int Quantity = scn.nextInt();
			New n = new New(Brand, Price, Quantity);
			hm.put(i, n);
			}
		}
		display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Whole.option1();
	}

	static void  display() {
		System.out.println("ID \t\tBrand \t\tPrice \t\tQuantity");
		for (HashMap.Entry<Integer, New> entry : hm.entrySet()) {
			int key = entry.getKey();
			New b = entry.getValue();
			System.out.println(key + "\t\t" + b.brand + "\t\t" + b.price + "\t\t" + b.quantity);
		}

	}
}
