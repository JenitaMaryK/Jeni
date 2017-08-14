package Watches;

import java.util.HashMap;
import java.util.Scanner;

public class Remove extends Inventory {
	private static Scanner sc;
	//private static Scanner s1;

	public static void remove()
	{
		try
		{
		int siz = hm.size();
		if (siz == 0) {
			System.out.println("There is no item to view in the inventory");
			add();
			display();
		}
		
		System.out.println("Select item to place order");
		display();
		System.out.println("Brand:");
		sc = new Scanner(System.in);
		String Brand = sc.nextLine();
		System.out.println("No of items");
		sc = new Scanner(System.in);
		int noItem=sc.nextInt();
		if(noItem<5)
		{
		for (HashMap.Entry<Integer, New> entry : hm.entrySet()) {
			int key = entry.getKey();
			New b = entry.getValue();
			if(b.brand.equalsIgnoreCase(Brand) && (noItem<=b.quantity))
				b.quantity=b.quantity-noItem;
			else if(noItem>b.quantity)
				System.out.println("No sufficient Items");
			else 
				System.out.println("Enter correct brand name");
			
		}
		for (HashMap.Entry<Integer, New> entry : hm.entrySet()) {
			int key = entry.getKey();
			New b = entry.getValue();
			if(b.quantity==0)
				hm.remove(b);
			System.out.println(key + "\t\t" + b.brand + "\t\t" + b.price + "\t\t" + b.quantity);
		}
		}
		else
		{
			System.out.println("Please enter a number less than 5");
			remove();
			
		}
				
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
		Whole.option1();
	}

}
