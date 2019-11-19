package Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author paulalan
 * @create 2019/11/18 22:14
 */
public class question1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 integers (split by ,):");
		String input = sc.nextLine();
		String[] splited = input.split(",");
		int[] operated=new int[splited.length];
		for (int i = 0; i < splited.length; i++)
		{
			operated[i]=Integer.parseInt(splited[i]);
		}
		Arrays.sort(operated);
		System.out.println("Sorted output: "+ Arrays.toString(operated));
	}
}
