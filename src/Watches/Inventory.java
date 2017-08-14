package Watches;

import java.util.Scanner;

public class Inventory extends Add {
	private static Scanner ss;

	public static void categories() {
		try {
			int siz = hm.size();
			if (siz == 0) {
				System.out.println("There is no item to view in the inventory");
				add();

			} else {
				display();
			}
			Whole.option1();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
