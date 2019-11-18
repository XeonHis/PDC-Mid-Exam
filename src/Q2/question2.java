package Q2;

import javafx.css.StyleOrigin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author paulalan
 * @create 2019/11/18 22:20
 */
public class question2
{
	public static void main(String[] args)
	{
		System.out.println("Please input a positive integer:");
		Scanner sc = new Scanner(System.in);
		String currentInput;
		ArrayList<Integer> store = new ArrayList<>();
		while (true)
		{
			currentInput = sc.nextLine();
			try
			{
				if (Integer.parseInt(currentInput) > 0)
				{
					int temp = Integer.parseInt(currentInput);
					for (int i = 1; i < temp; i++)
					{
						if (i % 2 != 0)
						{
							store.add(i);
						}
					}
					System.out.println((store.size() == 0) ? "None" : store.toString());
					store.clear();
				} else
				{
					System.out.println("ERROR! Please input a POSITIVE integer!");
				}
			} catch (Exception e)
			{
				System.out.println("ERROR! Please input a INTEGER! NOT String!");
			}
		}
	}
}
