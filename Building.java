package elevator;

import java.util.Scanner;

public class Building { 	
	{
		try {
			Scanner in = new Scanner(System.in);
			String input = in.next();
			int numFloors = Integer.parseInt(input);
		}
		catch (NumberFormatException exception) {
			System.out.println("Input was not a valid number.");
		}
	}
}
